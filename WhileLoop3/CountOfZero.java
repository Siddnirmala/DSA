package WhileLoop.WhileLoop3;

public class CountOfZero {
    public static void main(String[] args) {
        int TotalCount = getCountOfZero(430705);
        System.out.println(TotalCount);
    }

    public static int getCountOfZero(int n){
        int count = 0;
        while(n>0){
            int rem = n%10;
            if (rem == 0)
                count++;
            n/=10;
        }
        return count;
    }
}
