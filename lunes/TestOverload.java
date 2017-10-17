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
class Add { 
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
        
    }
}
public class TestOverload {
   public static void main(String[] args){
       System.out.println(Add.add(11,11));
       System.out.println(Add.add(11,11,11));
   }
}
