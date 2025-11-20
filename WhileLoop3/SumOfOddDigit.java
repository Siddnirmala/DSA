package WhileLoop.WhileLoop3;

public class SumOfOddDigit{
    public static void main(String[] args) {
        System.out.println(getSumOfOddDigit(42763));
    }

    public static int getSumOfOddDigit(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            if (rem%2!=0)
                sum=sum+rem;
            n/=10;

        }
        return sum;
    }
}
