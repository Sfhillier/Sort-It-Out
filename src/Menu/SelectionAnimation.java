<<<<<<< HEAD
package Menu;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import javax.swing.*;
import java.util.*;

public class SelectionAnimation extends JPanel implements MouseListener {
	// Java.util timer which operates by schedules.
			Timer t = new Timer();
		    Timer t1 = new Timer();
		    Timer t2 = new Timer();
		    Timer t3 = new Timer();

		    
		    //x values of each nodes
		    int x=250;
		    int x1=250;
		    int x2=250;
		    int x3=250;
		    int x4=250;
		   

		    //y value of each nodes
		    int y=100;
		    int y1=100;
		    int y2=100;
		    int y3=100;
		    int y4=100;
		   

		   
		    int delay = 1000;
		    
		    //booleans to use for specify shadowing and some other cacpabilities.
		    boolean sortedNode5;
		    boolean sortedNode4;
		    boolean sortedNode3;
		    boolean sortedNode2;
		    boolean sortedNode1;
		    boolean sortedNode;
		    
		    boolean printText = false;
		    boolean printText1 = false;
		    boolean printText2 = false;
		    boolean printText3 = false;
		   
		    boolean notTranslate;

		    int timeInterval = 5;

			static JButton skip = new JButton("Skip to Game");
			static JFrame f = new JFrame();
			//static JPanel p = new JPanel();
			
			int translateX;

			JButton start = new JButton("Start");

		    String[] instructions = {"      Selection Sort Algorithm:",
					
		    		"Find the minimum value in the list",
					"Swap the minimum value with the value in the first position ", 
					
					"We know that the first element is in its rightful (correct) position.",
					
					
					"Repeat the steps for the remainder of the list",
					"starting at the second position and advancing each time.",
					
		    		"Repeat until all the elements are in the sorted array."};

		    
		    public  SelectionAnimation() {
			
		    	this.setBackground(Color.white); 
		    	addMouseListener(this);
		    //	p.setLayout(new GridLayout());
		    	this.add(skip);
		    	this.add(start);
		    	//way to intantiate the animation. 
		    	
		    	if(notTranslate==true){
		    		translateX=70;
		    	}else{
		    		translateX=0;
		    	}
		    	
		    	this.skip();
		    	this.start();

		    }
		 
		 
			Shape rect = new Rectangle2D.Double(330,10,235,25);

			public void paintComponent(Graphics g){
				
				super.paintComponent(g);
			    Graphics2D g2 = (Graphics2D)g;
			    
			   
			    // center the nodes.
				g2.translate(translateX, 0);

				
				//create our nodes.
				Shape ellipse = new Ellipse2D.Double(x-200, y, 50, 50);
				Shape ellipse1 = new Ellipse2D.Double(x1-150, y1, 50, 50);
				Shape ellipse2 = new Ellipse2D.Double(x2-100, y2, 50, 50);
				Shape ellipse3 = new Ellipse2D.Double(x3-50, y3, 50, 50);
				Shape ellipse4 = new Ellipse2D.Double(x4, y4, 50, 50);
				

				g2.setColor(Color.lightGray);
				g2.fill(ellipse);
				g2.fill(ellipse1);
				g2.fill(ellipse2);
				g2.fill(ellipse3);
				g2.fill(ellipse4);	
				
				// set transparency
				AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.DST_ATOP, 0.4f);
				g2.setComposite(ac);
				
				// draw transparent text
				Font font = new Font("Serif", Font.BOLD, 30);
				g2.setFont(font);
				g2.drawString("9", x-183, y+35);
				g2.drawString("7", x1-133, y1+35);
				g2.drawString("4", x2-83, y2+35);
				g2.drawString("5", x3-33, y3+35);
				g2.drawString("1", x4+17, y4+35);
				
				

				if(sortedNode==true){
					g2.setColor(Color.red);
					g2.fill(ellipse);
				}
				if(sortedNode1==true){
					g2.setColor(Color.red);
					g2.fill(ellipse1);
				}
				if(sortedNode2==true){
					g2.setColor(Color.red);
					g2.fill(ellipse2);
				}
				if(sortedNode3==true){
					g2.setColor(Color.red);
					g2.fill(ellipse3);
				}
				if(sortedNode4==true){
					g2.setColor(Color.red);
					g2.fill(ellipse4);
				}
			
				
				

				g2.drawString(instructions[0], 300, 200);
				
				Font font2 = new Font("Serif", Font.PLAIN, 18);
				g2.setFont(font2);
				
				if(printText){
					
					g2.drawString(instructions[1], 350, 230);
					g2.drawString(instructions[2], 350, 260);
					g2.drawString(instructions[3], 350, 290);
					
				}
				
				if(printText1){
					
					
					g2.drawString(instructions[4], 350, 320);
					g2.drawString(instructions[5], 350, 350);
					
				}
				
				if(printText2){
					g2.drawString(instructions[6], 350, 380);
					g2.drawString(instructions[7], 350, 410);
					
				}
				
				
			    repaint();
			    
			    
			}
			
		
			
			/*******************************
			 * start of first swap
			 */
			
			
			TimerTask down = new TimerTask(){
				
				public void run(){

				 printText = true;	
					
					y=y+1;
					y4=y4+1;
					if(y==300){
						
						y=y-1;
						y4=y4-1;
					}
				}
			};
			
			TimerTask swap = new TimerTask(){

				//@Override
				public void run(){
					
					x = x+1;
					x4= x4-1;
					if(x4==50){
						x = x-1;
						x4 = x4+1;	
					}
				}
			};
			
			TimerTask up = new TimerTask(){

				public void run(){
					
					y = y-2;
					y4 = y4-2;
					if(y<100){
						y = y+1;
						y4 = y4+1;	
						t.cancel();
					}
				}
			};
			
			
			/*******************************
			 * end of first  swap
			 */
			
			
			/*******************************
			 * start of second swap
			 */
			
			TimerTask down1 = new TimerTask(){
				public void run(){
					printText1 = true;
					sortedNode4=true;
					y1=y1+1;
					y2=y2+1;
					if(y2==300){
						
						y2=y2-1;
						y1=y1-1;
						

					}
				}
			};
			
			TimerTask swap1 = new TimerTask(){

				//@Override
				public void run(){
					
					x1 = x1+1;
					x2 = x2-1;
					if(x2==200){
						x1 = x1-1;
						x2 = x2+1;	
					}
				}
			};
			
			TimerTask up1 = new TimerTask(){

				public void run(){
					
					y1 = y1-2;
					y2 = y2-2;
					if(y1<100){
						y1 = y1+1;
						y2 = y2+1;	
						t1.cancel();
					}
				}
			};
			
			
			/*******************************
			 * end of second  swap
			 */
			
			/*******************************
			 * start of third swap
			 */
			
			TimerTask down2 = new TimerTask(){
				public void run(){
					sortedNode2=true;
					printText3 = true;
					
					y1=y1+1;
					y3=y3+1;
					if(y1==300){
						
						y1=y1-1;
						y3=y3-1;
					}
				}
			};
			
			TimerTask swap2 = new TimerTask(){

				//@Override
				public void run(){
					
					x1 = x1+1;
					x3 = x3-1;
					if(x3==199){
						x1 = x1-1;
						x3 = x3+1;	
					}
				}
			};
			
			TimerTask up2 = new TimerTask(){

				public void run(){
				
					y1 = y1-2;
					y3 = y3-2;
					if(y1<100){
						y1 = y1+1;
						y3 = y3+1;	
						t2.cancel();

					}
				}
			};
			
			
			/*******************************
			 * end of third  swap
			 */
			
			/*******************************
			 * start of shadow
			 */
			
			TimerTask sorted1 = new TimerTask(){
				public void run(){
					
					sortedNode3=true;
				}
			};
			
			TimerTask sorted2 = new TimerTask(){

				//@Override
				public void run(){
				
					
					sortedNode1=true;

				}
			};
			
			TimerTask sorted3 = new TimerTask(){

				public void run(){
					
					sortedNode=true;
					t3.cancel();
					
				}
			};
			
			
			
			/*******************************
			 * end of shadows
			 */
			public void skip(){
				skip.addActionListener(
			            new ActionListener(){
			            	@Override
			                public void actionPerformed(ActionEvent e)
			                {
			            		SelectionSortGame sGame = new SelectionSortGame();
			            		JFrame f1 = new JFrame();
			            		f1.add(sGame);
			            		f1.setVisible(true);
			            		f1.setSize(900,600);
			            		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			            		f1.setLocationRelativeTo(null);
			                	//f.dispose();
			                }
			            }
			        );
				}
				
				public void start(){
					start.addActionListener(
				            new ActionListener(){
				            	@Override
				                public void actionPerformed(ActionEvent e)
				                {
				            		t.scheduleAtFixedRate(down, delay, timeInterval);
				    		    	t.scheduleAtFixedRate(swap, delay*3, timeInterval);
				    		    	t.scheduleAtFixedRate(up, delay*5, timeInterval);
				    		    	
				    		    	t1.scheduleAtFixedRate(down1, delay*6, timeInterval);
				    		    	t1.scheduleAtFixedRate(swap1, delay*9, timeInterval);
				    		    	t1.scheduleAtFixedRate(up1, delay*11, timeInterval);
				    		    	
				    		    	t2.scheduleAtFixedRate(down2, delay*12, timeInterval);
				    		    	t2.scheduleAtFixedRate(swap2, delay*15, timeInterval);
				    		    	t2.scheduleAtFixedRate(up2, delay*17, timeInterval);
				    		    	
				    		    	t3.scheduleAtFixedRate(sorted1, delay*18, timeInterval);
				    		    	t3.scheduleAtFixedRate(sorted2, delay*21, timeInterval);
				    		    	t3.scheduleAtFixedRate(sorted3, delay*23, timeInterval);

				                }
				            }
				        );
					}
			
		
			public static void main(String[] args) {
							
				SelectionAnimation s = new SelectionAnimation();
				JFrame f = new JFrame();
				f.add(s);
				f.setVisible(true);
				f.setSize(900,600);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setLocationRelativeTo(null);

			}



			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(rect.contains(e.getPoint())){
					notTranslate=true;
				}
			}



			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}



			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}



			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}



			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}



		

	}
=======
package Menu;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import javax.swing.*;
import java.util.*;

public class SelectionAnimation extends JPanel implements MouseListener {
	// Java.util timer which operates by schedules.
			Timer t = new Timer();
		    Timer t1 = new Timer();
		    Timer t2 = new Timer();
		    Timer t3 = new Timer();

		    
		    //x values of each nodes
		    int x=250;
		    int x1=250;
		    int x2=250;
		    int x3=250;
		    int x4=250;
		   

		    //y value of each nodes
		    int y=100;
		    int y1=100;
		    int y2=100;
		    int y3=100;
		    int y4=100;
		   

		   
		    int delay = 1000;
		    
		    //booleans to use for specify shadowing and some other cacpabilities.
		    boolean sortedNode5;
		    boolean sortedNode4;
		    boolean sortedNode3;
		    boolean sortedNode2;
		    boolean sortedNode1;
		    boolean sortedNode;
		    
		    boolean printText = false;
		    boolean printText1 = false;
		    boolean printText2 = false;
		    boolean printText3 = false;
		   
		    boolean notTranslate;

		    int timeInterval = 5;

			static JButton skip = new JButton("Skip to Game");
			static JFrame f = new JFrame();
			//static JPanel p = new JPanel();
			
			int translateX;

			JButton start = new JButton("Start");

		    String[] instructions = {"      Selection Sort Algorithm:",
					
		    		"Find the minimum value in the list",
					"Swap the minimum value with the value in the first position ", 
					
					"We know that the first element is in its rightful (correct) position.",
					
					
					"Repeat the steps for the remainder of the list",
					"starting at the second position and advancing each time.",
					
		    		"Repeat until all the elements are in the sorted array."};

		    
		    public  SelectionAnimation() {
			
		    	this.setBackground(Color.white); 
		    	addMouseListener(this);
		    //	p.setLayout(new GridLayout());
		    	this.add(skip);
		    	this.add(start);
		    	//way to intantiate the animation. 
		    	
		    	if(notTranslate==true){
		    		translateX=70;
		    	}else{
		    		translateX=0;
		    	}
		    	
		    	this.skip();
		    	this.start();

		    }
		 
		 
			Shape rect = new Rectangle2D.Double(330,10,235,25);

			public void paintComponent(Graphics g){
				
				super.paintComponent(g);
			    Graphics2D g2 = (Graphics2D)g;
			    
			   
			    // center the nodes.
				g2.translate(translateX, 0);

				
				//create our nodes.
				Shape ellipse = new Ellipse2D.Double(x-200, y, 50, 50);
				Shape ellipse1 = new Ellipse2D.Double(x1-150, y1, 50, 50);
				Shape ellipse2 = new Ellipse2D.Double(x2-100, y2, 50, 50);
				Shape ellipse3 = new Ellipse2D.Double(x3-50, y3, 50, 50);
				Shape ellipse4 = new Ellipse2D.Double(x4, y4, 50, 50);
				

				g2.setColor(Color.lightGray);
				g2.fill(ellipse);
				g2.fill(ellipse1);
				g2.fill(ellipse2);
				g2.fill(ellipse3);
				g2.fill(ellipse4);	
				
				// set transparency
				AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.DST_ATOP, 0.4f);
				g2.setComposite(ac);
				
				// draw transparent text
				Font font = new Font("Serif", Font.BOLD, 30);
				g2.setFont(font);
				g2.drawString("9", x-183, y+35);
				g2.drawString("7", x1-133, y1+35);
				g2.drawString("4", x2-83, y2+35);
				g2.drawString("5", x3-33, y3+35);
				g2.drawString("1", x4+17, y4+35);
				
				

				if(sortedNode==true){
					g2.setColor(Color.red);
					g2.fill(ellipse);
				}
				if(sortedNode1==true){
					g2.setColor(Color.red);
					g2.fill(ellipse1);
				}
				if(sortedNode2==true){
					g2.setColor(Color.red);
					g2.fill(ellipse2);
				}
				if(sortedNode3==true){
					g2.setColor(Color.red);
					g2.fill(ellipse3);
				}
				if(sortedNode4==true){
					g2.setColor(Color.red);
					g2.fill(ellipse4);
				}
			
				
				

				g2.drawString(instructions[0], 300, 200);
				
				Font font2 = new Font("Serif", Font.PLAIN, 18);
				g2.setFont(font2);
				
				if(printText){
					
					g2.drawString(instructions[1], 350, 230);
					g2.drawString(instructions[2], 350, 260);
					g2.drawString(instructions[3], 350, 290);
					
				}
				
				if(printText1){
					
					
					g2.drawString(instructions[4], 350, 320);
					g2.drawString(instructions[5], 350, 350);
					
				}
				
				if(printText2){
					g2.drawString(instructions[6], 350, 380);
					g2.drawString(instructions[7], 350, 410);
					
				}
				
				
			    repaint();
			    
			    
			}
			
		
			
			/*******************************
			 * start of first swap
			 */
			
			
			TimerTask down = new TimerTask(){
				
				public void run(){

				 printText = true;	
					
					y=y+1;
					y4=y4+1;
					if(y==300){
						
						y=y-1;
						y4=y4-1;
					}
				}
			};
			
			TimerTask swap = new TimerTask(){

				//@Override
				public void run(){
					
					x = x+1;
					x4= x4-1;
					if(x4==50){
						x = x-1;
						x4 = x4+1;	
					}
				}
			};
			
			TimerTask up = new TimerTask(){

				public void run(){
					
					y = y-2;
					y4 = y4-2;
					if(y<100){
						y = y+1;
						y4 = y4+1;	
						t.cancel();
					}
				}
			};
			
			
			/*******************************
			 * end of first  swap
			 */
			
			
			/*******************************
			 * start of second swap
			 */
			
			TimerTask down1 = new TimerTask(){
				public void run(){
					printText1 = true;
					sortedNode4=true;
					y1=y1+1;
					y2=y2+1;
					if(y2==300){
						
						y2=y2-1;
						y1=y1-1;
						

					}
				}
			};
			
			TimerTask swap1 = new TimerTask(){

				//@Override
				public void run(){
					
					x1 = x1+1;
					x2 = x2-1;
					if(x2==200){
						x1 = x1-1;
						x2 = x2+1;	
					}
				}
			};
			
			TimerTask up1 = new TimerTask(){

				public void run(){
					
					y1 = y1-2;
					y2 = y2-2;
					if(y1<100){
						y1 = y1+1;
						y2 = y2+1;	
						t1.cancel();
					}
				}
			};
			
			
			/*******************************
			 * end of second  swap
			 */
			
			/*******************************
			 * start of third swap
			 */
			
			TimerTask down2 = new TimerTask(){
				public void run(){
					sortedNode2=true;
					printText3 = true;
					
					y1=y1+1;
					y3=y3+1;
					if(y1==300){
						
						y1=y1-1;
						y3=y3-1;
					}
				}
			};
			
			TimerTask swap2 = new TimerTask(){

				//@Override
				public void run(){
					
					x1 = x1+1;
					x3 = x3-1;
					if(x3==199){
						x1 = x1-1;
						x3 = x3+1;	
					}
				}
			};
			
			TimerTask up2 = new TimerTask(){

				public void run(){
				
					y1 = y1-2;
					y3 = y3-2;
					if(y1<100){
						y1 = y1+1;
						y3 = y3+1;	
						t2.cancel();

					}
				}
			};
			
			
			/*******************************
			 * end of third  swap
			 */
			
			/*******************************
			 * start of shadow
			 */
			
			TimerTask sorted1 = new TimerTask(){
				public void run(){
					
					sortedNode3=true;
				}
			};
			
			TimerTask sorted2 = new TimerTask(){

				//@Override
				public void run(){
				
					
					sortedNode1=true;

				}
			};
			
			TimerTask sorted3 = new TimerTask(){

				public void run(){
					
					sortedNode=true;
					t3.cancel();
					
				}
			};
			
			
			
			/*******************************
			 * end of shadows
			 */
			public void skip(){
				skip.addActionListener(
			            new ActionListener(){
			            	@Override
			                public void actionPerformed(ActionEvent e)
			                {
			                	BBGame b = new BBGame();
			            		JFrame f1 = new JFrame();
			            		f1.add(b);
			            		f1.setVisible(true);
			            		f1.setSize(900,600);
			            		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			            		f1.setLocationRelativeTo(null);
			                	//f.dispose();
			                }
			            }
			        );
				}
				
				public void start(){
					start.addActionListener(
				            new ActionListener(){
				            	@Override
				                public void actionPerformed(ActionEvent e)
				                {
				            		t.scheduleAtFixedRate(down, delay, timeInterval);
				    		    	t.scheduleAtFixedRate(swap, delay*3, timeInterval);
				    		    	t.scheduleAtFixedRate(up, delay*5, timeInterval);
				    		    	
				    		    	t1.scheduleAtFixedRate(down1, delay*6, timeInterval);
				    		    	t1.scheduleAtFixedRate(swap1, delay*9, timeInterval);
				    		    	t1.scheduleAtFixedRate(up1, delay*11, timeInterval);
				    		    	
				    		    	t2.scheduleAtFixedRate(down2, delay*12, timeInterval);
				    		    	t2.scheduleAtFixedRate(swap2, delay*15, timeInterval);
				    		    	t2.scheduleAtFixedRate(up2, delay*17, timeInterval);
				    		    	
				    		    	t3.scheduleAtFixedRate(sorted1, delay*18, timeInterval);
				    		    	t3.scheduleAtFixedRate(sorted2, delay*21, timeInterval);
				    		    	t3.scheduleAtFixedRate(sorted3, delay*23, timeInterval);

				                }
				            }
				        );
					}
			
		
			public static void main(String[] args) {
							
				SelectionAnimation s = new SelectionAnimation();
				JFrame f = new JFrame();
				f.add(s);
				f.setVisible(true);
				f.setSize(900,600);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setLocationRelativeTo(null);

			}



			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(rect.contains(e.getPoint())){
					notTranslate=true;
				}
			}



			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}



			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}



			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}



			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}



		

	}
>>>>>>> b3433847ea156215a2be4c63cf1dffafcb829e51

