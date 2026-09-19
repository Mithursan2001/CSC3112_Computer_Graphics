import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PolygonExample extends JFrame {
    public PolygonExample() {
        setTitle("Polygon Example");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
	
	public void paint(Graphics g){
		int[] xPoints = {200,300,350,250,150};
		int[] yPoints = {200,150,250,350,300};
		int numPoints = xPoints.length;
		
		g.setColor(Color.blue);
		g.drawPolygon(xPoints,yPoints,numPoints);
		g.fillPolygon(xPoints,yPoints,numPoints);
	}
	
	public static void main(String[] args){
		new PolygonExample();
	}
}