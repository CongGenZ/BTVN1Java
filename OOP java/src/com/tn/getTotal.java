package com.tn;

public class getTotal {
    public void sum(){
        int num1 = 2;
        int num2 = 2;
        float Total = num1 + num2;
        System.out.println("tong:" + Total);
    }

    public static void main(String[] args) {
        getTotal total = new getTotal();
        total.sum();
         getTotal function = new getTotal();
         int value1  = function.calculation();
        System.out.println("value1:" + value1);
       String value2 = function.calculation2();
        System.out.println("value2:" + value2);
        boolean value3 = function.calculation3();
        System.out.println("value3:" + value3);


    }

     public  int calculation(){
         System.out.println("method with return type");
         return  2;
     }
    public  String calculation2(){
        System.out.println("method with return type");
        return  "abc";
    }
    public  boolean calculation3(){
        System.out.println("method with return type");

         return true;

    }
}
