class InsertionSort {
    public static void solution(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Store the actual value, not the index
            int prev = i - 1;

            // Compare against the stored 'key' instead of 'arr[cur]'
            while (prev >= 0 && key < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insert the stored key into its correct position
            arr[prev + 1] = key;
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 7, 1 };
        solution(arr);
    }
}