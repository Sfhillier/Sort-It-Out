package Menu;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InsertionSortGame extends JPanel implements ActionListener {

	//declare ints
	int userIndex = 1;
	int demoIndex = 1;
	public boolean firstPass = true;
	boolean isSorted = false;
	Random rand = new Random();
	int[] rNum = new int[5];
	int[] arr = new int[5];
	JLabel RandomNum;
	JLabel InsertionSort;
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
	static JLabel space = new JLabel(" " );
	private final JLabel sortedNum = new JLabel("sorted : ");
	private final JTextArea result = new JTextArea(" ");
	private static final Dimension TEXT_INPUT_DIM = new Dimension(50, 30);

	public InsertionSortGame() {

		Set<Integer> set = new LinkedHashSet<>();
		while(set.size()<rNum.length){
			set.add(rand.nextInt(99)+1);
		}
		int pos =0;
		for (Integer v: set){
			rNum[pos++]=v;
		}//add items to gui
		setLayout(new GridLayout(4, 1));
		JPanel game = new JPanel();
		game.setLayout(new FlowLayout(10));
		sortSign = new JLabel("Sort these numbers: ");

		RandomNum1 = new JLabel(Integer.toString(rNum[0]));
		RandomNum2= new JLabel(Integer.toString(rNum[1]));
		RandomNum3= new JLabel(Integer.toString(rNum[2]));
		RandomNum4= new JLabel(Integer.toString(rNum[3])); 
		RandomNum5= new JLabel(Integer.toString(rNum[4])); 
		firstNum = new JTextField();
		firstNum.setPreferredSize(TEXT_INPUT_DIM);
		secondNum = new JTextField("");
		secondNum.setPreferredSize(TEXT_INPUT_DIM);
		thirdNum = new JTextField("");
		thirdNum.setPreferredSize(TEXT_INPUT_DIM);
		fourthNum = new JTextField("");
		fourthNum.setPreferredSize(TEXT_INPUT_DIM);
		fifthNum = new JTextField("");
		fifthNum.setPreferredSize(TEXT_INPUT_DIM);
		InsertionSort = new JLabel("Insertion Sort");
		InsertionSort.setFont(InsertionSort.getFont().deriveFont(24f));
		// game.add(RandomNum);
		game.add(firstNum);
		game.add(secondNum);
		game.add(thirdNum);
		game.add(fourthNum);
		game.add(fifthNum);
		game.add(SortButton());
		add(title());
		add(initNum());
		add(game);
		add(createPanelResult());
	}

	private Component SortButton() {
		JButton sortButton = new JButton("Sort it out!");
		sortButton.addActionListener(this);
		return sortButton;
	}
	private final JPanel title(){
		JPanel t = new JPanel();
		t.setLayout(new FlowLayout());
		t.add(InsertionSort);
		return t;
	}
	private final JPanel createPanelResult() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(sortedNum, BorderLayout.WEST);
		p.add(result, BorderLayout.CENTER);
		result.setEditable(false);
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
		f.setSize(600, 400);
		f.setLocationRelativeTo(null);
		f.add(new InsertionSortGame());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Runs the bubble sort method the first time regardless
		if(firstPass == true){
			insertionSort(rNum, demoIndex);
		}
		// If not the first pass, it checks the two arrays for equality
		else{
			// If they're equal it will run another pass of both arrays through the loop
			if(Arrays.equals(arr,  rNum)){
				insertionSort(arr, userIndex);
				insertionSort(rNum, demoIndex);
				userIndex++;
				demoIndex++;
			}
		}
		firstPass = false;

		inputNum();

		// Checks for equality in the arrays and runs the next pass
		// if they are equal
		resultLabel();

		// Checks to see if the array has been properly sorted
		// Once it sees one imperfection it stops
		// If it makes it all the way though it will
		// Congratulate the user
		int checkIndex = 0;
		while(checkIndex < arr.length-1){
			// This condition is to check the last index since checkIndex+1 would produce 
			// an out of bounds exception
			if(checkIndex+1 == arr.length && arr[checkIndex-1]<arr[checkIndex]){
				break;
			}
			else if(arr[checkIndex]>arr[checkIndex+1]){
				break;
			}
			checkIndex++;
		}
		// Prints out the message that the sort is done once the user has finished it
		if((checkIndex == arr.length-1) && (arr[checkIndex-1]< arr[checkIndex])){
			result.append("Congratulations, you have sorted the array!");
		}

		// Resets the values of the text fields for the next step
		firstNum.setText("");
		secondNum.setText("");
		thirdNum.setText("");
		fourthNum.setText("");
		fifthNum.setText("");

	}  

	public void insertionSort(int[] array, int index){
		//http://stackoverflow.com/questions/31968697/how-to-sort-an-array-in-a-single-loop
		for(int i = index ; i < array.length ;){
			if(array[i] < array[i-1]){
				int temp = array[i];
				array[i] = array[i -1];
				array[i -1] = temp;
				i--; break;
			} else{i++;}
		}
		System.out.print(Arrays.toString(rNum)); 
		return;
	}

	public void inputNum(){

		// Manual data validation
		// This section checks for any invalid data and then either
		// manipulates the data to get a two digit integer
		// or just enters a 100 so that it doesn't mess up the sort
		// if the input doesn't match the regular expression 0-9.  
		// The reason I used this instead of instant data validation 
		// is because the method does other things after the button press, 
		// but before it parses the input
	    String regExpression = "[0-9]";
		if(firstNum.getText().length()>=3)
	    {
	        firstNum.setText(firstNum.getText().substring(0, 2));
	    }
	    else if(firstNum.getText().isEmpty()){
	    	firstNum.setText("100");
	    }
	    else if(!firstNum.getText().matches(regExpression)){
	    	firstNum.setText("100");
	    }
	    if(secondNum.getText().length()>=3)
	    {
	        secondNum.setText(secondNum.getText().substring(0, 4));
	    }
	    else if(secondNum.getText().isEmpty()){
	    	secondNum.setText("100");
	    }
	    else if(!secondNum.getText().matches(regExpression)){
	    	secondNum.setText("100");
	    }
	    if(thirdNum.getText().length()>=3)
	    {
	        thirdNum.setText(thirdNum.getText().substring(0, 2));
	    }
	    else if(thirdNum.getText().isEmpty()){
	    	thirdNum.setText("100");
	    }
	    else if(!thirdNum.getText().matches(regExpression)){
	    	thirdNum.setText("100");
	    }
	    if(fourthNum.getText().length()>=3)
	    {
	        fourthNum.setText(fourthNum.getText().substring(0, 4));
	    }
	    else if(fourthNum.getText().isEmpty()){
	    	fourthNum.setText("100");
	    }
	    else if(!fourthNum.getText().matches(regExpression)){
	    	fourthNum.setText("100");
	    }
	    if(fifthNum.getText().length()>=3)
	    {
	        fifthNum.setText(fifthNum.getText().substring(0, 2));
	    }
	    else if(fifthNum.getText().isEmpty()){
	    	fifthNum.setText("100");
	    }
	    else if(!fifthNum.getText().matches(regExpression)){
	    	fifthNum.setText("100");
	    }
	    
		arr[0]= Integer.parseInt(firstNum.getText());
		arr[1]= Integer.parseInt(secondNum.getText());
		arr[2]= Integer.parseInt(thirdNum.getText());
		arr[3]= Integer.parseInt(fourthNum.getText());
		arr[4]= Integer.parseInt(fifthNum.getText());
	}

	private void resultLabel() {
		for(int i = 0; i < arr.length; i++){
			if (rNum[i] == arr[i]){
				result.append(rNum[i]+" ");
			}
			else
				result.append("Try Again ");	
		}result.append("\n");
	}
}

