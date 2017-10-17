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
public class Estudiante {
    int matricula;
    String nombre;
    static String escuela = "ITC";
    String msg;
    
    Estudiante(int matricula, String nombre){
        this.matricula = matricula;
        this.nombre = nombre;
    }
    void display(){
        msg+="matricula: " +matricula;
        msg+="\n nombre: " +nombre;
        msg+="\n escuela;" +escuela;
        System.out.println(msg);
        
    }
    public static void main (String[] args){
        Estudiante s1 = new Estudiante(111, "Cristian");
        Estudiante s2 = new Estudiante(222, "Alexis");
        
        s1.display();
        s2.display();
    }
    
}
