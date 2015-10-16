package Menu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.Timer;

public class bubbleAnimation extends JPanel implements ActionListener{
	
	//Timer t = new Timer(1000,this);


	// indexes of each node.
	int index1 = -150;	 
	int index2 = -100;
	int index3 = -50;
	int index4 = 0;
	int index5 = 50;
	int index6 = 100;

	int y = 0;
	int w =50;
	int h = 50;
	
	int yString = 25;
	
	private SwingWorker<Void,Integer> worker;
	
	public bubbleAnimation(){			
		
		
		
		//Timer t = new Timer(1000,this);
		Timer t = new Timer(1000,taskPerformer);

		t.start();
		repaint();
	
	}
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D) g;
		
		//change the origin to the center.
		g2.translate(this.getWidth()/2, this.getHeight()/2);

		//create the squares
		Rectangle2D square0 = new Rectangle2D.Double(index1,y,w,h);
		Rectangle2D square1 = new Rectangle2D.Double(index2,y,w,h);
		Rectangle2D square2 = new Rectangle2D.Double(index3,y,w,h);
		Rectangle2D square3 = new Rectangle2D.Double(index4,y,w,h);
		Rectangle2D square4 = new Rectangle2D.Double(index5,y,w,h);
		Rectangle2D square5 = new Rectangle2D.Double(index6,y,w,h);
		
		
		// compute a variable to deduce hiearchi
		
		int n6 = 125;
	    g2.drawString("6", n6, yString);
		int n5 = 75;
	    g2.drawString("1", n5, yString);
		int n4 = 25;
		g2.drawString("4", n4 , yString);
		int n3 = -25;
		g2.drawString("2", n3 , yString);
		int n2 = -75;
		g2.drawString("3", n2, yString);
		int n1 = -125;
		g2.drawString("5", n1, yString);
		

		//draw the squares
		
		g2.setColor(Color.darkGray);
		g2.draw(square0);
		g2.setColor(Color.BLUE);
		g2.draw(square1);
		g2.setColor(Color.CYAN);
		g2.draw(square2);
		g2.setColor(Color.YELLOW);
		g2.draw(square3);
		g2.setColor(Color.red);
		g2.draw(square4);
		g2.setColor(Color.GREEN);
		g2.draw(square5);
			
		//this will perform only one cycle.
		//t.setRepeats(false);

	}
	
	
	ActionListener taskPerformer = new ActionListener() {
		
	public void actionPerformed(ActionEvent e) {
	
		worker = new SwingWorker<Void, Integer>(){

			@Override
			protected Void doInBackground() throws Exception {
				// TODO Auto-generated method stub
				for(int i =0; i<=5; i++){
					
				y = y-10;
			yString = yString - 10;	
				
			
		}

				return null;
			}};
		
			worker.execute();
		
		repaint();
	}
	};
	
	public static void main(String[] args) {


		
		bubbleAnimation sort = new bubbleAnimation();
		JFrame frame = new JFrame();
		frame.add(sort);
		frame.setVisible(true);
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	


	
			
	


	}

	
	

	
	


