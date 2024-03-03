package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int num1 = 10;
        while (num1 < 20) {
            System.out.println("value num1:" + num1);
            num1++;
        }
        // taoj chuong trinh nhap vao n > 30 va in ra
        // neu n <= 30 thi yc nhap lai

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n <= 30) {
            System.out.println("Gia tri n phai > 30, vui long nhap lai!");
            n = sc.nextInt();

        }
        System.out.println("in so ra :" + n);
    }
}