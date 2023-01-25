package com.bridgelabz.generic;

import java.util.Scanner;

public class UC_3_FindMaxString {
    public static <T> void Maximum(T str1, T str2, T str3) {
        T max = str1;
        if(((String)str2).compareTo((String)max)>0 && ((String)str2).compareTo((String)str3)>0)
            System.out.println(str2+" is Maximum");
        else if(((String)str3).compareTo((String)max)>0)
            System.out.println(str3+" is Maximum");
        else
            System.out.println(str1+" is Maximum");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        String str1 = scan.next();

        System.out.print("Enter the Second Number : ");
        String str2 = scan.next();

        System.out.print("Enter the Third Number : ");
        String str3 = scan.next();

        Maximum(str1, str2, str3);
    }
}
