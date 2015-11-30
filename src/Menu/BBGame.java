import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BBGame extends JPanel implements ActionListener {
  
   //declare ints
		private static String BubbleSort = "Bubble sort";
	    private static  String InsetionSort = "Insertion sort";
	    private static  String QuickSort = "Quick sort";
	    private static final String Empty = "Empty";

	    public JTextField firstNum = new JTextField();
	    public JTextField secondNum = new JTextField();
	    public JTextField thirdNum = new JTextField();
	    public JTextField fourthNum = new JTextField();
	    public JTextField fithNum = new JTextField();
	    private final JLabel sortedNum = new JLabel("sorted : ");
	    private final JLabel result = new JLabel(Empty);
	    private static final Dimension TEXT_INPUT_DIM = new Dimension(20, 30);

	    
    public BBGame() {
    	//add items to gui
        setLayout(new GridLayout(2, 1));
        JPanel game = new JPanel();
        game.setLayout(new FlowLayout(10));
        firstNum.setPreferredSize(TEXT_INPUT_DIM);
        secondNum.setPreferredSize(TEXT_INPUT_DIM);
        thirdNum.setPreferredSize(TEXT_INPUT_DIM);
        fourthNum.setPreferredSize(TEXT_INPUT_DIM);
        fithNum.setPreferredSize(TEXT_INPUT_DIM);

        game.add(firstNum);
        game.add(secondNum);
        game.add(thirdNum);
        game.add(fourthNum);
        game.add(fithNum);
        game.add(SortButton());
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
        return p;
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
    	 String content = firstNum.getText();
    	 String content1 = secondNum.getText();
           

            }   

    private String resultLab(int[] r) {
        StringBuilder result = new StringBuilder();
        for (int nb : r) {
            result.append(nb + " ");
        }
        return result.toString();
    }

    private final boolean isSortable(String[] numbers) {
        return true;
    }

    private int[] bubbleSort(boolean sortAscending) {
        return new int[] {};
    }

    private int[] insertionSort(boolean sortAscending) {
        return new int[] {};
 
    }

    private int[] quickSort(boolean sortAscending) {
        return new int[] {};

    }

}

