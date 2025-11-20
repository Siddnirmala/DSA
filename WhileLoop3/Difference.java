package WhileLoop.WhileLoop3;

public class Difference {

        public static void main(String[] args) {
        int result = prntDiffernce(42375);
        System.out.println(result);
    }

        public static int prntDiffernce(int n) {
        int Big = n % 10;
        int Small = n%10;
        while (n > 0) {
            int rem = n % 10;
            if (Big < rem)
                Big = rem;
            if (Small > rem)
                Small = rem;
            n /= 10;
        }
        return Big - Small;
    }


}
