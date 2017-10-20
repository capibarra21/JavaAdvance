/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class TestIO18 {
    public static void main(String[] args)throws IOException 
    
 {
     InputStreamReader in = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(in);
     
     String cadena = "";
     while (!cadena.equals("Stop")){
         cadena = br.readLine();
         System.out.println("Cadena"+ cadena);
     }
     br.close();
     in.close();
    }
}
