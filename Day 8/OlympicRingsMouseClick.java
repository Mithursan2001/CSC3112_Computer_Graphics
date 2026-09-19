import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OlympicRingsMouseClick extends JFrame implements MouseListener {
    boolean isDraw = false;
    int startX, startY; // Reference point from mouse click
    int radius = 50;
    Color[] colors = {Color.BLUE, Color.BLACK, Color.RED, Color.YELLOW, Color.GREEN};

    public OlympicRingsMouseClick() {
        setTitle("Bresenham Olympic Rings with Mouse");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (isDraw) {
            drawOlympicRings(g, startX, startY);
            isDraw = false; // Reset after drawing
        }
    }

    void drawOlympicRings(Graphics g, int x, int y) {
        int spacing = 2 * radius + 10; // Horizontal distance between rings
        int verticalSpacing = radius;  // Vertical offset for bottom row

        // Top row: Blue, Black, Red
        drawBresenhamCircle(g, x, y, radius, Color.BLUE);
        drawBresenhamCircle(g, x + spacing, y, radius, Color.BLACK);
        drawBresenhamCircle(g, x + 2 * spacing, y, radius, Color.RED);

        // Bottom row: Yellow, Green
        drawBresenhamCircle(g, x + spacing / 2, y + verticalSpacing, radius, Color.YELLOW);
        drawBresenhamCircle(g, x + 3 * spacing / 2, y + verticalSpacing, radius, Color.GREEN);
    }

    // Bresenham Circle Algorithm
    void drawBresenhamCircle(Graphics g, int xc, int yc, int r, Color color) {
        int x = 0;
        int y = r;
        int d = 3 - 2 * r;

        while (x <= y) {
            plotCirclePoints(g, xc, yc, x, y, color);
            if (d <= 0) {
                d += 4 * x + 6;
            } else {
                d += 4 * (x - y) + 10;
                y--;
            }
            x++;
        }
    }

    void plotCirclePoints(Graphics g, int xc, int yc, int x, int y, Color color) {
        g.setColor(color);
        
        g.fillRect(xc + x, yc - y, 5,5);//(100,95,5,5)
		 
        g.fillRect(xc +y, yc -x, 5, 5);//(105,100,5,5)
	    
		g.fillRect(xc +y, yc +x, 5,5);
		 
		g.fillRect(xc + x, yc+ y, 5,5);
		
		g.fillRect(xc - x, yc + y, 5,5);
		 
		g.fillRect(xc -y, yc +x, 5,5);
		 
		g.fillRect(xc - y, yc - x, 5,5);
		 
		g.fillRect(xc - x, yc - y, 5,5);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        startX = e.getX();
        startY = e.getY();
        isDraw = true;
        repaint();
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new OlympicRingsMouseClick();
    }
}
