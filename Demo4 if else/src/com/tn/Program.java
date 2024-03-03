package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int age = 18;
        if (age > 18){
            System.out.println("Đủ tuổi kết hôn");
        }
        else {
            System.out.println("Chưa đủ tuổi kết hôn");
        }

        double score  = 7;
        if(score < 4){
            System.out.println("hoc luc yeu");

        }
        else if(score>4 && score <6.5){
            System.out.println("Hoc luc trung binh");
        }
        else {
            System.out.println("Hoc luc kha");
        }


        // khai bao 1 so 1 den 7


        Scanner ngay = new Scanner(System.in);
        int day  = ngay.nextInt();
        switch (day){
            case 1:
                System.out.println("Chu nhat!");
                break;
            case 2:
                System.out.println("Thu 2!");
                break;
            case 3:
                System.out.println("Thu 3!");
                break;
            case 4:
                System.out.println("Thu 4!");
                break;
            case 5:
                System.out.println("Thu 5!");
                break;
            case 6:
                System.out.println("Thu 6!");
                break;
            case 7:
                System.out.println("Thu 7!");
                break;
            default:
                System.out.println("Khong hop le!");
        }
    }
}