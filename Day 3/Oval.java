import java.awt.*;
import javax.swing.*;

class Oval extends JFrame{
	Oval(){
		setTitle("Oval");
		setSize(800,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
					
		g.setColor(Color.green);
		g.fillRect(0,0,800,800);
				
		g.setColor(Color.black);
		g.fillOval(200,200,200,200);
		
		g.setColor(Color.white);
		g.fillOval(220,220,160,160);
		
	}
	
	public static void main(String[] args){
		new Oval();
	}
}