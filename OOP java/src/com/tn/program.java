package com.tn;

public class program {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.numSeat= 5;
        car1.color = "blue";
        car1.weight = 30;
        car1.height = 40;
        car1.brand = "toyota";



        //Car: numSeat: 9, color: Red, weight: 2, height: 3, brand: Huyndai
        //Car: numSeat: 16, color: Black, weight:4, height: 3, brand: Honda

        Car car2 = new Car();
        car2.numSeat = 9;
        car2.color = "red";
        car2.weight = 2;
        car2.height =3;
        car2.brand ="Huyndai";

        Car car3 = new Car();
        car3.numSeat = 16;
        car3.color = "Black";
        car3.weight = 4;
        car3.height =3;
        car3.brand ="Honda";

//        Car car4 = new Car (25, "yellow", 12 , 3 ,"Huyndai");

        car1.showCar();
        car2.showCar();
        car3.showCar();
    }
}
