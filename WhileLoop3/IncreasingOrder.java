package WhileLoop.WhileLoop3;

public class IncreasingOrder {
    public static void main(String[] args) {
        System.out.println(checkIncreasing(2586));
    }
    public static boolean checkIncreasing(int n){
        int prev = n%10;
        n=n/10;
        while (n > 0) {
            int Next = n%10;
            if (prev>Next)
                return false;
            prev = Next;
            n /=10;
        }
        return true;
    }
}
