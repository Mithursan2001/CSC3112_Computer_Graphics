import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BresenhamAlgo extends JFrame implements MouseListener{
	Graphics g;
	Graphics2D g2=(Graphics2D) g;
	int x1,y1,x2,y2;
	boolean isDraw=false;
	BresenhamAlgo(){
		setTitle("Bresenham Algorithm");
		setSize(800,600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		g=getGraphics();
		g2=(Graphics2D)g;
	}
	
	public void bresenhamLineAlgo(int x1,int y1,int x2,int y2){
		int dx=x2-x1;
		int dy=y2-y1;
		int p=2*dy-dx;
		int x=x1;
		int y=y1;
		
		g.drawLine(x,y,x,y);
		
		for(int i=x1; i<=x2; i++){
			if(p<0){
				x=x+1;
				y=y;
				p+=2*dy;
			}
			else{
				x=x+1;
				y=y+1;
				p+=2*dy-2*dx;
			}
			g.drawLine(x,y,x,y);
		}
	}
	
	public void mouseClicked(MouseEvent e){
		if(!isDraw){
			int x=e.getX();
			int y=e.getY();
			Font myFont = new Font("Arial", Font.BOLD,24);
			g2.setFont(myFont);
			g2.drawString("BresenhamLine",x,y);
			isDraw=true;
		}	
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){
		x1=e.getX();
		x1=e.getX();
		y1=e.getY();
	}
	public void mouseReleased(MouseEvent e){
		x2=e.getX();
		y2=e.getY();
		g2.setColor(Color.red);
		g2.setStroke(new BasicStroke(3));
		bresenhamLineAlgo(x1,y1,x2,y2);
	}
	
	public static void main(String[] args){
		new BresenhamAlgo();
	}
}