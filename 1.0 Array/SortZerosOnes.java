public class SortZerosOnes {

    public static void bruteForce(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        for (int elm : arr) {
            System.out.println(elm);
        }
    }

    public static void optimised1(int[] arr) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (int elm : arr) {
            if (elm == 0) {
                zeros++;
            } else if (elm == 1) {
                ones++;
            } else {
                twos++;
            }
        }

        // System.out.println(zeros + " " + ones + " " + twos);

        int idx = 0;

        for (int i = 0; i < zeros; i++) {
            arr[idx++] = 0;
        }
        for (int i = 0; i < ones; i++) {
            arr[idx++] = 1;
        }
        for (int i = 0; i < twos; i++) {
            arr[idx++] = 2;
        }

        for (int elm : arr) {
            System.out.println(elm);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void DNF(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, high, mid);
                high--;

            }
        }

        for (int elm : arr) {
            System.out.println(elm);
        }
    }

    // public static void DNF(int[] arr) {
    //     int low = 0, mid = 0, high = arr.length - 1;

    //     while (mid <= high) {
    //         if (arr[mid] == 0) {
    //             swap(arr, low, mid);
    //             low++;
    //             mid++;
    //         } else if (arr[mid] == 1) {
    //             mid++;
    //         } else {
    //             swap(arr, mid, high);
    //             high--;
    //         }
    //     }

    //     for (int elm : arr) {
    //         System.out.print(elm + " ");
    //     }
    // }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0, 0 };
        // bruteForce(arr);
        // optimised1(arr);
        DNF(arr);
    }
}
