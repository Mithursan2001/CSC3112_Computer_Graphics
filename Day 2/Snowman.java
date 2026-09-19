import java.awt.*;
import javax.swing.*;

class Snowman extends JFrame{
	Snowman(){
		setTitle("Frame");
		setSize(800,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		
		g.setColor(Color.black);
		g.fillArc(250,50,100,100,0,180);
		

		g.setColor(Color.red);
		g.fillArc(250,100,100,100,0,360);
		
		g.setColor(Color.black);
		g.fillArc(280,120,10,10,0,360);
		
		g.setColor(Color.black);
		g.fillArc(310,120,10,10,0,360);
		
		g.setColor(Color.blue);
		g.fillArc(290,140,20,20,0,360);
		
		g.setColor(Color.black);
		g.fillArc(280,150,40,40,180,180);
		
		
		
		g.setColor(Color.red);
		g.fillArc(200,200,200,200,0,360);
		
		g.setColor(Color.black);
		g.fillArc(290,250,20,20,0,360);
		
		g.setColor(Color.black);
		g.fillArc(290,290,20,20,0,360);
		
		g.setColor(Color.black);
		g.fillArc(290,330,20,20,0,360);
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args){
		new Snowman();
	}
}