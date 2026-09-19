import javax.swing.*;

class SecondFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(new java.awt.Point(100,30));
		frame.setTitle("My 2nd Frame");
		
		JButton btn = new JButton("Click");  //Create the button
		btn.setBounds(130,100,100,40);
		
		frame.add(btn);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}