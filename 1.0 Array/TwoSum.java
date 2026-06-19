import java.util.HashMap;

class TwoSum {

    public static int[] bruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        
        return new int[] { -1, -1 };
    }

    public static int[] usingHashMap(int[] arr, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            values.put(arr[i], i);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int needed = target - arr[i];
            if (values.containsKey(needed) && values.get(needed) != i) {
                return new int[] { i, values.get(needed) };
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] hashMapOptimized(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int needed = target - arr[i];
            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 7 };

        // int[] result = bruteForce(arr, 3);
        // System.out.println("[" + result[0] + ", " + result[1] + "]");

        int[] result = hashMapOptimized(arr, 12);
        System.out.println(result[0] + " " + result[1]);
    }
}