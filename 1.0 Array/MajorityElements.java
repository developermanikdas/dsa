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

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        System.out.println(bruteForce(arr));
    }
}