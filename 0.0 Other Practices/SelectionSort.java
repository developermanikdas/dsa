class SelectionSort {

    public static void ascending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int minValue = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = minValue;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void descending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max_index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max_index]) {
                    max_index = j;
                }
            }

            int maxValue = arr[max_index];
            arr[max_index] = arr[i];
            arr[i] = maxValue;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1,1, 3, 2, 9 };
        // ascending(arr);
        descending(arr);
    }

}
