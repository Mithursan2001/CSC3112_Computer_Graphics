import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class floodfill extends JFrame implements MouseListener {

    BufferedImage canvas;
    Color newcolor = Color.BLACK;
    Color oldColor = Color.RED;
    Graphics2D g;

    public floodfill() {
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

        
        g.setColor(newcolor);
        g.drawRect(200, 150, 400, 300);

        //g.setColor(Color.BLACK);
        //g.drawString("Click inside the rectangle to fill", 20, 60);
    }

    // Boundary Fill using color checking (4-connected)
   private void floodfill(int x, int y, Color oldColor, Color newcolor) {
        if (x < 200 || y < 150 || x >= 600 || y >= 450)
            return;

        Color currentColor = new Color(canvas.getRGB(x, y), true);

        if (!currentColor.equals(oldColor) && !currentColor.equals(newcolor)) {
            canvas.setRGB(x, y, newcolor.getRGB());

			boundaryFill11(x + 1, y, oldColor, newcolor);
            boundaryFill11(x - 1, y, oldColor, newcolor);
            boundaryFill11(x, y + 1, oldColor, newcolor);
            boundaryFill11(x, y - 1, oldColor, newcolor); 
		}
   }
			
	public void paint(Graphics gScreen) {
        gScreen.drawImage(canvas, 0, 0, null);
    }

    public void mouseClicked(MouseEvent e) {
        boundaryFill11(e.getX(), e.getY(), fillColor, newcolor);
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new floodfill();
    }
}
