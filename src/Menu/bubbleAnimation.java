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

import javax.swing.JFrame;
import javax.swing.JPanel;

//import javax.swing.*;
import java.util.*;

@SuppressWarnings("serial")
public class bubbleAnimation extends JPanel implements ActionListener {

// Java.util timer which operates by schedules.
    Timer t = new Timer();

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

  //  int[] indexY = {y,y1,y2,y3,y4};
   // int[] indexX = {x,x1,x2,x3,x4};
   // int[] values = {5,1,4,2,8};
    
    public  bubbleAnimation(){
	
    	this.setBackground(Color.white); 
    	
    	//way to intantiate the animation. 
    	t.scheduleAtFixedRate(down, 1000, 5);
    	t.scheduleAtFixedRate(swap, 3000, 5);
    	t.scheduleAtFixedRate(up, 5000, 5);
 

    }
 
 

	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D)g;
	    
	    // center the nodes.
		g2.translate(50, 0);
		
		//create our nodes.
		Shape ellipse = new Ellipse2D.Double(x-100, y, 50, 50);
		Shape ellipse1 = new Ellipse2D.Double(x1-50, y1, 50, 50);
		Shape ellipse2 = new Ellipse2D.Double(x2, y2, 50, 50);
		Shape ellipse3 = new Ellipse2D.Double(x3+50, y3, 50, 50);
		Shape ellipse4 = new Ellipse2D.Double(x4+100, y4, 50, 50);
		
		g2.setColor(Color.gray);
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
		
	    
	    repaint();
	    
	    
	}
	
	/*******************************
	 * start of first swap
	 */
	
	TimerTask down = new TimerTask(){
		public void run(){
			
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
			}
		}
	};
	
	
	/*******************************
	 * end of first  swap
	 */
	
	
	
	public void actionPerformed(ActionEvent e){
		
		
			
			
	}		

    

	
	
	public static void main(String[] args) {
		
		bubbleAnimation s = new bubbleAnimation();
		JFrame f = new JFrame();
		f.add(s);
		f.setVisible(true);
		f.setSize(450,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
	}

}