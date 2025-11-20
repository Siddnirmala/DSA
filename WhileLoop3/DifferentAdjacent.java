package WhileLoop.WhileLoop3;

public class DifferentAdjacent {
    public static void main(String[] args) {
        System.out.println(checkDifferentAdjacent(7262252));
    }

    public static boolean checkDifferentAdjacent(int n){
        int prev = n%10;
        n/=10;
        while(n>0){
            int next = n%10;
            if (prev == next)
                return false;
            prev = next;
            n/=10;
        }
        return true;
    }
}
