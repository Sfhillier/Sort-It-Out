/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Menu;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author giannamaida
 */

	

  public class BSAnimationGUI extends javax.swing.JFrame {
 
	  
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
		
		public void start(){
			
			Thread t = new Thread();
			t.start();
		}
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
		

    /**
     * Creates new form BSAnimationGUI
     */
   public BSAnimationGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	this.setBackground(Color.BLACK);
    	
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Skip Animation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BSAnimationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BSAnimationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BSAnimationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BSAnimationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BSAnimationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
	
	