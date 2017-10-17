/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jerarquia;

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
class Gato extends Animal{
    void maullar(){
        System.out.println("maulleando...");
    }
}
public class PruebaHerencia  {
    public static void main(String[] args){
    Gato g = new Gato();
    g.maullar();
    g.eat();
    }
    
}
