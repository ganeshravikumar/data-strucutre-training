package data.structure.recursion;

public class SumOfDigitsOfNumbers {

    public static void main(String[] args) {
        int n=5551231;
        int output= sumOfDigits(n);
        System.out.print(output);
    }

    private static int sumOfDigits(int n) {
        if(n<=0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }


}
