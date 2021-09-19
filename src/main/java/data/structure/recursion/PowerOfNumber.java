package data.structure.recursion;

public class PowerOfNumber {

    public static void main(String args[]) {
        int base = 4;
        int exp=2;

        System.out.print(powerOfNum(base,exp));
    }
    static int powerOfNum(int base, int exp){
        if(base<=0||exp<=0){
            return 0;
        }
        if(exp==1){
            return base;
        }
        return base*powerOfNum(base, exp-1);
    }
}
