package com.bridgelabz.generic;

import java.util.Scanner;


    public class RF_2_FindMaximum<T extends Comparable<T>> {

        T value1;
        T value2;
        T value3;

        public RF_2_FindMaximum(T value1, T value2, T value3){

            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
        }

        public <T extends Comparable<T>> void Maximum(T value1, T value2, T value3) {
            T max = value1;
            if(value1.compareTo(max)>0 && value2.compareTo(value3)>0)
                System.out.println(value2+" is Maximum");
            else if(value3.compareTo(max)>0)
                System.out.println(value3+" is Maximum");
            else
                System.out.println(value1+" is Maximum");
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the First Number : ");
            Integer value1 = scan.nextInt();

            System.out.print("Enter the Second Number : ");
            Integer value2 = scan.nextInt();

            System.out.print("Enter the Third Number : ");
            Integer value3 = scan.nextInt();
            RF_2_FindMaximum<Integer> integers = new RF_2_FindMaximum<Integer>(value1, value2, value3);
            integers.Maximum(value1, value2, value3);
        }
}
