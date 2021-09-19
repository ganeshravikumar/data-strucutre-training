package data.structure.recursion;

public class Factorial {

    public static void main(String[] args[]) {
        int n = 0;
        int output = factorialRecursion(n);
        System.out.print(output);
    }

    static int factorialRecursion(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }
}
