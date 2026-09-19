import java.awt.*;
import javax.swing.*;

class Arcs extends JFrame{
	Arcs(){
		setTitle("Frame");
		setSize(800,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
					
		g.setColor(Color.red);
		g.fillArc(100,100,50,50,180,180);
		
		g.setColor(Color.red);
		g.fillArc(200,100,100,100,0,180);
		
		g.setColor(Color.red);
		g.fillArc(100,200,100,100,0,270);
		
		g.setColor(Color.red);
		g.fillArc(220,200,100,100,180,270);
		
		g.setColor(Color.red);
		g.fillArc(300,300,50,50,0,360);
		
		
		
		
	}
	
	public static void main(String[] args){
		new Arcs();
	}
}