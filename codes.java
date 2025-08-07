public class codes{

    // Method to calculate power
    public static long power(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;

        long ans = power(base, exponent);
        System.out.println(ans);
    }
}


