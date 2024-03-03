package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        //  su dung scanner
        // nhap ten sinh vien, va in ra ho ten sinh vien

        Scanner sc = new Scanner(System.in);

        // nextline: lay chuoi
        //nextIn: lay so nguyen
//        int number = sc.nextInt();
//        System.out.println("number:"+ number);

        //nextFloat : lay so thuc
//         Float score  =sc.nextFloat();
//        System.out.println("score:"+ score);


//        String fullName = sc.nextLine();
//        System.out.println("fullName:"+ fullName);

        String name = sc.nextLine();
//        System.out.println("nam:"+ name);
        int year = sc.nextInt();
//        String address = sc.nextLine();
        int age = 2024- year;
        Scanner address = new Scanner(System.in);
         String diaChi = address.nextLine();  

        System.out.println("name:"+ name + "year:" + year + "address:" + diaChi + "age:" + age);
    }
}
