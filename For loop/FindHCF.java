package WhileLoop.For_Loop;

import java.util.Scanner;

public class FindHCF {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(getHCF(a, b, c));
        }

        public static int getHCF (int a, int b, int c){
            int small = (a<b&&a<c)?a:(b<c?b:c);
            for (int i = small; ; i--){
                if(a%i == 0 && b%i == 0 && c%i == 0)
                    return i;
            }
        }

}