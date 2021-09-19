package data.structure.recursion;

public class Fibonnoci {

    public static void main(String args[]) {
        int n=4;
        int output = fibonnociRecursion(n);
        System.out.print(output);

    }

    private static int fibonnociRecursion(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n+fibonnociRecursion(n-1);
    }
}
