/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.IO;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class TestIO20 {
    public static void main(String[] args) throws IOException {
        CharArrayWriter out = new CharArrayWriter();
        out.write("Hola Coppel");
        FileWriter f1 = new FileWriter("C:\\a.txt");
        FileWriter f2 = new FileWriter("C:\\b.txt");
        FileWriter f3 = new FileWriter("C:\\c.txt");
        FileWriter f4 = new FileWriter("C:\\d.txt");
        
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        
          f1.close();
          f2.close();
          f3.close();
          f4.close();
    }
  
}
