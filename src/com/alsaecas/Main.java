package com.alsaecas;

public class Main {
    public static void main(String[] args) {

        SmartPhone ihpone = new SmartPhone("blanco","Apple","12 Pro",13.5,true);
        SmartPhone xiaomi = new SmartPhone("negro","Xiaomi","MI5",16.0,false);

        SmartWatch samsung = new SmartWatch("negro","Samsung","Watch 4",true,true);
        SmartWatch fitbit = new SmartWatch("dorado","fitbit","Luxe",false,false);

        System.out.println("Los objetos de tipo SmartPhone creados son:");
        System.out.println(ihpone);
        System.out.println(xiaomi);
        System.out.println("");

        System.out.println("Los objetos de tipo SmartWatch creados son:");
        System.out.println(samsung);
        System.out.println(fitbit);

    }
}
