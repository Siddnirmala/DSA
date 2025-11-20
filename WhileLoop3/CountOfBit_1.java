package WhileLoop.WhileLoop3;

public class CountOfBit_1 {
    public static void main(String[] args) {
        System.out.println(getCountbit1(20));

    }
    public static int getCountbit1(int n){
        int count = 0;
        while(n>0){
            int bit = n%2;
            if (bit == 1)
            count++;
            n/=2;
        }
        return count;
    }
}
