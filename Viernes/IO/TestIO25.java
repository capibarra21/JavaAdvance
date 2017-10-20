/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class TestIO25 {
    public static void main(String[] args) throws IOException {
        
        try {
            ObjectInputStream in = 
                new ObjectInputStream(new FileInputStream("C:\\t.txt"));
            TestIO24 t = (TestIO24)in.readObject();
            System.out.println(t.id+" "+t.nameClass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestIO25.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
