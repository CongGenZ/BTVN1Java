package com.tn;

import java.util.Scanner;

public class RecTangle {

    public double Cd;
    public double Cr;
    public RecTangle(double Cd, double Cr){
        this.Cd = Cd;
        this.Cr = Cr;

    }
    public  double getCvHcn(){
        return (this.Cr + this.Cd) * 2;
    }
    public  double getDtHcn(){
        return (this.Cr * this.Cd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu dai hinh chu nhat la:");
         double Cd = sc.nextInt();

        System.out.println("Chieu rong hinh chu nhat la:");
        double Cr = sc.nextInt();
        RecTangle recTangle = new RecTangle( Cd,Cr);
        double Cv = recTangle.getCvHcn();
        System.out.println("Chu vi hinh chu nhat la:"+ Cv );
        double Dt = recTangle.getDtHcn();
        System.out.println("Dien hinh chu nhat la:"+ Dt );

    }

}

