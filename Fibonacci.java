class Fibonacci {

    private int fibonacci_recursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
    }

    private int fibonacci_iterative(int n) {
        if (n <= 1) {
            return n;
        }

        // Keep track of the last two values in the sequence
        int prevFib = 1;
        int fib = 1;

        int result = 0;

        for (int i = 2; i < n; i++) {
            result += fib;
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public int fibonacci(int n, String type) {
        if (type.equals("iterative")) {
            return fibonacci_iterative(n);
        } else {
            return fibonacci_recursive(n);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci_iterative(4));
    }
}