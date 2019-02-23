package cse360assign2;

// Main method to test Calculator.java
public class Main {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator ();
		myCalculator.subtract(2);
		myCalculator.add(4);
		
		myCalculator.multiply(2);
		myCalculator.add(5);
		myCalculator.divide(10);
		int tot = myCalculator.getTotal();
		System.out.println("Total = " + tot);
		System.out.println(myCalculator.getHistory());
	}

}
