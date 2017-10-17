/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multinivel;

/**
 *
 * @author HP
 */
class Animal{
    void eat(){
        System.out.println("comiendo...");
    }
}
class Perro extends Animal {
        void ladrar(){
            System.out.println("ladrando...");
    }
}
class Cachorro extends Perro{
    void correr(){
        System.out.println("Corriendo...");
    }
}
public class PruebaHerencia {
    public static void main(String[] args){
        Cachorro c = new Cachorro();
        c.correr();
        c.eat();
        c.ladrar();
    }
    
}
