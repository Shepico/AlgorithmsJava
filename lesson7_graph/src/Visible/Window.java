package Visible;

import javax.swing.*;
import java.awt.*;

class Window extends JFrame {

    //private JFrame frame;

    Window(String label) {
        setTitle(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Container container = this.frame.getContentPane();


        setLocation(200, 200);
        setSize(800,600);
        setVisible(true);
    }

    public void Paint (Graphics g) {
        g.drawOval(5,5,40,40);
        g.setColor(Color.red);
    }
}
