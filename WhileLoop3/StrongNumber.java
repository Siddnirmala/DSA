package WhileLoop.WhileLoop3;

public class StrongNumber {
    public static void main(String[] args) {
        checkStrongNumber(145);


    }
    public static void checkStrongNumber(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int prev = n % 10;
            int fact = 1;
            while (prev > 0) {
                fact = fact * prev;
                prev--;
            }
            sum = sum + fact;
            n /= 10;
        }
        if (sum == original)
            System.out.println(original + ": is Strong");
        else
            System.out.println(original + ": is not a Strong");
    }
}
