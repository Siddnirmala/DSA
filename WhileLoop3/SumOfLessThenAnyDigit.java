package WhileLoop.WhileLoop3;

public class SumOfLessThenAnyDigit {
    public static void main(String[] args) {
        System.out.println(getSumOfLessThenDigit(42765));
    }

    public static int getSumOfLessThenDigit(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            if (rem<=5)
                sum=sum+rem;
            n/=10;

        }
        return sum;
    }
}
