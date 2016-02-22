
package cse360assign3;

/**
 * The class can do multiple calculations. 
 * 
 * PIN: 512
 * 
 * @author Yi Liu for CSE360 Spring 2016
 * @version Feb 21, 2016.
 */

public class Calculator {

	private int total;
	
	/**
	 * constructor for Calculator()
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * get the result of calculations
	 * 
	 * @return the result of calculation. 
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * add a input value to result 
	 * 
	 * @param value the value need to be added to result
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * subtract an input value from result 
	 * 
	 * @param value the value need to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * multiply an input value to the result 
	 * 
	 * @param value the value need to be multiple
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * divide the result by an input value 
	 * 
	 * @param value the value will divide the result
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}else {
			total = total / value;
		}
	}
	
	/**
	 * get the history of calculation 
	 * 
	 * @return a string with expression how we get the result
	 */
	public String getHistory () {
		return "";
	}
}
