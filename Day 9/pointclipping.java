
// code is wrong


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class pointclipping extends JFrame implements MouseListener {

    BufferedImage canvas;
    Color boundaryColor = Color.BLACK;
    Color fillColor = Color.RED;
    Graphics2D g;

    public pointclipping() {
        setTitle("Boundary Fill (with Color Condition)");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        canvas = new BufferedImage(800,600, BufferedImage.TYPE_INT_ARGB);
        g = canvas.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800,600);

        
        g.setColor(boundaryColor);
        g.drawRect(200, 150, 400, 300);

        //g.setColor(Color.BLACK);
        //g.drawString("Click inside the rectangle to fill", 20, 60);
    }

    // Boundary Fill using color checking (4-connected)
    public void pointclipp(int x,int y){
		if(x>=200 && x<=600 && y>=150 && y<=450){
			g.setColor(Color.red);
			g.fillOval(x-10,y-10,20,20);
		}
	}
	 public void paint(Graphics gScreen) {
        gScreen.drawImage(canvas, 0, 0, null);
    }

    public void mouseClicked(MouseEvent e) {
        int x=e.getX();
		int y=e.getY();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new pointclipping();
    }
}
