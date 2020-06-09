public class fib_tail_rec {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    static int fibonacci(int n) {
        return fib(n, 1);
    }

    static int fib(int n, int k) {
        if (n == 1 || n == 2) {
            return k;
        } else {

            return fib(n - 1, k) + fib(n - 2, k);
        }
    }
}