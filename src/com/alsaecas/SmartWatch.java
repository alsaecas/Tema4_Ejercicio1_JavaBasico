package com.alsaecas;

public class SmartWatch extends SmartDevice{
    //atributos
    boolean microfono;
    boolean eSim;

    //constructores
    public SmartWatch() {}

    public SmartWatch(String color, String fabricante, String modelo, boolean microfono, boolean eSim) {
        super(color, fabricante, modelo);
        this.microfono = microfono;
        this.eSim = eSim;
    }

    //metodo toString

    @Override
    public String toString() {
        return "SmartWatch{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", microfono=" + microfono +
                ", eSim=" + eSim +
                '}';
    }
}
