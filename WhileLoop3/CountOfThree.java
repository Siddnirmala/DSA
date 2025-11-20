package WhileLoop.WhileLoop3;

public class CountOfThree{
    public static void main(String[] args) {
        int TotalCount = getCountOfThree(4373533);
        System.out.println(TotalCount);
    }

    public static int getCountOfThree(int n){
        int count = 0;
        while(n>0){
            int rem = n%10;
            if (rem == 3)
                count++;
            n/=10;
        }
        return count;
    }
}

