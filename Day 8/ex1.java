import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex1 extends JFrame implements MouseListener {
    int xc, yc, r;
    boolean isDraw = false;
    Graphics g;

    ex1() {
        setTitle("Bresenham Circle Algorithm");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
        g = getGraphics();
    }

    // Bresenham Circle Algorithm
    public void drawCircle(int xc, int yc, int r) {
        int x=0;
		int y=r;
		int p=3-2*y;
		
		while(x<=y){
			plotCirclePoints (xc,yc,x,y);
		if(p<0){
			p=p+4*x+6;
		}
		else{
			p=p+4*(x-y)+10;
			y=y-1;
		}
		x++;
		
    }
	}

    public void plotCirclePoints(int xc, int yc, int x, int y) {
		 g.setColor(Color.RED);
        g.fillRect(xc + x, yc - y, 5,5);//(100,95,5,5)
		 g.setColor(Color.yellow);
        g.fillRect(xc +y, yc -x, 5, 5);//(105,100,5,5)
	    g.setColor(Color.green);
		g.fillRect(xc +y, yc +x, 5,5);
		 g.setColor(Color.cyan);
		g.fillRect(xc + x, yc+ y, 5,5);
		 g.setColor(Color.blue);
		g.fillRect(xc - x, yc + y, 5,5);
		 g.setColor(Color.orange);
		g.fillRect(xc -y, yc +x, 5,5);
		 g.setColor(Color.magenta);
		g.fillRect(xc - y, yc - x, 5,5);
		 g.setColor(Color.pink);
		g.fillRect(xc - x, yc - y, 5,5);
        
    }

    // Mouse Events
    public void mousePressed(MouseEvent e) {
        xc = e.getX();
        yc = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        int x2 = e.getX();
        int y2 = e.getY();
        if (!isDraw) {
            g.setColor(Color.BLUE);
            r = (int) Math.sqrt(Math.pow(x2 - xc, 2) + Math.pow(y2 - yc, 2));
            drawCircle(xc, yc, r);
            isDraw = true;
        }
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new ex1();
    }
}

	
