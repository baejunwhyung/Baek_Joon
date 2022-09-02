package 반복문;

import java.util.Scanner;

public class Mul {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int a = B % 10;
        int b = (B%100)/10;
        int c = B/100;

        System.out.println(A * a);
        System.out.println(A * b);
        System.out.println(A * c);
        System.out.println(A * B);
    }
}
