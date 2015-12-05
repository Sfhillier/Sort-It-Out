package Menu;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Bubblesortgame extends JFrame {
	double numone;
	double numtwo;
	JFrame frame;
	JLabel lable;
	JTextField input;
	JButton submitButton;
	 static int[] arr = {5,6,7,2,1};
	
	JFrame window = new JFrame("Sort IT Out!");
	JLabel sit = new JLabel("Sort It Out !");
	JTextField anum = new JTextField(5);
	JLabel NumbersLabel = new JLabel("Switch First:");
	JTextField a = new JTextField(1);
	JTextField b = new JTextField(1);
	JTextField c = new JTextField(1);
	JTextField d = new JTextField(1);
	JTextField e = new JTextField(1);
	JLabel NTLabel = new JLabel(" Second Number to switch:" );
	JTextField numberThree = new JTextField(2);
	JButton b1 = new JButton("Sort");
	JPanel p1 = new JPanel();
	GridLayout g1 = new GridLayout(0,2);
  
	public Bubblesortgame(){
		p1.add(sit);
		p1.add(anum);
		p1.add( NumbersLabel);
		a.setSize(5,20);
		p1.add( a);
		p1.add(b);
		p1.add(c);
		p1.add(d);
		p1.add(e);

		//p1.add( NTLabel);
		//p1.add( numberThree);
		p1.add(b1);
		p1.setBackground(Color.WHITE);
		p1.setLayout(g1);
		 ActionListener listenerOne = new ClickListener(); 
		 b1.addActionListener(listenerOne);
		 window.add(p1);  
		 window.setSize(300,500);       
		 window.setVisible(true);
		     
	}
	private class ClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			sort();
		}
	}
	public void bubbleSort(){
		//arr = String.parseInt(arr.getarr());

		numone = Double.parseDouble(a.getText());
        
		numtwo = Double.parseDouble(b.getText());
		   
	}
	public void sort(){
		int left = 0;
		int right = arr.length-1;
		bubblesort(left,right);
		
	}
	private void bubblesort(int left, int right) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args){
		//printArray();
		//bubbleSort();
		System.out.println(arr);
		Bubblesortgame game = new Bubblesortgame();
		System.out.println();
		//printArray();
	}
	
		
}

