package com.alsaecas;

public class SmartPhone extends SmartDevice{
    //atributos
    Double camaraMp;
    boolean cincoG;

    //constructores
    public SmartPhone() {}
    public SmartPhone(String color, String fabricante, String modelo, Double camaraMp, boolean cincoG) {
        super(color, fabricante, modelo);
        this.camaraMp = camaraMp;
        this.cincoG = cincoG;


    }

    //metodo toString
    @Override
    public String toString() {
        return "SmartPhone{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", camaraMp=" + camaraMp +
                ", cincoG=" + cincoG +
                '}';
    }
}
