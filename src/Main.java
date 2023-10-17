import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JFrame = a GUI window to add components to
          //MyFrame myFrame = new MyFrame(); //same effect, but uses classes
//        JFrame frame = new JFrame(); //creates a frame
//        frame.setTitle("JFrame title goes here"); //sets title of frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//        frame.setResizable(false); //prevent frame from being resize
//        frame.setSize(420, 420); //sets the x-dimension and y-dimension of frame
//        frame.setVisible(true); //make frame visible
//
//        ImageIcon image = new ImageIcon("src/logo.png"); //create image icon
//        frame.setIconImage(image.getImage()); //change icon of frame
//        frame.getContentPane().setBackground(new Color(123,50,250)); //change color of bg

        // JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("src/logo.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); //create a label
        //by default, label takes as much space as possible
        label.setText("this is a test message"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, or RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, or BOTTOM of image icon
        label.setForeground(Color.green); //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); //set font of text
        label.setIconTextGap(0); //set gap of text to image
        label.setBackground(Color.black); //set BG Color
        label.setOpaque(true); //display bg color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setBounds(100,100, 450, 450); // set  x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();






    }
}
