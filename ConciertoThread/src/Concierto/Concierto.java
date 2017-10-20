package Concierto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author HP
 */

public class Concierto extends Thread{
    String imagen;
    public void run(){
       try{
           
           System.out.println("Muestra Imagen");
          
            display("juanga.jpg");
            
            Thread.sleep(15000);
            display("chayanne.jpg");
            Thread.sleep(15000);
            display("rmartin.jpg");
            
            
       }catch(InterruptedException ie){
           System.out.println("ie");
       }
    }
    
    public  void display(String imagen){
        this.imagen = imagen;
        JFrame f = new JFrame("Load");
        f.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            f.add(new LoadImageApp(imagen));
            f.pack();
            f.setVisible(true);
    }
    public static void main(String[] args) throws IOException{
        Concierto img = new Concierto();
        //Musica m = new Musica();
        try {
            
            img.start();
            Song("5.wav");
            Thread.sleep(15000);
            Song("chayane.wav");
            Thread.sleep(15000);
            Song("rmartin.wav");
            Thread.sleep(15000);

        } catch (InterruptedException ie) {
             System.out.println(ie);
        }
        //m.playMusic("5.wav");
        
    }
    
    private static void Song(String song)
    {
        Thread audio  = new Thread(){
            public void run(){
                Musica noanoa = new Musica();
                try {
                    noanoa.playMusic(song);
                } catch (IOException ex) {
                    Logger.getLogger(Concierto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        audio.start();
    }
}
