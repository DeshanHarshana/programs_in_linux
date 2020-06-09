public class fib {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int fib1 = 1;
            int fib2 = 1;
            int fib3 = 0;
            
            for (int i = 3; i <= n; i++) {
                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;

            }
            return fib3;
        }
    }
}