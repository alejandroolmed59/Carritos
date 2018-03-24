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
public class JavaApplication1 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", 1990);
        Carro carro2 = new Carro("Toyota", 2011);
        Carro carro3 = new Carro("Ferrari", 2007);

        carro1.encender("CambioRamita1", 2);
        carro2.encender("Toy", 4);
        carro3.encender();

        carro1.apagar();

        carro2.pitar();
        carro3.pitar();

    }

}
