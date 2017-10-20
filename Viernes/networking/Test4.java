/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Test4 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            System.out.println("nombre del host" + ip.getHostName());
            System.out.println("Direccion ip: "+ip.getHostName());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Test4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
