import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircularNetwork extends JFrame implements MouseListener {
    Graphics g;
	Graphics2D g2=(Graphics2D)g;
	boolean isdraw=false;

    CircularNetwork() {
        setTitle("Circular");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
        g = getGraphics();
		g2=(Graphics2D)g;
		
    }
    public void drawCircle(int xc, int yc, int r) {
        int x = 0, y = r;
        int d = 3 - 2 * r;

        while (x <= y) {
            plotCirclePoints(xc, yc, x, y);
            if (d < 0)
                d = d + 4 * x + 6;
            else {
                d = d + 4 * (x - y) + 10;
                y--;
            }
            x++;
        }
    }
    public void plotCirclePoints(int xc, int yc, int x, int y) {
        g.fillRect(xc + x, yc + y, 3, 3);
        g.fillRect(xc - x, yc + y, 3, 3);
        g.fillRect(xc + x, yc - y, 3, 3);
        g.fillRect(xc - x, yc - y, 3, 3);
        g.fillRect(xc + y, yc + x, 3, 3);
        g.fillRect(xc - y, yc + x, 3, 3);
        g.fillRect(xc + y, yc - x, 3, 3);
        g.fillRect(xc - y, yc - x, 3, 3);
    }

    public void mouseClicked(MouseEvent e) {
		if(!isdraw)
		{
		g2.setStroke(new BasicStroke(3));
    
		g2.setColor(Color.red);
		int t=0;
       for (int i = 0; i < 3; i++)
	   {
	   drawCircle(200, 200+t, 30);
         t=t+100;
	   }
	   g2.setColor(Color.blue);
	   int a=0;
	   for (int i = 0; i < 5; i++)
	   {
	   drawCircle(400, 100+a, 30);
         a=a+100;
	   }
	   g2.setColor(Color.red);
	   int b=0;
	   for (int i = 0; i < 3; i++)
	   {
	   drawCircle(600, 200+b, 30);
         b=b+100;
	   }
	   
			int[] leftY = {200, 300, 400};       
			int[] middleY = {100, 200, 300, 400, 500}; 
			int[] rightY = {200, 300, 400};   
			int leftX = 230;
			int middleLeftX = 370; 
			int middleRightX = 430; 
			int rightX = 570;
			Color[] leftColors = {Color.MAGENTA, Color.CYAN, Color.PINK};
			for (int i = 0; i < leftY.length; i++) {
				g.setColor(leftColors[i]);
			for (int j = 0; j < middleY.length; j++) {
			g.drawLine(leftX, leftY[i], middleLeftX, middleY[j]);
				}
			}

			for (int i = 0; i < leftY.length; i++) {
				g.setColor(leftColors[i]);
				for (int j = 0; j < middleY.length; j++) {
					g.drawLine(rightX, rightY[i], middleRightX, middleY[j]);
	         	}
			}
	isdraw=true;
	}
	}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new CircularNetwork();
    }
}
