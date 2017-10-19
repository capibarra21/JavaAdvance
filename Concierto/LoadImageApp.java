package Concierto;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.JFrame;
import java.io.*;
import org.omg.CORBA.TIMEOUT;
import sun.audio.*;
public class LoadImageApp extends Component{
    BufferedImage img;
    

   
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
       
   
    }

    public LoadImageApp(String imagen)  {
       try {
           img = ImageIO.read(new File(imagen));
        
             
       } catch (IOException e) {
       }

    }

   
    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }}

    

