package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        for (int num = 0;num < 12; num++){

            System.out.println("number:"+ num );
        }
        // tinh tong tu 1 den 6
         int total = 0;
        for (int i = 0; i < 6; i++) {
            total += i;
        }
        System.out.println("tong:" + total);

        // bai 1
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println("thang co 31 ngay!");
                break;
            case 4,6,9,11:
                System.out.println("thang co 30 ngay!");
                break;
            case 2:
                Scanner nam =new Scanner(System.in);
                int year  = nam.nextInt() ;
                if(year % 400 ==0){
                    System.out.println("co 29 ngay");
                }
                else if (year % 4 ==0 && year % 100 !=0){
                    System.out.println("co 29 ngay");

                }
                 else {
                     System.out.println("co 28 ngay! ");

                 }

                break;
            default:
                System.out.println("error!");

        }


        // bai 2 in ra so chan va chi het cho 3 tu 1->1000
        Scanner so = new Scanner(System.in);
        int num = so.nextInt();
        for ( num = 1; num < 10 ;num ++) {
            if(num % 2 == 0 && num % 3 == 0){
                System.out.println(" so:" + num);

            }
        }
    }
}
