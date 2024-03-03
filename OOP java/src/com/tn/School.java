package com.tn;

import java.util.Scanner;

public class School {

    public int sum(int num1, int num2) {
        System.out.println("Run in sum");
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("sum:" + (num1 + num2));

        return 10;
    }
// tao ham nhan chia 2 so

    public int multiplication(int number1, int number2) {
        System.out.println("tich 2 so :" + (number1 * number2));
        System.out.println("thuong 2 so :" + (number1 / number2));
               return 0 ;
    }
    //   tao 1 method truyen vao first name, lasst name , in ra full name
    // neu first name hoac lasst nam trong tra ve thong bao trong

         public String getFullName( String firstName , String lastName){

             firstName = firstName.trim();
             lastName = firstName.trim();
             if (firstName.equals("") && lastName.equals("")){
                 System.out.println("Dien them thong tin:");

             }
             else {
                 System.out.println("fullName:"+ firstName + lastName);
             }

            return "";



         }



    public static void main(String[] args) {

        School sc = new School();
        sc.sum(2, 4);
        sc.multiplication(5,6);
        Scanner full = new Scanner(System.in);
        System.out.println("nhap firstName:");
        String firstName = full.nextLine();
        System.out.println("nhap lastName:");
        String lastName = full.nextLine();
        sc.getFullName(firstName , lastName);

    }



}
