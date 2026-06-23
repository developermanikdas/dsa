class ContainerWithMostWater {

    public static void bruteForce(int[] arr) {
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int width = j - i;
                int height = Math.min(arr[i], arr[j]);
                int area = width * height;
                maxArea = Math.max(area, maxArea);
            }
        }
        System.out.println(maxArea);
    }

    public static void optimal(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        int maxArea = 0;

        while (left < right) {

            int width = right - left;
            int height = Math.min(arr[left], arr[right]);
            int area = width * height;

            maxArea = Math.max(area, maxArea); 

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 7, 4, 3, 6 };
        bruteForce(arr);
        optimal(arr);
    }
}
