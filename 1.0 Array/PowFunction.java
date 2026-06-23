public class PowFunction {

    public static int pow(int m, int n) {

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return m;
        }
        
        int halfPow = pow(m, n / 2);

        if (n % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return m * halfPow * halfPow;
        }

    }

    public static void main(String[] args) {
        System.out.println(pow(4, 0));
    }
}
