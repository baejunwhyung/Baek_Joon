package 반복문;

import java.util.Scanner;

public class chess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];
        for(int i = 0; i < arr.length; i++)
            arr[i]=sc.nextInt();


        int arr1[] = {1,1,2,2,2,8};

        for(int i=0; i < arr1.length; i++)
            System.out.print((arr1[i]-arr[i]) + " ");

    }
}
