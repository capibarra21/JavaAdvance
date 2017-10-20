/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.IO;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class TestIO16 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\uno.txt");
        int i;
        while((i= fr.read())!= -1){
            System.out.println((char)i);
            
        }
        fr.close();
    }
}
