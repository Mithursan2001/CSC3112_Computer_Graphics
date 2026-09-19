import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class incrementalDDA extends JFrame implements MouseListener{
	Graphics g;
	Graphics2D g2=(Graphics2D) g;
	int x1,y1,x2,y2;
	boolean isDraw=false;
	incrementalDDA(){
		setTitle("incremental DDA");
		setSize(800,600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		g=getGraphics();
		g2=(Graphics2D)g;
	}
	
	public void incrementalLineAlgo(int x1,int y1,int x2,int y2){
		if(x1>x2){
			incrementalLineAlgo(x2,y2,x1,y1);
		}
		double y=y1;
		double m=(double)(y2-y1)/(x2-x1);
		
		if(Math.abs(m)<=1){
			for(int i=x1; i<=x2; i++){
				g.drawLine((int)Math.round(i),(int)Math.round(y),
				(int)Math.round(i),(int)Math.round(y));
				y=y+m;
			}
		}
		else{
			System.out.println("Error in Slope");
		}
	}
	
	public void mouseClicked(MouseEvent e){
		if(!isDraw){
			int x=e.getX();
			int y=e.getY();
			Font myFont = new Font("Arial", Font.BOLD,24);
			g2.setFont(myFont);
			g2.drawString("IncrementalLine",x,y);
			isDraw=true;
		}	
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){
		x1=e.getX();
		y1=e.getY();
	}
	public void mouseReleased(MouseEvent e){
		x2=e.getX();
		y2=e.getY();
		g2.setColor(Color.red);
		g2.setStroke(new BasicStroke(3));
		incrementalLineAlgo(x1,y1,x2,y2);
	}
	
	public static void main(String[] args){
		new incrementalDDA();
	}
}