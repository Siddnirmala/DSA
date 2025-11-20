package WhileLoop.WhileLoop3;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(getSumOfDigit(4207065));
    }

    public static int getSumOfDigit(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum=sum+rem;
            n/=10;

        }
        return sum;
    }
}
