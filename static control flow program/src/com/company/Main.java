//1-Identification of static members from top to bottom
//2-Execution of static variable assignments & static blocks from top to bottom
//3-Execution of main method
package com.company;
public class Main {

    static int i=10; //step-1
    static
    {
        m1(); //step-2
        System.out.println("First static block");//step-4 (2nd output)
    }

    public static void main(String[] args) {
        // write your code here
        m1(); //step-7
        System.out.println("Main method");//step-9 (last output)
    }
    public static void m1()
    {
        System.out.println(j);//step-3 will print 0(first output) step-8 will print 20 (4th output)
    }
    static
    {
        System.out.println("Second static block");//step-5 (3rd output)
    }
    static int j=20; //step-6 j will be initialised to 20
}

