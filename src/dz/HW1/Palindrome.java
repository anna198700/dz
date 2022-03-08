package dz.HW1;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        String amount = Integer.valueOf(x).toString();
        return amount.equals(new StringBuilder(amount).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(123321));

    }
}

