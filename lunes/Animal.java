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
public class Animal {
    void eat(){
        System.out.println("comiendo...");
    }
}
    class Perro extends Animal {
        void ladrar(){
            System.out.println("ladrando...");
    }
}
    class PruebaHerencia{
        public static void main(String[] args) {
            Perro p = new Perro();
            p.eat();
            p.ladrar();
        }
    }

