import java.util.Scanner;

public class firstDay {

    // Nested Solution class
    class Solution {
        public int getSecondLargest(int[] arr) {
            if (arr.length < 2) {
                return -1; // If array has less than 2 elements, no second largest exists
            }

            int largest = 0;
            int res = -1;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[largest]) {
                    res = largest;
                    largest = i;
                } else if (arr[i] != arr[largest]) {
                    if (res == -1 || arr[i] > arr[res]) {
                        res = i;
                    }
                }
            }
            return (res != -1) ? arr[res] : -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create an instance of firstDay to access its inner class Solution
        firstDay firstDayInstance = new firstDay();
        Solution solution = firstDayInstance.new Solution();

        // Call the function
        int secondLargest = solution.getSecondLargest(arr);

        // Output result
        System.out.println("Second Largest Element: " + secondLargest);

        scanner.close();
    }
}
