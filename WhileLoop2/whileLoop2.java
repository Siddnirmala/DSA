package WhileLoop.WhileLoop2;

import java.util.Scanner;

public class whileLoop2{
    public static void main(String[] args) {
        int n = 100;
        int i = 1;
        int count = 0;
        while(i<=n){
            count = count +  i;
            i++;
        }
        System.out.println(count);
    }
}

class P2 {
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        int count = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                count = count + i;
            }
            i++;
        }
        System.out.println(count);
    }
}

class P3{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        int count = 0;
        while (i <= n){
            if (i%2 != 0){
                count = count + i;
            }
            i++;
        }
        System.out.println(count);
    }
}

class P4{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        int count = 0;
        while (i <= n){
                count = count + i*i;

            i++;
        }
        System.out.println(count);
    }
}
class P5{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        int count = 0;
        while(i <= n){
            if(i%2==0){
                count = count+i*i;
            }
            i++;
        }
        System.out.println(count);
    }
}
class P6{
    public static void main(String[] args) {
        int i=1;
        int n = 100;
        int count = 0;
        while(i <= n){
            if(i%2==0){
                count = count+i*i*i;
            }
            i++;
        }
        System.out.println(count);
    }
}

class P7{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        int count = 0;
        while(i<=n){
            if(i%2 != 0){
                count = count + i*i;
            }
            i++;
        }
        System.out.println(count);
    }
}
class P8{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        int count = 0;
        while(i<=n){
            if(i%2 != 0){
                count = count + i*i*i;
            }
            i++;
        }
        System.out.println(count);
    }
}

class P9{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        int count = 0;
        while(i<=n){
            count = count + (i*(i+1));
        i++;
        }
        System.out.println(count);
    }
}

class P10{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        int count = 0;
        while(i<=n){
            count = count + (i*(i+1)*(i+1));
            i++;
        }
        System.out.println(count);
    }
}

class P11{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        int count = 0;
        while(i<=n){
            count = count + (i*i*(i+1));
            i++;
        }
        System.out.println(count);
    }
}

class P12{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        double count = 0;
        while(i<=n){
            count = count + 1.0/i; //remember here in this question I stored the value in int datatype that's why I got error so, I replace count's datatype from "int" to "Double".
            i++;
        }
        System.out.println(count);
    }
}
class P13{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        double count = 0;
        while(i<=n){
            if(i%2 == 0) {
                count = count + 1.0 / i;
            }
            i++;
        }
        System.out.println(count);
    }
}

class P14{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        double count = 0;
        while(i<=n){
            if (i%2 != 0) {
                count = count + 1.0 / (i);
            }
            i++;
        }
        System.out.println(count);
    }
}
class P15{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        double count = 0;
        while(i<=n){
                count = count + 1.0 / (i*i);
            i++;
        }
        System.out.println(count);
    }
}
class P16{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        double count = 0;
        while(i<=n){
            count = count + 1.0 / (i*i*i);
            i++;
        }
        System.out.println(count);
    }
}
class P17{
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        double count = 0;
        while(i<=n){
            count = count + 1.0 / (i+(i+1));
            i++;
        }
        System.out.println(count);
    }
}
class P18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int count = 1;
        while(i < n){
            count = count * (n-i);
            i++;
        }
        System.out.println(count);
    }
}
class p19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;
        int i = 1;
        while (i<=b){
            count = count * a;
            i++;
        }
        System.out.println(count);

    }
}

class P20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int count = 0;
        while(i<n){
            if(n%i == 0){
                count = count + i;
            }
            i++;
        }
        System.out.println(count);

    }
}

class P21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int count = 0;
        while(i<n){
            if(n%i == 0){
                count = count + i;
            }
            i++;
        }
        System.out.println(count);
        if (count == n){
            System.out.println(n+": is a perfect number");
        }else {
            System.out.println(n + " : Not a Perfect Number");
        }

    }
}

class P26 {
    public static int kthFactor(int n, int k) {
        int i = 1;
        int count = 0;
        int arr []  = new int[n];
        while(i<n){
            if(n%i == 0){
               arr[count] = i;
               count++;
            }
            i++;
        }
        if(k<=count){
            return arr[k-1];
        }
        else{
        return -1;
        }

    }

    public static void main(String[] args) {
       int result = kthFactor(12,2);
        System.out.println(result);
    }
}




