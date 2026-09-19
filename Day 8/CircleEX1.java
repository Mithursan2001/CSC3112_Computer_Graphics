import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleEX1 extends JFrame implements MouseListener{
	int xc,yc,r;
	boolean isDraw=false;
	Graphics g;

	CircleEX1(){
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
		g.setColor(Color.magenta);
		g.fillRect(xc+x, yc-y,5,5);
		g.setColor(Color.magenta);
		g.fillRect(xc+y, yc-x,5,5);
		g.setColor(Color.magenta);
		g.fillRect(xc+y, yc+x,5,5);
		g.setColor(Color.magenta);
		g.fillRect(xc+x, yc+y,5,5);
		g.setColor(Color.magenta);
		g.fillRect(xc-x, yc+y,5,5);
		g.setColor(Color.magenta);
		g.fillRect(xc-y, yc+x,5,5);
		g.setColor(Color.magenta);
		g.fillRect(xc-y, yc-x,5,5);
		g.setColor(Color.magenta);
		g.fillRect(xc-x, yc-y,5,5);	
	}
	
	
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){
		int xc=e.getX();
		int yc=e.getY();
		int offset=98;
		g.setColor(Color.magenta);
		drawCircle(xc,yc,100);
		g.setColor(Color.green);
		drawCircle(xc-offset,yc,20);
		drawCircle(xc+offset,yc,20);
		g.setColor(Color.blue);
		drawCircle(xc,yc-offset,20);
		drawCircle(xc,yc+offset,20);
		g.setColor(Color.red);
		drawCircle(xc-68,yc-68,20);
		drawCircle(xc+68,yc+68,20);
		g.setColor(Color.orange);
		drawCircle(xc-68,yc+68,20);
		drawCircle(xc+68,yc-68,20);
		
		for(int i=10; i<=70; i=i+10){
			if(i%20==0){
				g.setColor(Color.magenta);
			}
			else{
				g.setColor(Color.pink);
			}
		}
	}	
	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}

	public static void main(String[] args){
		new CircleEX1();
	}
}