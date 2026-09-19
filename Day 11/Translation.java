import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Translation extends JFrame {
    public Translation() {
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

		
		int dx = 100;
		int dy = 50;
		
		int[] xPointsTranslated = new int[numPoints];
		int[] yPointsTranslated = new int[numPoints];
		
		for(int i=0; i<numPoints; i++){
			xPointsTranslated[i] = xPoints[i] +dx;
			yPointsTranslated[i] = yPoints[i] +dy;
		}
		
		g.setColor(Color.red);
		g.drawPolygon(xPointsTranslated,yPointsTranslated,numPoints);
	}
	
	public static void main(String[] args){
		new Translation();
	}
}