import java.awt.*;
import javax.swing.*;

class BlendOval3 extends JFrame{
	BlendOval3(){
		setTitle("BlendOval3");
		setSize(800,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
					
		g.setColor(Color.blue);
		
		int t1=100;
		for(int i=0;i<50;i++){
			g.drawOval(225,t1,50,50);
			t1=t1+5;
		}
		
		g.setColor(Color.red);
		int t2=100;
		for(int i=0;i<50;i++){
			g.drawOval(t2,225,50,50);
			t2=t2+5;
		}
	}
	
	public static void main(String[] args){
		new BlendOval3();
	}
}