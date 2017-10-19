/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Concierto;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


/**
 *
 * @author HP
 */
public class Concierto {
    public static void main(String[] args)
     throws Exception
  {
    // open the sound file as a Java input stream
  
    
    JFrame f = new JFrame("Load Image Sample");
     
        Musica mus = new Musica("5.wav");
        f.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new LoadImageApp("4.jpg"));
        f.pack();
        f.setVisible(true);
  }
   
}

