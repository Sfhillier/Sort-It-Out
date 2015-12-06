package Menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

 
public class Menu extends JPanel { 
	
	JLabel label = new JLabel("Menu");
	JLabel labelTwo = new JLabel ("Please select one of the following:");
	JToggleButton button1 = new JToggleButton("Bubble Sort");
	JToggleButton button2 = new JToggleButton("Insertion Sort");
	JToggleButton button3 = new JToggleButton("Selection Sort");
	JButton back = new JButton("Back");
	
	static int index;
	
	static boolean button2IsPressed;


	static JFrame frame = new JFrame("Sort It Out!"); 
	static Menu menu = new Menu();
	static bubbleAnimation B = new bubbleAnimation();
	static SelectionAnimation S = new SelectionAnimation();
	static InsertionAnimation I = new InsertionAnimation();


	static Object[] panels = {menu,B,S,I};
	
	static //creates card layout
	CardLayout cl = new CardLayout();
	//panel to hold the others
	static JPanel control = new JPanel();

	
	public static Object algorithms(int index) {
		return panels[index];
	}

		public Menu() 
		{
			
			setLayout(new GridLayout(3,1));
			JPanel one = new JPanel();
		//	setLayout(new GridLayout(2,1));
			//JPanel mid = new JPanel();
			one.add(label,null );
			
			label.setFont(label.getFont().deriveFont(64.0f));
			
			one.add(label);
			one.add(labelTwo);
			add(one);
			add(Mid());
			add(Two());
			
			this.playBubble();
			this.playInsertion();
			this.playSelection();
			this.goBack();
			
		}
		public JPanel Mid(){
			label.setFont(label.getFont().deriveFont(64.0f));
			JPanel m = new JPanel();
			m.add(labelTwo);
			return m;
		}
		
			public JPanel Two(){
				button1.setPreferredSize(new Dimension(100, 100));
				button2.setPreferredSize(new Dimension(100, 100));
				button3.setPreferredSize(new Dimension(100, 100));
				JPanel p = new JPanel();
				p.setLayout(new FlowLayout());
				p.add(button1, null);
				p.add(button2, null);
				p.add(button3, null);
				return p;
			}
		
			
			public void playBubble(){
				button1.addActionListener(
			            new ActionListener(){
			            	@Override
			                public void actionPerformed(ActionEvent e)
			                {
			            		
			            		B.add(back);
						    	cl.show(control, "bubble");
				
			               

			                }
			            }
			        );
				}
			public void playInsertion(){
				button2.addActionListener(new ActionListener() {

				    @Override
				    public void actionPerformed(ActionEvent e) {
				        I.add(back);
				    	cl.show(control, "insertion");
				    	
				    }
				});
				}
			public void goBack(){
				back.addActionListener(new ActionListener() {

				    @Override
				    public void actionPerformed(ActionEvent e) {
				    	cl.show(control, "menu");
				    	
				    }
				});
				}
			public void playSelection(){
				button3.addActionListener(
			            new ActionListener(){
			            	@Override
			                public void actionPerformed(ActionEvent e)
			                {
			            	S.add(back);
			            	cl.show(control, "selection");


			                }
			            }
			        );
				}
			    
			
			
			
			
			/*JPanel keyPanel = new JPanel(new FlowLayout ());
			
			
			
			this.setLayout (new FlowLayout());
	
			
			

			
			
			keyPanel.add();
	
			
			  keyPanel.add(label);
				keyPanel.add(labelTwo);
				keyPanel.add(button1);
				keyPanel.add(button2);
				keyPanel.add(button3);
			
			
			
	       /* Box box = Box.createVerticalBox();
	        box.add(label);
	        box.add(Box.createVerticalStrut(10));
	        box.add(labelTwo);
	        box.add(Box.createVerticalStrut(10));
	        box.add(button1);
	        box.add(Box.createVerticalStrut(10)); 
	        box.add(button2);
	        box.add(Box.createVerticalStrut(10));
	        box.add(button3);
	        box.add(Box.createVerticalStrut(10));
	       keyPanel.add(box);
			
	        
	   	this.add(one, BorderLayout.CENTER);*/
public static void main (String [] args){
		//Menu menu = new Menu();
		
		control.setLayout(cl);
		control.add(menu, "menu");
		control.add(I, "insertion");
		control.add(B,"bubble");
		control.add(S,"selection");

		cl.show(control,"menu");
		
		frame.setSize(900, 600);
		frame.add(control);
		// frame.pack(); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
	}

		} 
		

		   
		   
