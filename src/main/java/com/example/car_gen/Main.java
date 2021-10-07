package com.example.car_gen;

public class Main {
    public static void main(String[] args){
        Honda civic=new Honda("green",2020,50,500,true,true);
        Lexus rx350=new Lexus("red",1898,30,400,false,true);
        Toyota supra=new Toyota("blue",2000,67,499,true,true);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());

        civic.accelerateSpeed();
        System.out.println("Honda speed is: "+civic.getSpeed());
        rx350.decelerateSpeed();
        System.out.println("Lexus speed is: "+rx350.getSpeed());
        civic.convertToElectric();
        System.out.println("Honda is: "+civic.getIsElectric());
        supra.convertToElectric();
        System.out.println("Toyota is: "+supra.getIsElectric());
        supra.accelerateSpeed();
        System.out.println("Toyota is: "+supra.getSpeed());

    }
}
