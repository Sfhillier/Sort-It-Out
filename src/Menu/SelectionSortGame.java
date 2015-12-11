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

public class SelectionSortGame extends JPanel implements ActionListener {

	//declare ints
	int userIndex = 1;
	int demoIndex = 1;
	public boolean firstPass = true;
	boolean isSorted = false;
	Random rand = new Random();
	int[] rNum = new int[5];
	int[] arr = new int[5];
	//private static final String Empty = "Empty";
	JLabel RandomNum;
	JLabel selectionSort;
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

	public SelectionSortGame() {
		Set<Integer> set = new LinkedHashSet<>();
		while(set.size()<rNum.length){
			set.add(rand.nextInt(99)+1);
		}
		int pos =0;
		for (Integer v: set){
			rNum[pos++]=v;
		}
		//add items to gui
		setLayout(new GridLayout(4, 1));
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
		selectionSort = new JLabel("Selection Sort");
		selectionSort.setFont(selectionSort.getFont().deriveFont(24f));
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
		t.add(selectionSort);
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
		f.add(new SelectionSortGame());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Runs the selection sort method the first time regardless
		if(firstPass == true){
			selectionSort(rNum, demoIndex);
			demoIndex++;
		}
		// If not the first pass, it checks the two arrays for equality
		else{
			// If they're equal it will run another pass of both arrays through the loop
			if(Arrays.equals(arr,  rNum)){
				selectionSort(arr, userIndex);
				selectionSort(rNum, demoIndex);
				userIndex++;
				demoIndex++;
			}
			else{

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
			
			if(arr[checkIndex]>arr[checkIndex+1]){
				
				break;
				
			}else if(arr[checkIndex]>arr[checkIndex+1]){
				break;
			}
			checkIndex++;
		}
		// Prints out the message that the sort is done once the user has finished it
		if(checkIndex == arr.length-1){
			result.append("Congratulations, you have sorted the array!");
		
		}
		
		
		
		// Resets the values of the text fields for the next step
		firstNum.setText("");
		secondNum.setText("");
		thirdNum.setText("");
		fourthNum.setText("");
		fifthNum.setText("");
	}  

	public void selectionSort(int[] array, int index){
		
		int currentMin = 0, temp = 0;
		for (int i = 0; i < index; i++){
			currentMin = i;
			for (int j = i+1; j < array.length; j++){
				if(array[j]<array[currentMin]){
					currentMin = j;
				}
			}
			temp = array[i];
			array[i] = array[currentMin];
			array[currentMin] = temp;    		
		}
		System.out.print(Arrays.toString(array)); 
	}
	
	public void inputNum(){

	    if(firstNum.getText().length()>=3)
	    {
	        firstNum.setText(firstNum.getText().substring(0, 2));
	    }
	    if(secondNum.getText().length()>=3)
	    {
	        secondNum.setText(secondNum.getText().substring(0, 4));
	    }
	    if(thirdNum.getText().length()>=3)
	    {
	        thirdNum.setText(thirdNum.getText().substring(0, 2));
	    }
	    if(fourthNum.getText().length()>=3)
	    {
	        fourthNum.setText(fourthNum.getText().substring(0, 4));
	    }
	    if(fifthNum.getText().length()>=3)
	    {
	        fifthNum.setText(fifthNum.getText().substring(0, 2));
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
