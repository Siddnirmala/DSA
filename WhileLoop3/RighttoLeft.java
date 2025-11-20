package WhileLoop.WhileLoop3;

public class RighttoLeft {
    public static void main(String[] args) {
        prntRighttoLeft(43705);
    }

    public static void prntRighttoLeft(int n){
        int rem = 0;
        while(n>0){
            rem = n%10;
            System.out.print(rem);
            n=n/10;
        }
    }


}
