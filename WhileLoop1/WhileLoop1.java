package WhileLoop.WhileLoop1;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }
}
class rob2{
    public static void main(String[] args) {
        int i = 10;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}
class prob3{
    public static void main(String[] args) {
        int i = 1;
        while (i<=100){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
class prob4{
    public static void main(String[] args) {
        int i = 1;
        while (i<=100){
            if (i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}
class prob5{
    public static void main(String[] args) {
        int i = 1;
        while (i<=100){
            if (i%7 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
class prob6{
    public static void main(String[] args) {
        int i = 1;
        while (i<=100){
            if (i%7 == 0 || i%10 == 7){
                System.out.println(i);
            }
            i++;
        }
    }
}
class prob7{
    public static void main(String[] args) {
        int i = 1;
        while (i<=1000){
            if (i%7 == 0 || i%10 == 7){
                System.out.println(i);
            }
            i++;
        }
    }
}
class prob8{
    public static void main(String[] args) {
        int i = 1;
        int num = 28;
        while (i<28){
            if (num%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
class prob_8a{
    public static void main(String[] args) {
        int num = 28;
        int i = 1;
        while (i <= num/2){
            if(num % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
class prob_8b{
    public static void main(String[] args) {
        int num = 28; // when i have to find a factor of any number it will be the less then its square root.
        int i = 2;
        int count = 1;
        System.out.println(1);
        while (i*i <= num){
            if(num % i == 0) {
                int factor1 = i;
                int factor2 = num/i;
                if (factor1 == factor2) {
                    System.out.println(factor1);
                    count++;
                }
                else{
                    System.out.println(factor1);
                    System.out.println(factor2);
                    count += 2;
                }
            }
            i++;
        }
        System.out.println("total factors are: "+ count);
    }
}
class prob9 {
    public static void main(String[] args) {
        int i = 1;
        int num = 28;
        int count = 0;
        while (i < 28) {
            if (num%i == 0) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
class prob10 {
    public static void main(String[] args) {
        int i = 1;
        int num = 28;
        int count = 0;
        while (i < num) {

            if (num % i == 0) {
                count ++;
                System.out.println("these are the Factor ;");
                System.out.println(i);
            }
            i++;
        }
        System.out.println("the total count of factor :"+count);
    }
}
class prob11{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Print your number:");
            int n = sc.nextInt();
            boolean isPrime = true;
            int i = 2;
            if (n <= 1){
                isPrime = false;
                System.out.println("Not a PrimeNumber");
            }
            while(i<n){
                if ((n % i) == 0){
                    isPrime=false;
                }
                else {
                    isPrime = true;
                }
                i++;

                }
            if (isPrime == false){
                System.out.println(n+" : is not a Prime Number");
            }else
                System.out.println(n+" : is a Prime Number");
            }
}

class prob12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i = 2;
        System.out.println(n1);
        if (n>1){
            System.out.println(n2);
        }
        while (i<=n){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            i++;
        }

    }
}

class prob13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i = 2;
//        System.out.println(n1);
//        if (n>1){
//            System.out.println(n2);
//        }
        while (i<=n){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }
        System.out.println(n3);

    }
}


