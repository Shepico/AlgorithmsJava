package Visible;

import java.awt.*;

class Circle extends Component {
    private Color color;
    private int x;
    private int y;
    private int radius;

    Circle (int x, int y, int radius, Color color){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    Circle (int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = Color.black;
    }

    void Paint (Graphics g) {
        g.drawOval(5,5,40,40);
        g.setColor(Color.GREEN);
    }

}
