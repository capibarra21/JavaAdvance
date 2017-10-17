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
public class Estudiante2 {
    int matricula;
    String nombre;
    static String escuela ="ITC";
    String msg;
    static void cambio(){
        escuela = "IT";
        
    }
    Estudiante2(int i, String n){
        matricula = i;
        nombre = n;
        
    }
    void display(){
        msg+= "matricula:"+ matricula;
        msg+="\n Nombre:" + nombre;
        msg+="\n Escuela: "+ escuela;
        System.out.println(msg);
    }
    
    public static void main (String[] args){
        Estudiante2.cambio();
        Estudiante2 s4 = new Estudiante2(11,"cristian");
        Estudiante2 s5 = new Estudiante2(12,"ana");
        Estudiante2 s6 = new Estudiante2(13,"jando");
        
        s4.display();
        s5.display();
        s6.display();
        
        
    }
}
