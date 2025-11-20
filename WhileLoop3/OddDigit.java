package WhileLoop.WhileLoop3;

public class OddDigit{
    public static void main(String[] args) {
        int TotalCount = getCountOfOddDigit(42765);
        System.out.println(TotalCount);
    }

    public static int getCountOfOddDigit(int n){
        int count = 0;
        while(n>0){
            int rem = n%10;
            if (rem%2!=0)
                count++;
            n/=10;
        }
        return count;
    }
}
