/*
 * By: McKay Huber
 * Class ID: 408
 * CSE360 Assignment 2
 */

package cse360assign2;
import java.util.ArrayList;

// Class Calculator performs the basic operations and can give calculation history
public class Calculator {
	private int total;
	private ArrayList<String> historyList = new ArrayList<String>(1); // stores the history of operations when each method is called
		
		// constructor
		public Calculator () {
			total = 0;  // not needed - included for clarity
			
			historyList.add("0");
		}
		
		// returns final value after calculation
		public int getTotal () {
			return total;
		}
		
		// adds and integer to total value
		public void add (int value) {
			total += value;
			
			historyList.add(" + " + value);
		}
		
		// subtracts and integer from total value
		public void subtract (int value) {
			total -= value;
			
			historyList.add(" - " + value);
		}
		
		// multiplies the total by an integer
		public void multiply (int value) {
			total *= value;
			
			historyList.add(" * " + value);
		}
		
		// divides the total by an integer
		public void divide (int value) {
			
			if(value == 0)
				total = 0;
			else
				total /= value;
			
			historyList.add(" / " + value);
		}
		
		// gives the history of calculations in the form of a string
		public String getHistory () {
			String historyStr = "";
			
			for(int index = 0; index < historyList.size(); index++) {
				historyStr += historyList.get(index);
			}
			
			return historyStr;
		}
}
