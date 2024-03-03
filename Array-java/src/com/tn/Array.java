package com.tn;

public class Array {
    public static void main(String[] args) {
        int[] arrNum = new int[]{0,1, 4, 6, 8};
        System.out.println("so:" + arrNum[3]);
        arrNum[2] = 200;
        System.out.println("so:" + arrNum[2]);
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println("value:" + arrNum[i]);

        }
        // khai báo 1 mang chuoi, co 3 pt
        // ho ten va in ra
        String [] strings  = new String[3] ;
        strings[0]= "nguyen van a";
        strings[1]= "nguyen van b";
        strings[2]= "nguyen van c";
        for (int i = 0; i < strings.length; i++) {
            System.out.println("fullname:" + strings[i]);


        }

    }


}
