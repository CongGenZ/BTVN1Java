package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter num1:");
          int num1 = sc.nextInt();
//        System.out.println("number:" + num1);

        System.out.println("Enter num2:");
        int num2 = sc.nextInt();


        // tính tổng
        int total = num1 + num2;
        System.out.println("Total:" + total);

        // tính tích
        int tich = num1 * num2;
        System.out.println("Tich:"+ tich);
        // thuong
        int thuong  = num1 - num2;
        System.out.println("Thuong:" + thuong);
        //chia
        int chia = num1 / num2;
        System.out.println("chia:" + chia
        );
        int result  = num1 % num2;
        System.out.println("result:" + result);
    }
}
