package loadimageapp;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.JFrame;
import java.io.*;
import sun.audio.*;
public class LoadImageApplet extends Applet {
    BufferedImage img;

    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public LoadImageApplet() {
       try {
           img = ImageIO.read(new File("3.jpg"));
             
       } catch (IOException e) {
       }

    }

    @Override
    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }

    public static void main(String[] args)
     throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "4.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
    JFrame f = new JFrame("Load Image Sample");
   
        
        f.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new LoadImageApplet());
        f.pack();
        f.setVisible(true);
  }
   
}

