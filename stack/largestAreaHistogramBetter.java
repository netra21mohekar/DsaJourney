import java.util.Stack;

public class largestAreaHistogramBetter {

    public int[] previousSmall(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int array[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            array[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return array;
    }

    public int[] nextSmall(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int array[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            array[i] = s.isEmpty() ? arr.length : s.peek();
            s.push(i);
        }
        return array;
    }

    public void largestArea(int arr[]) {
        int[] prevSmall = previousSmall(arr);
        int[] nextSmall = nextSmall(arr);
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            curr += (i - prevSmall[i] - 1) * arr[i];
            curr += (nextSmall[i] - i - 1) * arr[i];

            res = Math.max(res, curr);
        }

        System.out.println("The Largest Area of Histogram is " + res);
    }

    public static void main(String[] args) {
        int arr[] = {6,2,5,4,1,5,6};
        largestAreaHistogramBetter b = new largestAreaHistogramBetter();
        b.largestArea(arr);
    }
}
