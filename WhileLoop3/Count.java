package WhileLoop.WhileLoop3;

public class Count {
        public static void main(String[] args) {
        int TotalDigit = prntCountDigit(43705);
        System.out.println(TotalDigit);
    }

        public static int prntCountDigit(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }


}
