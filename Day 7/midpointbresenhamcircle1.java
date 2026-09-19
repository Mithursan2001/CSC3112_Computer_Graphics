import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class midpointbresenhamcircle1 extends JFrame implements MouseListener{
	int xc,yc,r;
	boolean isDraw=false;
	Graphics g;

	midpointbresenhamcircle1(){
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
		int p=3-2*r;
		
		while(x<=y){
			plotCirclePoints(xc,yc,x,y);
			if(p<0)
				p=p+4*x+6;
			else{
				p=p+4*(x-y)+10;
				y=y-1;
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
		if(!isDraw){
		int xc=e.getX();
		int yc=e.getY();
		for(int i=150; i>=30;i=i-10){
			drawCircle(xc,yc,i);
		}
		isDraw=true;
		}

	}	
	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}

	public static void main(String[] args){
		new midpointbresenhamcircle1();
	}
}