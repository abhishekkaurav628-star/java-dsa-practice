public class power {
    public static int calpow(int x, int n) {
        if (n == 1) {
            return 1;

        }
        if (x == 0) {
            return 0;

        }
        int calpowernm1 = calpow(x, n - 1);
        int xpow = x * calpowernm1;
        return xpow;
    }

    public static void main(String[] args) {
        int x = 2, n = 3;

        int var = calpow(x, n);
        System.out.println(var);

    }

}
