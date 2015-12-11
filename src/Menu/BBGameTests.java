/**
 * 
 */
package Menu;

import javax.swing.JTextField;

import junit.framework.TestCase;

/**
 * @author Scott
 *
 */
public class BBGameTests extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test method for {@link Menu.BBGame#inputNum()}.
	 */
	public void testInputNumAllGood() {
		JTextField firstNum = new JTextField("44");
		JTextField secondNum = new JTextField("18");
		JTextField thirdNum = new JTextField("37");
		JTextField fourthNum = new JTextField("85");
		JTextField fifthNum = new JTextField("32");
		int[] arr = new int[5];
		assertSame("When these texts are passed", arr[0]=44);
		assertSame("When these texts are passed", arr[1]=18);
		assertSame("When these texts are passed", arr[2]=37);
		assertSame("When these texts are passed", arr[3]=85);
		assertSame("When these texts are passed", arr[4]=32);
	}
}
