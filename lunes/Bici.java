/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunes;

/**
 *
 * @author HP
 */
class Vehiculo{
    void run(){
            System.out.println("esta corriendo");
}
}
public class Bici extends Vehiculo {
    void run(){
        System.out.println("la baika esta corriendo");
    }
    public static void main(String[] args) {
        Bici b = new Bici();
        b.run();
    }
    
}
