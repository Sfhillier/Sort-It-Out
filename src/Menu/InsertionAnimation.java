package Menu;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import javax.swing.*;
import java.util.*;


public class InsertionAnimation extends JPanel implements ActionListener {

	// Java.util timer which operates by schedules.
		Timer t = new Timer();
	    Timer t1 = new Timer();
	    Timer t2 = new Timer();
	    Timer t3 = new Timer();
	    Timer t4 = new Timer();
	    Timer t5 = new Timer();
	    Timer t6 = new Timer();
	    Timer t7 = new Timer();
	    Timer t8 = new Timer();
	 

	    
	 
	    //x values of each nodes
	    int x=150;
	    int x1=150;
	    int x2=150;
	    int x3=150;
	    int x4=150;
	    int x5=150;
	    int x6=150;
	    int x7=150;

	    //y value of each nodes
	    int y=100;
	    int y1=100;
	    int y2=100;
	    int y3=100;
	    int y4=100;
	    int y5=100;
	    int y6=100;
	    int y7=100;

	   
	    int delay = 1000;
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
	   
	   

	    String[] instructions = {"Insertion Sort Algorithm:",
				
	    		"The first unsorted element is inspected and placed ",
				"logically as the head of a sorted array. ", 
				
				"Then next element is pulled from the unsorted array and compared to ",
				"the last element in the sorted array.",
				
				"Working right to left these two element are compared",
				" and swapped if the right is smaller.",
				
				"This continues until it finds its place in the sorted array.",
				
	    		"Repeat until all the elemnts are in the sorted array."};

	    int timeInterval = 5;
	    
	    public  InsertionAnimation() {
		
	    	this.setBackground(Color.white); 
	    	
	    	//way to intantiate the animation. 
	    	
	    	
	    	t.scheduleAtFixedRate(down, delay, timeInterval);
	    	t.scheduleAtFixedRate(swap, delay*3, timeInterval);
	    	t.scheduleAtFixedRate(up, delay*5, timeInterval);
	    	
	    	t1.scheduleAtFixedRate(down1, delay*6, timeInterval);
	    	t1.scheduleAtFixedRate(swap1, delay*9, timeInterval);
	    	t1.scheduleAtFixedRate(up1, delay*11, timeInterval);
	    	
	    	t2.scheduleAtFixedRate(down2, delay*12, timeInterval);
	    	t2.scheduleAtFixedRate(swap2, delay*15, timeInterval);
	    	t2.scheduleAtFixedRate(up2, delay*17, timeInterval);
	    	
	    	t3.scheduleAtFixedRate(down3, delay*18, timeInterval);
	    	t3.scheduleAtFixedRate(swap3, delay*21, timeInterval);
	    	t3.scheduleAtFixedRate(up3, delay*23, timeInterval);
	    	
	    	t4.scheduleAtFixedRate(down4, delay*24, timeInterval);
	    	t4.scheduleAtFixedRate(swap4, delay*27, timeInterval);
	    	t4.scheduleAtFixedRate(up4, delay*29, timeInterval);
	    	
	    	t5.scheduleAtFixedRate(down5, delay*30, timeInterval);
	    	t5.scheduleAtFixedRate(swap5, delay*33, timeInterval);
	    	t5.scheduleAtFixedRate(up5, delay*35, timeInterval);
	    	
	    	t6.scheduleAtFixedRate(down6, delay*36, timeInterval);
	    	t6.scheduleAtFixedRate(swap6, delay*39, timeInterval);
	    	t6.scheduleAtFixedRate(up6, delay*41, timeInterval);
	    	
	    	t7.scheduleAtFixedRate(down7, delay*42, timeInterval);
	    	t7.scheduleAtFixedRate(swap7, delay*45, timeInterval);
	    	t7.scheduleAtFixedRate(up7, delay*47, timeInterval);
	    	


	    	
	    }
	 
	 

		public void paintComponent(Graphics g){
			
			super.paintComponent(g);
		    Graphics2D g2 = (Graphics2D)g;
		    
		   
		    // center the nodes.
			g2.translate(70, 0);
			
			//create our nodes.
			Shape ellipse = new Ellipse2D.Double(x-200, y, 50, 50);
			Shape ellipse1 = new Ellipse2D.Double(x1-150, y1, 50, 50);
			Shape ellipse2 = new Ellipse2D.Double(x2-100, y2, 50, 50);
			Shape ellipse3 = new Ellipse2D.Double(x3-50, y3, 50, 50);
			Shape ellipse4 = new Ellipse2D.Double(x4, y4, 50, 50);
			Shape ellipse5 = new Ellipse2D.Double(x5+50, y5, 50, 50);
			

			g2.setColor(Color.lightGray);
			g2.fill(ellipse);
			g2.fill(ellipse1);
			g2.fill(ellipse2);
			g2.fill(ellipse3);
			g2.fill(ellipse4);
			g2.fill(ellipse5);
			


			
			// set transparency
			AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.DST_ATOP, 0.4f);
			g2.setComposite(ac);
			
			// draw transparent text
			Font font = new Font("Serif", Font.BOLD, 30);
			g2.setFont(font);
			g2.drawString("3", x-183, y+35);
			g2.drawString("7", x1-133, y1+35);
			g2.drawString("4", x2-83, y2+35);
			g2.drawString("9", x3-33, y3+35);
			g2.drawString("5", x4+17, y4+35);
			g2.drawString("2", x5+67, y5+35);
			
<<<<<<< HEAD
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
			if(sortedNode5==true){
				g2.setColor(Color.red);
				g2.fill(ellipse5);
			}
			
			
=======
			g2.drawString(instructions[0], 300, 200);
			
			Font font2 = new Font("Serif", Font.PLAIN, 18);
			g2.setFont(font2);
			
			if(printText){
				
				g2.drawString(instructions[1], 300, 230);
				g2.drawString(instructions[2], 300, 260);
			}
			
			if(printText1){
				
				
			}
			
			if(printText2){
				
				g2.drawString(instructions[3], 300, 290);
				g2.drawString(instructions[4], 300, 320);
				g2.drawString(instructions[5], 300, 350);
				g2.drawString(instructions[6], 300, 380);
			}
			
			if(printText3){
				
				g2.drawString(instructions[7], 300, 410);
				g2.drawString(instructions[8], 300, 440);
				
			}
>>>>>>> 775469338947b8b945e8a3483754a78cb69e52d3
		    
		    repaint();
		    
		    
		}
		
	
		
		/*******************************
		 * start of first swap
		 */
		
		
		TimerTask down = new TimerTask(){
			
			public void run(){
<<<<<<< HEAD
			    
				sortedNode2=true;
=======
				 printText = true;	
				
				
>>>>>>> 775469338947b8b945e8a3483754a78cb69e52d3
				y1=y1+1;
				y2=y2+1;
				if(y1==300){
					
					y1=y1-1;
					y2=y2-1;
				}
			}
		};
		
		TimerTask swap = new TimerTask(){

			//@Override
			public void run(){
				
				x1 = x1+1;
				x2= x2-1;
				if(x2==100){
					x1 = x1-1;
					x2 = x2+1;	
				}
			}
		};
		
		TimerTask up = new TimerTask(){

			public void run(){
				
				y1 = y1-2;
				y2 = y2-2;
				if(y1<100){
					y1 = y1+1;
					y2 = y2+1;	
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
				
<<<<<<< HEAD
				sortedNode2=false;
				sortedNode4=true;
=======
				printText2 = true;
				
>>>>>>> 775469338947b8b945e8a3483754a78cb69e52d3
				y3=y3+1;
				y4=y4+1;
				if(y4==300){
					
					y4=y4-1;
					y3=y3-1;
					

				}
			}
		};
		
		TimerTask swap1 = new TimerTask(){

			//@Override
			public void run(){
				
				x3 = x3+1;
				x4 = x4-1;
				if(x4==100){
					x3 = x3-1;
					x4 = x4+1;	
				}
			}
		};
		
		TimerTask up1 = new TimerTask(){

			public void run(){
				
				y3 = y3-2;
				y4 = y4-2;
				if(y3<100){
					y3 = y3+1;
					y4 = y4+1;	
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
				
				printText3 = true;
				
				y1=y1+1;
				y4=y4+1;
				if(y1==300){
					
					y1=y1-1;
					y4=y4-1;
				}
			}
		};
		
		TimerTask swap2 = new TimerTask(){

			//@Override
			public void run(){
				
				x1 = x1+1;
				x4 = x4-1;
				if(x4==50){
					x1 = x1-1;
					x4 = x4+1;	
				}
			}
		};
		
		TimerTask up2 = new TimerTask(){

			public void run(){
				
				y1 = y1-2;
				y4 = y4-2;
				if(y1<100){
					y1 = y1+1;
					y4 = y4+1;	
					t2.cancel();

				}
			}
		};
		
		
		/*******************************
		 * end of third  swap
		 */
		
		/*******************************
		 * start of fourth swap
		 */
		
		TimerTask down3 = new TimerTask(){
			public void run(){
				sortedNode5=true;
				sortedNode4=false;
				y3=y3+1;
				y5=y5+1;
				if(y3==300){
					
					y3=y3-1;
					y5=y5-1;
					
				}
			}
		};
		
		TimerTask swap3 = new TimerTask(){

			//@Override
			public void run(){
				
				x3 = x3+1;
				x5 = x5-1;
				if(x5==100){
					x3 = x3-1;
					x5 = x5+1;	
				}
			}
		};
		
		TimerTask up3 = new TimerTask(){

			public void run(){
				
				y3 = y3-2;
				y5 = y5-2;
				if(y3<100){
					y3 = y3+1;
					y5 = y5+1;	
					t3.cancel();

				}
			}
		};
		
		
		
		/*******************************
		 * end of fourth  swap
		 */
		
		/*******************************
		 * start of swap fifth
		 */
		TimerTask down4 = new TimerTask(){
			public void run(){
				
				y1=y1+1;
				y5=y5+1;
				if(y1==300){
					
					y1=y1-1;
					y5=y5-1;
				}
			}
		};
		
		TimerTask swap4 = new TimerTask(){
			public void run(){
				
				x1 = x1+1;
				x5 = x5-1;
				if(x5==50){
					x1 = x1-1;
					x5 = x5+1;	
				}
			}
			
		};
		
		TimerTask up4 = new TimerTask(){
			public void run(){
				
				y1 = y1-2;
				y5 = y5-2;
				if(y1<100){
					y1 = y1+1;
					y5 = y5+1;	
					t4.cancel();

				}
			}
		};
		
		
		
		
		
		/*******************************
		 * end of swap fifth
		 */
		
		/*******************************
		 * start of swap sixth
		 */
		TimerTask down5 = new TimerTask(){
			public void run(){
				
				y4=y4+1;
				y5=y5+1;
				if(y4==300){
					
					y4=y4-1;
					y5=y5-1;
				}
			}
		};
		
		TimerTask swap5 = new TimerTask(){
			public void run(){
				
				x4 = x4+1;
				x5 = x5-1;
				if(x5==0){
					x4 = x4-1;
					x5 = x5+1;	
				}
			}
			
		};
		
		TimerTask up5 = new TimerTask(){
			public void run(){
				
				y4 = y4-2;
				y5 = y5-2;
				if(y4<100){
					y4 = y4+1;
					y5 = y5+1;	
					t5.cancel();

				}
			}
		};
		
		
		
		/*******************************
		 * end of swap sixth
		 */
		/*******************************
		 * start of swap seventh
		 */
		TimerTask down6 = new TimerTask(){
			public void run(){
				
				y2=y2+1;
				y5=y5+1;
				if(y2==300){
					
					y2=y2-1;
					y5=y5-1;
				}
			}
		};
		
		TimerTask swap6 = new TimerTask(){
			public void run(){
				
				x2 = x2+1;
				x5 = x5-1;
				if(x5==-50){
					x2 = x2-1;
					x5 = x5+1;	
				}
			}
			
		};
		
		TimerTask up6 = new TimerTask(){
			public void run(){
				
				y2 = y2-2;
				y5 = y5-2;
				if(y2<100){
					y2 = y2+1;
					y5 = y5+1;	
					t6.cancel();

				}
			}
		};
		
		
		
		/*******************************
		 * end of swap seventh
		 */
	    
		/*******************************
		 * start of swap eight
		 */
		TimerTask down7 = new TimerTask(){
			public void run(){
				
				y=y+1;
				y5=y5+1;
				if(y==300){
					
					y=y-1;
					y5=y5-1;
				}
			}
		};
		
		TimerTask swap7 = new TimerTask(){
			public void run(){
				
				x = x+1;
				x5 = x5-1;
				if(x5==-100){
					x = x-1;
					x5 = x5+1;	
				}
			}
			
		};
		
		TimerTask up7 = new TimerTask(){
			public void run(){
				
				y = y-2;
				y5 = y5-2;
				if(y<100){
					y = y+1;
					y5 = y5+1;	
					t7.cancel();

				}
				sortedNode5=false;

			}
		};
		
		/*******************************
		 * end of swap eight
		 */
	    
	//@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton button = new JButton();
			this.add(button);
		}
		
	
		public static void main(String[] args) {
						
			InsertionAnimation s = new InsertionAnimation();
			JFrame f = new JFrame();
			f.add(s);
			f.setVisible(true);
			f.setSize(900,600);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLocationRelativeTo(null);
		}



	

}
