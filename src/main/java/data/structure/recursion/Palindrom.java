package data.structure.recursion;

public class Palindrom {

    public static void main(String args[]) {
        String str = "maddam";

        boolean result = palindrom(str);
        System.out.print(result);
    }

    static boolean palindrom(String str) {
        System.out.println(str);

            if (str.length() <=2) {
                if (str.charAt(0) == str.charAt(str.length() - 1)) {
                    return true;
                }
                return false;
            }
          return  palindrom(str.substring(1, str.length() - 1));

    }
}
