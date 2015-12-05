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
import javax.swing.JTextArea;

//import javax.swing.*;
import java.util.*;

@SuppressWarnings("serial")
public class bubbleAnimation extends JPanel implements MouseListener{

// Java.util timer which operates by schedules.
    Timer t = new Timer();
    Timer t1 = new Timer();
    Timer t2 = new Timer();
    Timer t3 = new Timer();
    Timer t4 = new Timer();


    String[] instructions = {"Bubble Sort Algorithm:",
    						"Compare the first two elements, since 5 > 1, then swap 5", 
    						"Then compare 5 and 4, and swap",
    						"The process is repeated until the focus moves to the end of the array",
    						"Keep doing this, while stopping at one earlier place each pass",
    						"because the largest element is considered sorted at this time."};
    
    int x=150;
    int x1=150;
    int x2=150;
    int x3=150;
    int x4=150;   
    
    int y=100;
    int y1=100;
    int y2=100;
    int y3=100;
    int y4=100;
   
    int delay = 1000;
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
    
    static JButton back = new JButton(" Back ");
	static JButton skip = new JButton("Skip to Game");
	static JFrame f = new JFrame();
	static JPanel p = new JPanel();
	
	int translateX;
	
    public  bubbleAnimation(){
	
    	this.setBackground(Color.white); 
    	addMouseListener(this);
    	p.setLayout(new GridLayout());
    	p.add(skip);
    	p.add(back);
    	this.add(p);
    	
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
    	
    	t4.scheduleAtFixedRate(sorted1, delay*24, timeInterval);
    	t4.scheduleAtFixedRate(sorted2, delay*25, timeInterval);
    	t4.scheduleAtFixedRate(sorted3, delay*26, timeInterval);
    	
    	
    	
    	if(notTranslate==true){
    		translateX=50;
    	}else{
    		translateX=0;
    	}
    	
    	this.skip();
    	this.backToMenu();
    }
 
   
	Shape rect = new Rectangle2D.Double(330,10,235,25);

	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D)g;
	    
	   
	    // center the nodes.
		g2.translate(translateX, 0);
		
		//create our nodes.
		Shape ellipse = new Ellipse2D.Double(x-100, y, 50, 50);
		Shape ellipse1 = new Ellipse2D.Double(x1-50, y1, 50, 50);
		Shape ellipse2 = new Ellipse2D.Double(x2, y2, 50, 50);
		Shape ellipse3 = new Ellipse2D.Double(x3+50, y3, 50, 50);
		Shape ellipse4 = new Ellipse2D.Double(x4+100, y4, 50, 50);
		
		
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
		g2.drawString("5", x-83, y+35);
		g2.drawString("1", x1-33, y1+35);
		g2.drawString("4", x2+17, y2+35);
		g2.drawString("2", x3+67, y3+35);
		g2.drawString("8", x4+117, y4+35);
		
		g2.drawString(instructions[0], 300, 200);
		
		
		Font font2 = new Font("Serif", Font.PLAIN, 18);
		g2.setFont(font2);
		
		
		if(printText){
			
			g2.drawString(instructions[1], 300, 230);
		}
		
		if(printText1){
			
			g2.drawString(instructions[2], 300, 260);
		}
		
		if(printText2){
			
			g2.drawString(instructions[3], 300, 290);
		}
		
		if(printText3){
			
			g2.drawString(instructions[4], 300, 320);
			g2.drawString(instructions[5], 300, 350);
		}
		
	
		
		
		
		
		if(sortedNode4==true){
		
		g2.setColor(Color.red);
		g2.fill(ellipse4);
		
		}
		if(sortedNode3==true){
			
			g2.setColor(Color.red);
			g2.fill(ellipse3);
			
			}
		if(sortedNode2==true){
			
			g2.setColor(Color.red);
			g2.fill(ellipse2);
			
			}
		if(sortedNode1==true){
			
			g2.setColor(Color.red);
			g2.fill(ellipse1);
			
			}
		if(sortedNode==true){
			
			g2.setColor(Color.red);
			g2.fill(ellipse);
			
			
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
			y1=y1+1;
			if(y==300){
				
				y=y-1;
				y1=y1-1;
			}
		}
	};
	
	TimerTask swap = new TimerTask(){

		//@Override
		public void run(){
			
			x = x+1;
			x1 = x1-1;
			if(x1==100){
				x = x-1;
				x1 = x1+1;	
			}
		}
	};
	
	TimerTask up = new TimerTask(){

		public void run(){
			
			
			y = y-2;
			y1 = y1-2;
			if(y<100){
				y = y+1;
				y1 = y1+1;	
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
			
			y=y+1;
			y2=y2+1;
			if(y==300){
				
				y=y-1;
				y2=y2-1;
			}
		}
	};
	
	TimerTask swap1 = new TimerTask(){

		//@Override
		public void run(){
			
			x = x+1;
			x2 = x2-1;
			if(x2==100){
				x = x-1;
				x2 = x2+1;	
			}
		}
	};
	
	TimerTask up1 = new TimerTask(){

		public void run(){
			
			y = y-2;
			y2 = y2-2;
			if(y<100){
				y = y+1;
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
			printText2 = true;
			
			y=y+1;
			y3=y3+1;
			if(y==300){
				
				y=y-1;
				y3=y3-1;
			}
		}
	};
	
	TimerTask swap2 = new TimerTask(){

		//@Override
		public void run(){
			
			x = x+1;
			x3 = x3-1;
			if(x3==98){
				x = x-1;
				x3 = x3+1;	
			}
		}
	};
	
	TimerTask up2 = new TimerTask(){

		public void run(){
			
			y = y-2;
			y3 = y3-2;
			if(y<100){
				y = y+1;
				y3 = y3+1;	
				t2.cancel();
				sortedNode4=true;

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
			printText3 = true;
			
			y2=y2+1;
			y3=y3+1;
			if(y2==300){
				
				y2=y2-1;
				y3=y3-1;
			}
		}
	};
	
	TimerTask swap3 = new TimerTask(){

		//@Override
		public void run(){
			
			x2 = x2+1;
			x3 = x3-1;
			if(x3==50){
				x2 = x2-1;
				x3 = x3+1;	
			}
		}
	};
	
	TimerTask up3 = new TimerTask(){

		public void run(){
			
			y2 = y2-2;
			y3 = y3-2;
			if(y2<100){
				y2 = y2+1;
				y3 = y3+1;	
				t3.cancel();
			    sortedNode=true;

			}
		}
	};
	
	
	
	/*******************************
	 * end of fourth  swap
	 */
	
	/*******************************
	 * start of fourth swap
	 */
	
	TimerTask sorted1 = new TimerTask(){
		public void run(){
			
			sortedNode2=true;
		}
	};
	
	TimerTask sorted2 = new TimerTask(){

		//@Override
		public void run(){
		
			
			sortedNode3=true;

		}
	};
	
	TimerTask sorted3 = new TimerTask(){

		public void run(){
			
			sortedNode1=true;
			t4.cancel();
			
		}
	};
	
	
	
	/*******************************
	 * end of fourth  swap
	 */
	

	
	public void skip(){
	skip.addActionListener(
            new ActionListener(){
            	@Override
                public void actionPerformed(ActionEvent e)
                {
                	f.dispose();
                	BBGame b = new BBGame();
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
	
	public void backToMenu(){
		back.addActionListener(
	            new ActionListener(){
	            	@Override
	                public void actionPerformed(ActionEvent e)
	                {
	                	f.dispose();
	                	Menu m = new Menu();
	            		JFrame f1 = new JFrame();
	            		f1.add(m);
	            		f1.setVisible(true);
	            		f1.setSize(900,600);
	            		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	            		f1.setLocationRelativeTo(null);


	                }
	            }
	        );
		}
	
	
	public static void main(String[] args) {
		
		bubbleAnimation s = new bubbleAnimation();
		f.add(s);
		f.setVisible(true);
		f.setSize(900,600);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setLocationRelativeTo(null);
	}
	//solves the translation problem.. the button actual 
	//clicks for back and skip were disrupted by the g2.translation.
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