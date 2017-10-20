/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes.networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.coppel.com");
            HttpURLConnection  huc = (HttpURLConnection)url.openConnection();
            url.openConnection();
            
            for (int i = 0; i < 8; i++) {
                System.out.println(huc.getHeaderFieldKey(i)
                        +" = "+huc.getHeaderField(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(Test3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
