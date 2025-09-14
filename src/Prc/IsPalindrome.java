package Prc;

public class IsPalindrome {

    public static void main(String[] args) {

        String tr = "Madam";
        String str = tr.toLowerCase();
        boolean isPalindrome = false;

        char a[] = new char[str.length()];
        char r[] = new char[str.length()];

        // Copy forward
        for (int i = 0; i < a.length; i++) {
            a[i] = str.charAt(i);
        }

        // Copy backward
        for (int j = str.length() - 1; j >= 0; j--) {
            r[str.length() - 1 - j] = str.charAt(j);
        }


        for(int z = 0 ; z < str.length() ; z++){
            if(a[z]!=r[z]){
                isPalindrome = false;

              break;
            }
            isPalindrome = true;


        }
        System.out.println(isPalindrome);

    }
}
