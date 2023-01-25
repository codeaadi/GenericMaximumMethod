package com.bridgelabz.generic;

import java.util.Scanner;

public class UC_1_FindMaximumInteger {
    public static <T> void Maximum(T num1, T num2, T num3) {
        T max = num1;
        if(((Integer)num2).compareTo((Integer)max)>0 )
            System.out.println(num2+" is Maximum");
        else if(((Integer) num3).compareTo((Integer)num2)>0)
            System.out.println(num3+" is Maximum");
        else
            System.out.println(num1+" is Maximum");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        Integer num1 = scan.nextInt();

        System.out.print("Enter the Second Number : ");
        Integer num2 = scan.nextInt();

        System.out.print("Enter the Third Number : ");
        Integer num3 = scan.nextInt();

        Maximum(num1, num2, num3);
    }

}
