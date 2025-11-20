package WhileLoop.WhileLoop3;

public class CountBits {
    public static void main(String[] args) {
        System.out.println(getCountbit(20));

    }
        public static int getCountbit(int n){
            int count = 0;
            while(n>0){
//                int bit = n%2;
                count++;
                n/=2;
            }
            return count;
        }
    }
