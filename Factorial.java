class Factorial {

    private int factorial_recursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial_recursive(n - 1);
    }

    private int factorial_iterative(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public int factorial(int n, String type) {
        if (type.equals("iterative")) {
            return factorial_iterative(n);
        } else {
            return factorial_recursive(n);
        }
    }
}