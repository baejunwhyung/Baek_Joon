package 반복문;

import java.util.Scanner;

public class receipt {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        int total=0;
        for(int i=0;i<B;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            total += a*b;
        }
        if(total == A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
