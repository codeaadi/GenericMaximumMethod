package com.bridgelabz.generic;

public class UC_5_GenericMaxMethod<T extends Comparable<T>> {

    T [] inputArray;

    public UC_5_GenericMaxMethod(T[] inputArray){

        this.inputArray = inputArray;
    }

    public void Maximum() {
        for(int i=0; i<inputArray.length-1; i++) {
            if(inputArray[i].compareTo(inputArray[i+1])>0) {
                inputArray[i+1] = inputArray[i];
            }
        }
    }

    public void PrintMax() {

        System.out.println("Maximum Values : "+inputArray[inputArray.length -1]);
    }

    public static void main(String[] args) {

        Integer [] integers = {26,21,25,65,48,98,75};
        Float [] floats = {2.5f,3.6f,6.5f,25.6f};
        String [] strings = {"Apple","Orange","Peach","Banana","Mango"};

        new UC_5_GenericMaxMethod(integers).Maximum();
        new UC_5_GenericMaxMethod(floats).Maximum();
        new UC_5_GenericMaxMethod(strings).Maximum();
        new UC_5_GenericMaxMethod(integers).PrintMax();
        new UC_5_GenericMaxMethod(floats).PrintMax();
        new UC_5_GenericMaxMethod(strings).PrintMax();
    }
}
