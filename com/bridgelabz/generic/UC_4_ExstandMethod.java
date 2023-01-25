package com.bridgelabz.generic;


    public class UC_4_ExstandMethod<T extends Comparable<T>> {

        T [] inputArray;

        public UC_4_ExstandMethod(T[] inputArray){

            this.inputArray = inputArray;
        }

        public void Maximum() {
            for(int i=0; i<inputArray.length-1; i++) {
                if(inputArray[i].compareTo(inputArray[i+1])>0) {
                    inputArray[i+1] = inputArray[i];
                }
            }
            System.out.println(inputArray[inputArray.length-1]);
        }

        public void Display() {

            for(int i=0; i<inputArray.length; i++) {
                System.out.print(inputArray[i]+" ");
            }
        }

        public static void main(String[] args) {

            Integer [] integers = {26,21,25,65,48,98,75};
            Float [] floats = {2.5f,3.6f,6.5f,25.6f};
            String [] strings = {"Apple","Orange","Peach","Banana","Mango"};

            System.out.print("Integer : ");
            new UC_4_ExstandMethod(integers).Display();
            System.out.println();
            System.out.print("Floats : ");
            new UC_4_ExstandMethod(floats).Display();
            System.out.println();
            System.out.print("Strings : ");
            new UC_4_ExstandMethod(strings).Display();
            System.out.println();
            System.out.println("Maximum Values are : ");
            new UC_4_ExstandMethod(integers).Maximum();
            new UC_4_ExstandMethod(floats).Maximum();
            new UC_4_ExstandMethod(strings).Maximum();
        }
    }

