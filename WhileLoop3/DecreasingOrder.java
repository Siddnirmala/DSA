package WhileLoop.WhileLoop3;

public class DecreasingOrder {
    public static void main(String[] args) {
        System.out.println(checkDecreasingOrder(7612));
    }

    public static boolean checkDecreasingOrder(int n){
        int prev = n%10;
        n/=10;
        while(n>0){
            int Next = n%10;
            if (Next < prev)
                return false;
            prev = Next;
            n/=10;
        }
        return true;
    }
}
