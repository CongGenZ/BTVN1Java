package com.tn;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Student2 st2 = new Student2();
        st2.inFoMationSv();
        System.out.println("nhap thong tin sinh vien:");
        Scanner  sc = new Scanner(System.in);
        System.out.println("msv:");
       int msv = sc.nextInt();
       st2.msv= msv;
        System.out.println("Diem trung binh");
        double  mediumScore = sc.nextDouble();
        st2.mediumScore = mediumScore;
        System.out.println("email:");
        sc = new Scanner(System.in);
        String email = sc.nextLine();
        st2.email = email;


        System.out.println("in ra thong tin sinh vien:"+ " Msv:" + st2.msv + " MediumScore: " + st2.mediumScore + " Email:" + st2.email);
 if(mediumScore >=8){
     System.out.println("sinh vien duoc hoc bong!");
 }
 else {
     System.out.println("sinh vien khong duoc hoc bong!");
 }

    }
}
