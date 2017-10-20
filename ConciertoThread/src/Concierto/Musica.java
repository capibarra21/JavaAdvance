package Concierto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Concierto.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author HP
 */
public class Musica {
    //Musica(String cancion)
    String song;
      
        //cancion = "5.wav";
         public void playMusic(String song) throws IOException{
             this.song = song;
    InputStream in = new FileInputStream(song);
    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);
    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
    
    }
    }

    

