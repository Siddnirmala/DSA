package WhileLoop.WhileLoop3;

public class SumOfEachDigitFactorial {
    public static void main(String[] args) {
        System.out.println(getSumOfEachDigitFactorial(42065));
    }

    public static int getSumOfEachDigitFactorial(int n){
        int sum = 0;
        while (n > 0){
            int prev = n%10;
            int fact = 1;
            while(prev > 0){
                fact = fact*prev;
                prev--;
            }
            sum = sum + fact;
            n/=10;
        }
        return sum;
    }
}
