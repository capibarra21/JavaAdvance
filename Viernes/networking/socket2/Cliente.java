/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.networking.socket2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class Cliente {

    public static void main(String[] args) throws IOException {
        String msg = "", msg2 = "";
        BufferedReader br = null;

        Socket s = new Socket("localhost", 3000);

        DataInputStream ain = new DataInputStream(s.getInputStream());
        DataOutputStream dot = new DataOutputStream(s.getOutputStream());

        br = new BufferedReader(new InputStreamReader(System.in));

        while (!msg.equals("stop")) {
            msg = br.readLine();
            dot.writeUTF(msg);
            dot.flush();

            dot.writeUTF(msg2);
            System.out.println("El servidor dice: " + msg);
        }
        s.close();
        dot.close();
        ain.close();

    }
}
