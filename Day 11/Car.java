import java.awt.*;
import javax.swing.*;

public class Car extends JFrame {
    public Car() {
        setTitle("Car Drawing with Polygon");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        int[] xPoints = {200, 220, 220, 260,260,320,320,200};
        int[] yPoints = {200, 200, 180, 180,200,200,240,240};
		int numPoints = xPoints.length;
    
		g.setColor(Color.blue);	
		g.drawPolygon(xPoints,yPoints,numPoints);
        g.setColor(Color.black);
        g.fillOval(210, 240, 25, 25);
        g.fillOval(290, 240, 25, 25);
    }

    public static void main(String[] args) {
        new Car();
    }
}