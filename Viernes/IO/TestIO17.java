/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.in;

/**
 *
 * @author HP
 */
public class TestIO17 {
    public static void main(String[] args)throws IOException {
        FileWriter fr = new FileWriter("C:\\uno.txt");
        BufferedWriter bf =  new BufferedWriter(fr);
        bf.write("java coppel");
        bf.close();
        System.out.println("listo");
    }
}
