/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

/**
 *
 * @author HP
 */
public class TestIO23 {
    public static void main(String[] args) throws IOException {
        char[]a = new char[512];
        StringWriter sw= new StringWriter();
        FileInputStream in = null;
        BufferedReader br =null;
        
        in = new FileInputStream("C:\\uno.txt");
        br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
        int i = 0;
        while((i= br.read(a))!= -1){
            sw.write(a,0,i);
            
        }
        System.out.println(sw.toString());
        sw.close();
        br.close();
        in.close();
        
        
        
    }
    
}
