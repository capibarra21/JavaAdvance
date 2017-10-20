/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.networking.Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Cliente {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 3000);
            DataOutputStream dot = new DataOutputStream(s.getOutputStream());
            dot.writeUTF("Hola Servidor");
            dot.flush();
            dot.close();
            s.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
            
    }
}
