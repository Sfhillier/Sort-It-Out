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
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SelectionSortGame extends JPanel implements ActionListener {
  
   //declare ints
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
		private String sansarif;
	    private static final Dimension TEXT_INPUT_DIM = new Dimension(50, 30);
	   // private static final Dimension TEXT_OUTPUT_DIM = new Dimension(20, 50);

	    
    public SelectionSortGame() {
    	for(int i = 0;i< rNum.length;++i){
    		
    	rNum[i]= rand.nextInt(99)+1;
    	
       	//rNum[1]= rand.nextInt(99)+1;
       //	rNum[2]= rand.nextInt(99)+1;
       //	rNum[3]= rand.nextInt(99)+1;
       //	rNum[4]= rand.nextInt(99)+1;
    		
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
    	selectionSort();
    	inputNum();
    	//isEqual();
    	resultLabel();
            }  
    
    public void selectionSort(){
    	int min;
    	int temp;
    for (int i = 0;i < rNum.length-1;i++){
    	min=i;
    	for (int j = i+1; j < rNum.length;j++){
    		if(rNum[j]<rNum[min]){
    			min=j;}
    	}
    		if(min!=i){
    		 temp = rNum[i];
    		rNum[i] = rNum[min];
    		rNum[min] = temp;
    			}
    			}System.out.print(Arrays.toString(rNum));	

    	    		    }
    
     public void inputNum(){
    
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

