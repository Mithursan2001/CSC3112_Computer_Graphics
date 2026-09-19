import java.awt.*;
import javax.swing.*;

class GraphicElements extends JFrame{
	GraphicElements(){
		setTitle("Frame");
		setSize(1000,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.green);
		/* g.drawLine(50,25,100,25);
		
		g.setColor(Color.red);
		g.drawLine(100,25,100,75);
		
		g.setColor(Color.yellow);
		g.drawLine(100,75,50,75);
		
		g.setColor(Color.blue);
		g.drawLine(50,75,50,25);
	
				
		
		g.setColor(Color.green);
		g.drawLine(100,150,200,150);
		
		g.setColor(Color.red);
		g.drawLine(200,150,200,170);
		
		g.setColor(Color.yellow);
		g.drawLine(200,170,100,170);
		
		g.setColor(Color.blue);
		g.drawLine(100,170,100,150);
		
		
		
		g.setColor(Color.green);
		g.drawLine(200,200,300,400);
		
		g.setColor(Color.red);
		g.drawLine(300,400,100,400);
		
		g.setColor(Color.yellow);
		g.drawLine(100,400,200,200); */
		
		
		g.setColor(Color.green);
		g.drawRect(40,50,100,200);
		g.setColor(Color.blue);
		g.fillRect(40,50,100,200);
		
		g.setColor(Color.pink);
		g.drawString("Hi",200,300);
		
		g.setColor(Color.blue);
		g.drawOval(200,300,100,200);
		
		
	}
	
	public static void main(String[] args){
		new GraphicElements();
	}
}