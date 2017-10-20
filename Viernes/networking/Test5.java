/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author HP
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Cliente");
        DatagramSocket ds = new DatagramSocket();
        
        String str= "hola";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str.getBytes()
                ,str.length(),ip,300);
        ds.send(dp);
        ds.close();
        
    }
}
