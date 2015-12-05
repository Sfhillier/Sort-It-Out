package Menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

 
public class Menu extends JPanel 
{ 
	
	JLabel label = new JLabel("Menu");
	JLabel labelTwo = new JLabel ("Please select one of the following:");
	JButton button1 = new JButton("Bubble Sort");
	JButton button2 = new JButton("Insertion Sort");
	JButton button3 = new JButton("Selection Sort");
	static JFrame frame = new JFrame("Sort It Out!"); 

	public static void main (String [] args){
		Menu menu = new Menu();
		 frame.setSize(400, 500);
		 frame.add(menu);
		// frame.pack(); 
		 frame.setVisible(true); 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
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
			                	frame.dispose();
			                	bubbleAnimation b = new bubbleAnimation();
			            		JFrame f1 = new JFrame();
			            		f1.add(b);
			            		f1.setVisible(true);
			            		f1.setSize(900,600);
			            		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			            		f1.setLocationRelativeTo(null);


			                }
			            }
			        );
				}
			public void playInsertion(){
				button2.addActionListener(
			            new ActionListener(){
			            	@Override
			                public void actionPerformed(ActionEvent e)
			                {
			                	frame.dispose();
			                	InsertionAnimation b = new InsertionAnimation();
			            		JFrame f2 = new JFrame();
			            		f2.add(b);
			            		f2.setVisible(true);
			            		f2.setSize(900,600);
			            		f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			            		f2.setLocationRelativeTo(null);


			                }
			            }
			        );
				}
			public void playSelection(){
				button3.addActionListener(
			            new ActionListener(){
			            	@Override
			                public void actionPerformed(ActionEvent e)
			                {
			                	frame.dispose();
			                	SelectionAnimation b = new SelectionAnimation();
			            		JFrame f3 = new JFrame();
			            		f3.add(b);
			            		f3.setVisible(true);
			            		f3.setSize(900,600);
			            		f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			            		f3.setLocationRelativeTo(null);


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

		} 
		

		   
		   
