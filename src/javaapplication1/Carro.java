package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nesto
 */
public class Carro {

    String marca;
    int anio;
    boolean motorEncendido;

    public Carro(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public void encender() {
        motorEncendido = true;
        System.out.println(marca + " " + anio + " Se encendio");
    }
/**
 * Encender el motorcillo
 * @param Llave Prueba
 * @param vueltitas prdasfsa
 * @return Prueba
 */
    public int encender(String Llave, int vueltitas) {
        motorEncendido = true;
        System.out.println(marca + " " + anio + " Se encendio");
        return 1;
    }

    public void apagar() {
        motorEncendido = false;
        System.out.println(marca + " " + anio + " Se apago");
    }

    public void pitar() {
        System.out.println("PIIIIIIIIIIIIII");
    }
}
