import javax.swing.*;

public class FirstFrame{
	public static void main(String[] args){
		JFrame frm = new JFrame();
		
		frm.setSize(400,300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocation(new java.awt.Point(100,30));
		frm.setTitle("My 1st Frame");
		frm.setVisible(true);
	}
}