package WhileLoop.WhileLoop3;

public class PalindromNumber {
    public static void main(String[] args) {
        checkPalindromeNumber(34843);
    }
    public static void checkPalindromeNumber(int n){
        int Original = n;
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        if (rev == Original){
            System.out.println("Given Number is Palindrome");
        }else
            System.out.println("Given Number is not Palindrome");
    }
}
