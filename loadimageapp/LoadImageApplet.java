package loadimageapp;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * This class demonstrates how to load an Image from an external file
 */
public class LoadImageApplet extends JPanel {
          
    BufferedImage img;

    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }

    public LoadImageApplet(String filename) {
       try {
           img = ImageIO.read(new File(filename));
       } catch (IOException e) {
		//System.out.println(e); // e.getMessage());
		System.out.println(filename + " not found");
		System.exit(-1);
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

    public static void main(String[] args) {

	String filename = "1.jpg";
	if (args.length>0) filename = args[0];
        JFrame f = new JFrame("Load Image Sample");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new LoadImageApplet(filename));
        f.pack();
	f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
