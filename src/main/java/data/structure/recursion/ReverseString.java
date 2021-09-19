package data.structure.recursion;

public class ReverseString {

    public static void main(String args[]) {
        String str ="hello";
        reverse(str);
        System.out.print(reverse(str));
    }
    static String reverse(String str){

        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
