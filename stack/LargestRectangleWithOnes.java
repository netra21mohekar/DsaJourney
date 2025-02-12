import java.util.Stack;

public class LargestRectangleWithOnes {

    // Function to calculate the largest rectangular area in a histogram (1D array)
    public int result(int arr[], int c) {
        Stack<Integer> s = new Stack<>();
        int res = 0;

        for (int i = 0; i < c; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                int ps = s.pop();
                int curr = arr[ps] * (s.isEmpty() ? i : (i - s.peek() - 1));
                res = Math.max(res, curr);
            }
            s.push(i);
        }

        // Process remaining elements in stack
        while (!s.isEmpty()) {
            int ps = s.pop();
            int curr = arr[ps] * (s.isEmpty() ? c : (c - s.peek() - 1));
            res = Math.max(res, curr);
        }

        return res;
    }

    // Function to find the largest rectangle in a binary matrix (2D array)
    public void largestRectangle(int arr[][], int r, int c) {
        int res = result(arr[0], c); // Compute max area for the first row

        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] += arr[i - 1][j]; // Modify the original matrix
                }
            }
            res = Math.max(res, result(arr[i], c)); // Compute max area for updated row
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[][] = {
                {0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0}
        };

        int r = arr.length;
        int c = arr[0].length;

        LargestRectangleWithOnes l = new LargestRectangleWithOnes();
        l.largestRectangle(arr, r, c);
    }
}
