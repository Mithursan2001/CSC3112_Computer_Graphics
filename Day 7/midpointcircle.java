import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class midpointcircle extends JFrame implements MouseListener{
	int xc,yc,r;
	boolean isDraw=false;
	Graphics g;

	midpointcircle(){
		setTitle("Midpoint Circle Algorithm");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		g=getGraphics();
	}
	
	public void drawCircle(int xc,int yc,int r){
		int x=0;
		int y=r;
		int p=1-r;
		
		while(x<=y){
			plotCirclePoints(xc,yc,x,y);
			if(p<0)
				p=p+2*x+3;
			else{
				p=p+2*(x-y)+5;
				y--;
			}
			x++;
		}	
	}
	
	public void plotCirclePoints(int xc, int yc, int x, int y){
		g.setColor(Color.red);
		g.fillRect(xc+x, yc-y,5,5);
		g.setColor(Color.yellow);
		g.fillRect(xc+y, yc-x,5,5);
		g.setColor(Color.green);
		g.fillRect(xc+y, yc+x,5,5);
		g.setColor(Color.cyan);
		g.fillRect(xc+x, yc+y,5,5);
		g.setColor(Color.blue);
		g.fillRect(xc-x, yc+y,5,5);
		g.setColor(Color.orange);
		g.fillRect(xc-y, yc+x,5,5);
		g.setColor(Color.magenta);
		g.fillRect(xc-y, yc-x,5,5);
		g.setColor(Color.pink);
		g.fillRect(xc-x, yc-y,5,5);	
	}
	
	
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){
		int xc=e.getX();
		int yc=e.getY();
		drawCircle(xc,yc,100);
	}	
	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}

	public static void main(String[] args){
		new midpointcircle();
	}
}