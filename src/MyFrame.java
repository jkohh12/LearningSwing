import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame { // MyFrame is subclass, JFrame is parent class (superclass)

    MyFrame() {
        this.setTitle("JFrame title goes here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent this from being resized
        this.setSize(500, 500); //sets the x-dimension and y-dimension of frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("src/logo.png"); //create image icon
        this.setIconImage(image.getImage()); //change icon of this
        this.getContentPane().setBackground(new Color(123,50,250)); //change color of bg
    }
}
