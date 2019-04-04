package cse360assign2;

import java.util.Scanner;

// Main method to test Calculator.java
public class Main {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator ();
		Scanner sc = new Scanner(System.in);
		myCalculator.add(sc.nextInt());
		myCalculator.add(sc.nextInt());
		myCalculator.add(sc.nextInt());
		int tot = myCalculator.getTotal();
		System.out.println("Total = " + tot);
		System.out.println(myCalculator.getHistory());
		
		sc.close();
	}
}
