/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author HP
 */
public class TestIO21 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("C:\\dos.txt");
        PrintStream ps = new PrintStream(fout);
        
        
        ps.println(2017);
        ps.println("hola");
        ps.println("Mundo con Archivos");
        ps.close();
        fout.close();
        System.out.println("Listo");
    }
    
}
