class Solution {
    public int fib(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacciCalculate(n, 0, 1, 1);

    }

    private int fibonacciCalculate(int n, int a, int b, int i) {
        if (i == n) {
            return b;
        }

        return fibonacciCalculate(n, b, a + b, i + 1);
    }
}
