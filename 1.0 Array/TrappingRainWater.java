class TrappingRainWater {

    public static int solution(int[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = arr[0];
        rightMax[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int water = Math.min(leftMax[i], rightMax[i]) - arr[i];
            sum = sum + water;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 20, 3, 4, 5 };
        System.out.print(solution(arr));
    }
}