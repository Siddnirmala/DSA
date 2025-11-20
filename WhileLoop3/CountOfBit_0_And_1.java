package WhileLoop.WhileLoop3;

public class CountOfBit_0_And_1 {
    public static void main(String[] args) {
        getCountOf_0_And_1(20);
    }

    public static void getCountOf_0_And_1(int n) {
        int count1 = 0;
        int count0 = 0;
        while (n > 0){
            int bit = n%2;
            if (bit == 1) {
                count1++;
            }else
                count0++;
            n/=2;
        }
        System.out.println("Number of 0 Bits :"+ count0);
        System.out.println("Number of 1 Bits :"+ count1);
    }
}