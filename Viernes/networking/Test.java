/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.networking;

import java.io.IOException;
import java.net.URL;

/**
 * IP: Es una direccion logica que puede ser cambiada, está compuesta por 
 * un rango de 0 a 255.
 * 
 * Protocolo: Un conjunto de reglas asignadas a un nodo de un canal 
 * de comunicacion.
 * (TCP, FTP, Telnet, SMTP, Pop)
 * 
 * Numero de puerto: Es usado para identificar diferentes aplicaciones. 
 * (Endpoint), está asociado a la direccion IP.
 * 
 * MAC: Direccion con identificador unico NIC (Networking interface controller)
 * Un canal puede tener multiples NIC pero cada uno tienen una unica MAC
 * 
 * Connection-Oriented: TCP
 * Connection-Less: UDP
 * 
 * Socket: Es un endpoint entre dos vias de comunicacion.
 * Un socket es usado para la comuniacion entre aplicaciones que poseen
 * diferentes JRE.
 * 
 * Java Sockets pueden ser usados para connection oriented y oriented-less
 * 
 * Connection - oriented: Socket y ServerSocket
 * Connection - less: DatagramSOcket y DatagramPacket
 * 
 * En el cliente un socket debe tener dos datos.
 * 1.-IP del server
 * 2.- Puerto
 * 
 * 
 * 
 */
public class Test {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.coppel.com");
            System.out.println("Protocolo: "+url.getProtocol());
            System.out.println("Host name: "+url.getHost());
            System.out.println("Puerto: "+url.getPort());
            System.out.println("File name: "+url.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
