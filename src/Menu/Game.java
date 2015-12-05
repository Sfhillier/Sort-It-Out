package Menu;
/*import org.eclipse.swt.widgets.Composite;
import java.util.Random;
import javax.swing.JTextArea;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Slider;
*/
public class Game {//extends Composite {
	//private static int [] array =new int[10];
	//array.random() 
/*	
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	
	private Label lblSecondStep;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_13;
	private Text text_14;
	Random random = new Random();

		
	private Text text_15;
	private Text text_16;
	private Text text_17;
	private Text text_18;
	private Text text_19;
	
	private Text text_20;
	private Text text_21;
	private Text text_22;
	private Text text_23;
	private Text text_24;
	
	private Text text_25;
	private Text text_26;
	private Text text_27;
	private Text text_28;
	private Text text_29;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	// if sort is correct change color of text box green, if wrong turn red
	/*public Game(Composite parent, int style) {
		super(parent, style);
		
		Integer[] numarray = new Integer[5];
		for (int i = 1; i < numarray.length; i++){
			int num =  random.nextInt(100);
			numarray[i]= num;
			
		}
			 
		Composite composite = new Composite(this, SWT.NONE);
		composite.setBounds(0, 0, 450, 319);
		
		Button btnSortItOut = new Button(composite, SWT.NONE);
		
		btnSortItOut.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int temp;
			        for(int i=0; i < numarray.length-1; i++){
			            for(int j=1; j < numarray.length-i; j++){
			                if(numarray[j-1] > numarray[j]){
			                    temp=numarray[j-1];
			                    numarray[j-1] = numarray[j];
			                    numarray[j] = temp;
			                }
			            }}
					text.setText(numarray.toString());
					}	
			
		});
		btnSortItOut.setBounds(316, 137, 90, 25);
		btnSortItOut.setText("Sort it out!");
		
		Label lblSortNumbers = new Label(composite, SWT.NONE);
		lblSortNumbers.setBounds(28, 70, 122, 15);
		lblSortNumbers.setText("Sort these numbers");

		text = new Text(composite, SWT.BORDER);
		text.setText(numarray[0].toString());
		text.setEditable(false);
		text.setBounds(160, 67, 30, 25);
		
		
		text_1 = new Text(composite, SWT.BORDER);
		text_1.setText(numarray[1].toString());
		text_1.setEditable(false);
		text_1.setBounds(190, 67, 30, 25);
		
		text_2 = new Text(composite, SWT.BORDER);
		text_2.setText(numarray[2].toString());
		text_2.setEditable(false);
		text_2.setBounds(220, 67, 30, 25);
		
		text_3 = new Text(composite, SWT.BORDER);
		text_3.setText(numarray[3].toString());
		text_3.setEditable(false);
		text_3.setBounds(250, 67, 30, 25);
		
		text_4 = new Text(composite, SWT.BORDER);
		text_4.setText(numarray[4].toString());
		text_4.setEditable(false);
		text_4.setBounds(280, 67, 30, 25);
	
		//first sort
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setBounds(28, 107, 55, 15);
		lblNewLabel.setText("first step");
		
		text_5 = new Text(composite, SWT.BORDER);
		text_5.setBounds(160, 104, 30, 25);
		text_5.setVisible(true);
		
		text_6 = new Text(composite, SWT.BORDER);
		text_6.setBounds(190, 104, 30, 25);
		text_6.setVisible(true);

		text_7 = new Text(composite, SWT.BORDER);
		text_7.setBounds(220, 104, 30, 25);
		text_7.setVisible(true);

		text_8 = new Text(composite, SWT.BORDER);
		text_8.setBounds(250, 104, 30, 25);
		text_8.setVisible(true);

		text_9 = new Text(composite, SWT.BORDER);
		text_9.setBounds(280,104, 30, 25);
		text_9.setVisible(true);

//second step		
		lblSecondStep = new Label(composite, SWT.NONE);
		lblSecondStep.setBounds(28, 142, 90, 15);
		lblSecondStep.setText("second step");
		
		text_10 = new Text(composite, SWT.BORDER);
		text_10.setBounds(160, 139, 30, 25);
		
		text_11 = new Text(composite, SWT.BORDER);
		text_11.setBounds(190, 139, 30, 25);
		
		text_12 = new Text(composite, SWT.BORDER);
		text_12.setBounds(220, 139, 30, 25);
		
		text_13 = new Text(composite, SWT.BORDER);
		text_13.setBounds(250, 139, 30, 25);
		
		text_14 = new Text(composite, SWT.BORDER);
		text_14.setBounds(280, 139, 30, 25);
		//third
		Label lblThirdStep = new Label(composite, SWT.NONE);
		lblThirdStep.setBounds(28, 180, 75, 15);
		lblThirdStep.setText("third step");
		text_15 = new Text(composite, SWT.BORDER);
		text_15.setBounds(160, 177, 30, 25);
		
		text_16 = new Text(composite, SWT.BORDER);
		text_16.setBounds(190, 177, 30, 25);
		
		text_17 = new Text(composite, SWT.BORDER);
		text_17.setBounds(220, 177, 30, 25);
		
		text_18 = new Text(composite, SWT.BORDER);
		text_18.setBounds(250, 177, 30, 25);
		
		text_19 = new Text(composite, SWT.BORDER);
		text_19.setBounds(280, 177, 30, 25);
		
		Label lblFourthSter = new Label(composite, SWT.NONE);
		lblFourthSter.setBounds(28, 220, 75, 15);
		lblFourthSter.setText("fourth step");

		text_20 = new Text(composite, SWT.BORDER);
		text_20.setBounds(160, 217, 30, 25);
		
		text_21 = new Text(composite, SWT.BORDER);
		text_21.setBounds(190, 217, 30, 25);
		
		text_22 = new Text(composite, SWT.BORDER);
		text_22.setBounds(220, 217, 30, 25);
		
		text_23 = new Text(composite, SWT.BORDER);
		text_23.setBounds(250, 217, 30, 25);
		
		text_24 = new Text(composite, SWT.BORDER);
		text_24.setBounds(280, 217, 30, 25);
		
		Button btnExit = new Button(composite, SWT.NONE);
		btnExit.setBounds(316, 215, 90, 25);
		btnExit.setText("Exit");
		
		Button btnNewNumbers = new Button(composite, SWT.NONE);
		btnNewNumbers.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
			});
		btnNewNumbers.setBounds(316, 65, 90, 25);
		btnNewNumbers.setText("New Numbers");
		
		text_25 = new Text(composite, SWT.BORDER);
		text_25.setBounds(160, 260, 30, 25);
		
		text_26 = new Text(composite, SWT.BORDER);
		text_26.setBounds(190, 260, 30, 25);
		
		text_27 = new Text(composite, SWT.BORDER);
		text_27.setBounds(220, 260, 30, 25);
		
		text_28 = new Text(composite, SWT.BORDER);
		text_28.setBounds(250, 260, 30, 25);
		
		text_29 = new Text(composite, SWT.BORDER);
		text_29.setBounds(280, 260, 30, 25);
		
		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN));
		lblNewLabel_1.setBounds(160, 10, 172, 56);
		lblNewLabel_1.setText("Sort It Out !");
		
		Slider slider = new Slider(composite, SWT.VERTICAL);
		slider.setBounds(423, 33, 17, 252);
		
		
	}

	private void randnum(JTextArea numberss) {
		for(int i =0; i<10;i++){
			int num = random.nextInt(10);
		//System.out.print(num);
		}
			
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}*/
}
