class FindMissingAndRepeatedValues {

    public static void solution(int[][] grid) {

        int n = grid.length;
        int[] checkList = new int[n * n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int currentNumber = grid[i][j];
                checkList[currentNumber]++;
            }
        }
        for (int i = 1; i < checkList.length; i++) {
            System.out.println(i + " appears " + checkList[i] + "times.");
        }

        int repeated = -1;
        int missing = -1;

        for (int i = 1; i <= n * n; i++) {
            if (checkList[i] == 2) {
                repeated = i;
                System.out.println("Repeated " + repeated);

            } else if (checkList[i] == 0) {
                missing = i;
                System.out.println("Missing " + missing);

            }
        }

    }

    public static void main(String[] args) {
        int[][] grid = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
        solution(grid);
    }
}