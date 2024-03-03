package com.tn;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // nhập 1 số, là số phần tử  của mảng  lưu tên trường học
        // nhập tiếp đủ số lượng trường học , in ra

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] ArraySchoolName = new String[number];
//

        System.out.println("length:" + ArraySchoolName.length);
        for (int i = 0; i < ArraySchoolName.length; i++) {
            sc = new Scanner(System.in);
            System.out.println("nhap phan tu thu" + (i+1)+ ":");
            String Name = sc.nextLine();
            System.out.println("Name School:" + Name);
//            System.out.println("nhap phan tu thu;" + (i+1)+ ":");
//            ArraySchoolName[i]  = sc.nextLine();
        }
//        for (int i = 0; i < ArraySchoolName.length; i++) {
//            System.out.println("value" + (i+1) + ":" + ArraySchoolName[i]);
//
//        }




    }
}
