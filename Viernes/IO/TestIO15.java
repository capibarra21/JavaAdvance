
package Viernes.IO;

import java.io.FileWriter;
import java.io.IOException;


public class TestIO15 {
    
   
public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\dos.txt");
        fw.write("HOLA, Java");
        fw.close();
        System.out.println("Listo");
        
    }
}
