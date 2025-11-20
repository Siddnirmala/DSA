package WhileLoop.WhileLoop3;

public class BiggestDigit {
        public static void main(String[] args) {
            int BiggestDigit = prntBiggestDigit(43705);
            System.out.println(BiggestDigit);
        }

        public static int prntBiggestDigit(int n) {
            int Big = n % 10;
            while (n > 0) {
                int rem = n % 10;
                if (Big < rem)
                    Big = rem;
                n /= 10;
            }
            return Big;
        }

}
