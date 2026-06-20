
class MaxSubarraySum {

    public static void bruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(" The max sum is => " + maxSum);
    }

    public static void prefixArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        int[] prefixArr = new int[n];
        prefixArr[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixArr[i] = arr[i] + prefixArr[i - 1];
        }

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {

                int sum = (start == 0) ? prefixArr[end] : (prefixArr[end] - prefixArr[start - 1]);

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(" The max sum is => " + maxSum);
    }

    public static int kadane(int[] arr) {
        int maxSum = arr[0];
        int curSum = 0;

        for (int i = 0; i < arr.length; i++) {

            curSum = arr[i]+curSum;            
            maxSum = Math.max(maxSum, curSum);  
            if(curSum < 0){
                curSum = 0; 
            }  
            System.out.println(curSum + " " + maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -2, -3, -4, 5 };
        // bruteForce(arr);
        // prefixArray(arr);
        System.out.print(kadane(arr));

    }
}

