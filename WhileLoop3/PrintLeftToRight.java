package WhileLoop.WhileLoop3;

public class PrintLeftToRight {
    public static void main(String[] args) {
        getLeftToRightEachDigit(43705);
        System.out.println("======================================");
        getLeftToRightEachDigitWithbuiltin(43705);

    }

    public static void getLeftToRightEachDigit(int n){
        int count = (n+"").length();
        while (count > 0){
            int digit = (n/(int)Math.pow(10,count-1))%10;
            count--;
            System.out.println(digit);
        }
    }
    public static int getCount(int n){
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

    public static int getPower(int a,int b){
        int power = 1;
        int i = 1;
        while(b>=i){
            power = power * a;
            i++;
        }
        return power;
    }

    public static void getLeftToRightEachDigitWithbuiltin(int n) {
        int count = getCount(n);
        while (count > 0) {
            int digit = (n / getPower(10, count - 1)) % 10;
            count--;
            System.out.println(digit);
        }
    }

}
