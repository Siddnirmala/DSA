package WhileLoop.WhileLoop3;

public class evenRighttoLeft {
    public static void main(String[] args) {
        prntEvenRighttoLeft(43705);
    }

    public static void prntEvenRighttoLeft(int n){
        while (n>0){
            int rem = n%10;
            if (rem%2==0)
                System.out.println(rem);
            n/=10;
        }
    }
}
