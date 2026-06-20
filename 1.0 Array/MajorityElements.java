import java.util.Arrays;

class MajorityElements {

    public static int bruteForce(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int frequency = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    frequency++;
                }
            }
            if (frequency > (n / 2)) {
                return arr[i];
            }
        }

        return -1;
    }

    public static int usingSortedArray(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int curElm = arr[0];
        int frequency = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == arr[i]) {
                frequency++;
            } else {
                curElm = arr[i];
                frequency = 1;
            }
            if (frequency > (n / 2)) {
                return arr[i];
            }
        }

        return -1;
    }

    public static int mooresAlgo(int[] arr) {
        int n = arr.length;

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 2, 1, 1, 1 };
        System.out.println(mooresAlgo(arr));
    }
}