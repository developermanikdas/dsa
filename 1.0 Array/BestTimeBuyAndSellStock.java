public class BestTimeBuyAndSellStock {

    public static int bruteForce(int[] arr) {
        int n = arr.length;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = (arr[j] - arr[i]);
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        if (maxProfit < 0) {
            return 0;
        } else {
            return maxProfit;
        }
    }

    public static int optimal(int[] arr) {
        int n = arr.length;

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {

            int curProfit = arr[i] - minPrice;
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, curProfit);

        }
        return maxProfit;

    }

    public static void main(String args[]) {
        int[] arr = { 7, 6, 15, 4, 3, 2, 81 };
        System.out.println(optimal(arr));
    }
}
