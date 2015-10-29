package Menu;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bubbleAnimation extends Applet implements Runnable{
	
	// Background color for the panel
	private static final Color BACKGROUND_COLOR = Color.black;
	//Timer t = new Timer(1000,this);
    
	static int[] array = {5,6,7,2,1};
	private static final int LENGTH = 5;
	int d=0,m=0,z,t;

	int i;
	String num = new String();
	// indexes of each node.
	// I think these should be constants to make it
	// more easily understood that they won't change
	int y = 0;
	int width =50;
	int height = 50;
	
	int yString = 25;
	
	//private SwingWorker<Void,Integer> worker;
	
	public void init()
	{
	
	setSize(800,800);
	setBackground(BACKGROUND_COLOR);

	}
	public void start(){
		
		Thread t = new Thread();
		t.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		
		
	}
	
	//where all the magic happens.
	
	public void paint(Graphics g){
		
	   // super.paintComponents(g);
	    
	    //change the origin to the center.
		g.translate(this.getWidth()/2, this.getHeight()/2);

		//this will render our nodes.
		for(i=0; i<LENGTH; i++){
			g.setColor(Color.white);
			num = Integer.toString(array[i]);
			g.drawRect(-150+i*50, 0 , 30 , 30);
			g.drawString(num,-138 + i*50 , 20);	
		}	
		 try
			{
			Thread.sleep(3000);
			}
			catch(Exception e){}	
		 
		//bubble sort algorithm
		 int j,temp=0;	
		 for(i=0; i<LENGTH;i++)
			for( j=i; j<LENGTH-1; j++)
				if(array[i] > array[j+1]){
			//the start of our animations since we start updating some variables.		
					
					int a=i,b=j+1,count;		
					for( count =0; count<50;count++){
					
						//black background so lets wear white. this will draw a node on top of the one we have.
					g.setColor(Color.white);
					num = Integer.toString(array[a]);
					g.drawRect(-150+a*50,0+count*4,30,30);
					g.drawString(num,-138+a*50,20+count*4);
					
					 try
						{
						Thread.sleep(15);
						}
						catch(Exception e){}
					// creates and moves our node down
					g.setColor(Color.black);
					num = Integer.toString(array[a]);
					g.drawRect(-150 + a*50, 0 + count*4 , 30, 30);
					g.drawString(num, -138 + a*50, 20 + count*4);
					}
					//back to origin.
					g.setColor(Color.white);
					num = Integer.toString(array[a]);
					g.drawRect(-150+a*50,0+count*4,30,30);
					g.drawString(num,-138+a*50,20+count*4);
					for(count=0;count<50;count++)
					{
					//moves down the other node 
					g.setColor(Color.white);
					num = Integer.toString(array[b]);
					g.drawRect(-150+b*50,0+count*4,30,30);
					g.drawString(num,-138+b*50,20+count*4);
					
					 try
						{
						Thread.sleep(10);
						}
						catch(Exception e){}
					 
					//these are not visible 
					g.setColor(Color.black);
					num = Integer.toString(array[b]);
					g.drawRect(-150+b*50,0+count*4,30,30);
					g.drawString(num,-138+b*50,20+count*4);
					}
					num = Integer.toString(array[b]);
					g.drawRect(-150+b*50,0+count*4,30,30);
					g.drawString(num,-138+b*50,20+count*4);
					
					//now time to mix the code
					
					for(int z=0;z<(b-a)*50;z++){
						
						g.setColor(Color.white);
						//causes the bottom to swap
						
						num = Integer.toString(array[a]);
						g.drawRect(-150+a*50+z,200,30,30);
						g.drawString(num,-138+a*50+z,220);
						
						g.setColor(Color.white);

						num = Integer.toString(array[a]);
						g.drawRect(-150+b*50-z,200,30,30);
						g.drawString(num,-138+b*50-z,220);
			
						 try
							{
							Thread.sleep(20);
							}
							catch(Exception e){}
						
						g.setColor(Color.black);
						num = Integer.toString(array[a]);
						g.drawRect(-150+a*50+z,200,30,30);
						g.drawString(num,-138+b*50+z,220);
					
						g.setColor(Color.black);
						num = Integer.toString(array[b]);
						g.drawRect(-150+b*50-z,200,30,30);
						g.drawString(num,-138+b*50-z,220);
						}
						g.setColor(Color.white);
						num = Integer.toString(array[a]);
						g.drawRect(-150+a*50+z,200,30,30);
						g.drawString(num,-138+a*50+z,220);

						g.setColor(Color.white);
						num = Integer.toString(array[b]);
						g.drawRect(-150+b*50-z,200,30,30);
						g.drawString(num,-138+b*50-z,220);
						
						for(int t=50; t>0;t--)
						{
							
						g.setColor(Color.black);				
						num = Integer.toString(array[b]);
						g.drawRect(-150+a*50,0+t*4,30,30);
						g.drawString(num,-138+a*50,20+t*4);
							
						try
						{
						Thread.sleep(10);
						}
						catch(Exception e)
						{}
						
						g.setColor(Color.black);				
						num = Integer.toString(array[b]);
						g.drawRect(-150+a*50,320+t*4,30,30);
						g.drawString(num,-138+a*50,20+t*4);
						
						}	
						
						g.setColor(Color.white);				
						num = Integer.toString(array[b]);
						g.drawRect(-150+a*50,0+t*4,30,30);
						g.drawString(num,-138+a*50,20+t*4);
					
						for(t=50;t>0;t--)
						{
						g.setColor(Color.black);				
						num = Integer.toString(array[a]);
						g.drawRect(-150+b*50,0+t*4,30,30);
						g.drawString(num,-138+b*50,20+t*4);
						try
						{
						Thread.sleep(15);
						}
						catch(Exception e){}
						
						g.setColor(Color.black);				
						num = Integer.toString(array[a]);
						g.drawRect(-150+b*50,320+t*4,30,30);
						g.drawString(num,-138+b*50,20+t*4);
						}
						
						g.setColor(Color.white);				
						num = Integer.toString(array[a]);
						g.drawRect(-150+b*50,0+t*4,30,30);
						g.drawString(num,-138+b*50,20+t*4);
						temp = array[i];
						array[i]= array[j+1];
						array[j+1]= temp;
						

						 
			}
		}
	
	
	
	
	/*
	public static void main(String[] args) {


		
		bubbleAnimation sort = new bubbleAnimation();
		JFrame frame = new JFrame();
		frame.add(sort);
		frame.setVisible(true);
		frame.setSize(600,400);
		frame.setBackground(BACKGROUND_COLOR);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}




	/*ActionListener taskPerformer = new ActionListener() {
	
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
		
		
	}
	};
	*/


	


	
			
	


	}

	
	

	
	


