

// code is wrong

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class BoundaryFill extends JFrame implements MouseListener {

    BufferedImage canvas;
    Color boundaryColor = Color.BLACK;
    Color fillColor = Color.RED;
    Graphics2D g;

    public BoundaryFill() {
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

    // Boundary Fill using color checking (8-connected)
    private void boundaryFill11(int x, int y, Color fillColor, Color boundaryColor) {
        if (x < 200 || y < 150 || x >= 600 || y >= 450)
            return;

        Color currentColor = new Color(canvas.getRGB(x, y), true);

        if (!currentColor.equals(boundaryColor) && !currentColor.equals(fillColor)) {
            canvas.setRGB(x, y, fillColor.getRGB());

            boundaryFill8(x + 1, y, fillColor, boundaryColor);
            boundaryFill8(x - 1, y, fillColor, boundaryColor);
            boundaryFill8(x, y + 1, fillColor, boundaryColor);
            boundaryFill8(x, y - 1, fillColor, boundaryColor);
            boundaryFill8(x + 1, y + 1, fillColor, boundaryColor);
            boundaryFill8(x - 1, y - 1, fillColor, boundaryColor);
            boundaryFill8(x + 1, y - 1, fillColor, boundaryColor);
            boundaryFill8(x - 1, y + 1, fillColor, boundaryColor);
        }
    }
	 public void paint(Graphics gScreen) {
        gScreen.drawImage(canvas, 0, 0, null);
    }

    public void mouseClicked(MouseEvent e) {
        boundaryFill11(e.getX(), e.getY(), fillColor, boundaryColor);
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new BoundaryFill();
    }
}

