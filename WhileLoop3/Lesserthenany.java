package WhileLoop.WhileLoop3;

public class Lesserthenany {
    public static void main(String[] args) {
        int Total = prntLesserOrEqual(42765);
        System.out.println(Total);

    }

    public static int prntLesserOrEqual(int n){
        int count = 0;
        while (n>0){
            int rem = n%10;
            if (rem<=5)
                count++;
            n/=10;
        }
        return count;
    }
}
