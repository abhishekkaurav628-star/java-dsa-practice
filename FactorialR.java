public class FactorialR {

    public static int calfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact_n = calfactorial(n - 1);
        int var = n * fact_n;
        return var;
    }

    public static void main(String[] args) {
        int n = 5;
        int val = calfactorial(n);
        System.out.println(val);

    }

}
