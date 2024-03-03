package com.tn;

import javax.lang.model.element.Name;
import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do dai cua mang username:");
        int userNamesize = sc.nextInt();
        String[] userName = new String[userNamesize];
        for (int i = 0; i < userName.length ; i++) {
            sc = new Scanner(System.in);
            System.out.println("nhap username thu " + (i+1)+ ":");
            userName[i] = sc.nextLine();

        }
        boolean isExist = false;
        for (int i = 0; i < userNamesize; i++) {
            if(userName[i].equals("t5")){
                isExist =true;
            }
        }
        if (isExist == true){
            System.out.println(" ton tai t5 ");

        }
        else {
            System.out.println("khong ton tai t5");
        }
    }
}
