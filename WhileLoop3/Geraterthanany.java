package WhileLoop.WhileLoop3;

public class Geraterthanany {
    public static void main(String[] args) {
        prntGreaterOrEqual(43705);

    }

        public static void prntGreaterOrEqual(int n){
            while (n>0){
                int rem = n%10;
                if (rem>=5)
                    System.out.println(rem);
                n/=10;
            }
        }
}

