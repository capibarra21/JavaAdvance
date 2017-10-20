/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.IO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestIO22 {
    public static void main(String[] args) throws  IOException{
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("Hol con todas las letras");
        pw.flush();
        
        PrintWriter pw2 = null;
        pw2 = new PrintWriter(new File("C:\\uno.txt"));
        pw2.write("Escribiendo un archivo");
        pw2.flush();
        pw2.close();
        
    }
    
}
