package WhileLoop.WhileLoop3;

public class SumOfEvenDigit{
    public static void main(String[] args) {
        System.out.println(getSumOfEvenDigit(42765));
    }

    public static int getSumOfEvenDigit(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            if(rem%2==0)
                sum=sum+rem;
            n/=10;

        }
        return sum;
    }
}
