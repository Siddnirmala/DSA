package WhileLoop.WhileLoop3;

public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.println(getProductOfDigit(9735));
    }

    public static String getProductOfDigit(int n){
        int Product = 1;
        while (n > 0) {
            int rem = n%10;
            Product = Product*rem;
            n/=10;
        }
      return Product%2==0?"Even":"Odd";
    }

}
