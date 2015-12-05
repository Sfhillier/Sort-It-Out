package Menu;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BBGame extends JPanel implements ActionListener {

	//declare ints
	Random rand = new Random();
	int[] rNum = new int[5];
	int[] arr = new int[5];
	//private static final String Empty = "Empty";
	JLabel RandomNum;
	JTextField firstNum;
	JTextField secondNum;
	JTextField thirdNum;
	JTextField fourthNum;
	JTextField fifthNum;
	JLabel sortSign ;
	JLabel RandomNum1;
	JLabel RandomNum2;
	JLabel RandomNum3;
	JLabel RandomNum4; 
	JLabel RandomNum5; 
	JTextArea answer;
	static JLabel space = new JLabel("                    " );
	private final JLabel sortedNum = new JLabel("sorted : ");
	private final JTextArea result = new JTextArea(" ");
	private static final Dimension TEXT_INPUT_DIM = new Dimension(50, 30);
	// private static final Dimension TEXT_OUTPUT_DIM = new Dimension(20, 50);


	public BBGame() {
		rNum[0]= rand.nextInt(100);
		rNum[1]= rand.nextInt(100);
		rNum[2]= rand.nextInt(100);
		rNum[3]= rand.nextInt(100);
		rNum[4]= rand.nextInt(100);

		//add items to gui
		setLayout(new GridLayout(3, 1));
		JPanel game = new JPanel();
		game.setLayout(new FlowLayout(10));
		sortSign = new JLabel("Sort these numbers: ");
		RandomNum1 = new JLabel(Integer.toString(rNum[0]));
		RandomNum2= new JLabel(Integer.toString(rNum[1]));
		RandomNum3= new JLabel(Integer.toString(rNum[2]));
		RandomNum4= new JLabel(Integer.toString(rNum[3])); 
		RandomNum5= new JLabel(Integer.toString(rNum[4])); 
		firstNum = new JTextField("");
		firstNum.setPreferredSize(TEXT_INPUT_DIM);
		secondNum = new JTextField("");
		secondNum.setPreferredSize(TEXT_INPUT_DIM);
		thirdNum = new JTextField("");
		thirdNum.setPreferredSize(TEXT_INPUT_DIM);
		fourthNum = new JTextField("");
		fourthNum.setPreferredSize(TEXT_INPUT_DIM);
		fifthNum = new JTextField("");
		fifthNum.setPreferredSize(TEXT_INPUT_DIM);

		// game.add(RandomNum);
		game.add(firstNum);
		game.add(secondNum);
		game.add(thirdNum);
		game.add(fourthNum);
		game.add(fifthNum);
		game.add(SortButton());
		add(initNum());
		add(game);
		add(createPanelResult());
	}

	private Component SortButton() {
		JButton sortButton = new JButton("Sort it out!");
		sortButton.addActionListener(this);
		return sortButton;
	}

	private final JPanel createPanelResult() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(sortedNum, BorderLayout.WEST);
		p.add(result, BorderLayout.CENTER);
		// p.add(answer,BorderLayout.SOUTH);
		return p;
	}

	private final JPanel initNum() {
		JPanel r = new JPanel();
		r.setLayout(new FlowLayout(10));
		r.add(sortSign);
		r.add(RandomNum1);
		r.add(RandomNum2);
		r.add(RandomNum3);
		r.add(RandomNum4);
		r.add(RandomNum5);

		return r;
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 300);
		f.setLocationRelativeTo(null);
		f.add(new BBGame());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		inputNum();
		bubbleSort();
		//isEqual();
		resultLabel();
	}  

	public void bubbleSort(){
		int temp;
		for(int i=0; i< rNum.length-1;i++){
			for(int j =1; j < rNum.length-i;j++ ){
				if(rNum[j-1]>rNum[j]){
					temp = rNum[j-1];
					rNum[j-1] = rNum[j];
					rNum[j]=temp;}			
			}System.out.print( Arrays.toString(rNum));
		}
	}

	public void inputNum(){
		arr[0]= Integer.parseInt(firstNum.getText());
		arr[1]= Integer.parseInt(firstNum.getText());
		arr[2]= Integer.parseInt(firstNum.getText());
		arr[3]= Integer.parseInt(firstNum.getText());
		arr[4]= Integer.parseInt(firstNum.getText());
	}

	/*  public boolean isEqual(int[] array){
    if(this.arr.length != rNum.length){return false;}
      for(int index =0; index<arr.length; index++){
    	  if(this.arr[index]!= rNum[index]){return false;}
      }return true;
    }*/

	private void resultLabel() {
		/* answer.setText("");
       for (int i =0; i< rNum.length;i++){
			   answer.append(rNum[i]+"\n");
            } 
    }*/
		for(int i = 0; i < arr.length; i++){

			if (arr[i] == rNum[i]){
				result.append(rNum[i]+"\n");
			}
			else
				result.append("Try Again ");	
		}
	}
}
