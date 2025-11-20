package WhileLoop.WhileLoop3;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(getReverseNumber(3745));
    }
    public static int getReverseNumber(int n){
        int rev = 0;
        while(n>0){
            rev = rev * 10 + n%10;
            n/=10;
        }
        return rev;
    }
}
