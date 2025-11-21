package WhileLoop.For_Loop;

import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(getLCM(a,b,c));

    }
    public static int getLCM (int a, int b, int c){
        int big = (a>b&&a>c)?a:(b>c?b:c);
        for (int i = big; ; i+=big){
            if(i%a == 0 && i%b == 0 && i%c == 0)
                return i;
        }
    }
}
