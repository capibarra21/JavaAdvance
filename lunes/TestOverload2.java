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
class adder{
    static int add(int a, int b){
        return a+b;
        
    }
    static double add(double a, double b){
        return a+b;
        
    }
}
public class TestOverload2 {
    public static void main (String[] args){
        System.out.println(adder.add(11,11));
        System.out.println(adder.add(11.2,11.5));
    }
   
}

