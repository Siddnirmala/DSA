package WhileLoop.WhileLoop3;

public class EachFactorial {
    public static void main(String[] args){
        getEachFactorial(42065);
    }
    public static void getEachFactorial(int n){
        while(n > 0){
            int prev = n%10;
            int fact = 1;
            while(prev>0){
                fact = fact * prev;
                prev = prev-1;
            }
            n/=10;
            System.out.println(fact);
        }
    }
}
