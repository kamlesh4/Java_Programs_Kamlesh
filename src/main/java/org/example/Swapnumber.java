package org.example;

import java.util.Scanner;

public class Swapnumber {

    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Before Swapping the number" +k+ ""+y);
        k=k+y;
        y=k-y;
        k=k-y;

        System.out.println("After swapping the number" +k+ ""+y);

    }
}
