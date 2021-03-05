package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;


public class Driver {

	/**
	 * Tests methods within IntegerSet
	 * @param args test IntegerSet
	 * @throws IntegerSetException when set is empty
	 */
	public static void main(String[] args) throws IntegerSetException {
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		set2.add(3);
		set2.add(2);
		set2.add(1);
		set2.add(4);
		set2.add(5);
		
		set3.add(0);
		set3.add(8);
		set3.add(5);
		set3.add(9);
		set3.add(11);
		
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Set 3: " + set3);
		System.out.println("Set 4: " + set4 + "\n");
		
		
		//Finds the length of the set
		System.out.println("Length of Set: " + set1.length() + "\n");
		
		//Determines if sets are equal
		System.out.println("Equal Sets (Set 1 and Set 2): " + set1.equals(set2));
		System.out.println("Equal Sets (Set 1 and Set 3): " + set1.equals(set3) + "\n");
		
		//Determines if the set contains a given number
		int num1 = 5;
		int num2 = 3;
		System.out.println("Set 1 Contains " + num1 + "?: " + set1.contains(num1));
		System.out.println("Set 3 Contains " + num2 + "?: " + set3.contains(num2) + "\n");
		
		//Finds the largest number within the set, if empty throws exception
		try {
			set1.largest();
			System.out.println("Largest Number in Set 1: " + set1.largest());
		}
		catch (Exception e) {
			System.out.println("The set is empty!");
		}
		
		try {
			set4.largest();
			System.out.println("Largest Number in Set 4: " + set4.largest());
		}
		catch (Exception e) {
			System.out.println("The set is empty!" + "\n");
		}
		
		//Finds the smallest number within the set, if empty throws exception
		try {
			set3.smallest();
			System.out.println("Smallest Number: " + set3.smallest());
		}
		catch (Exception e) {
			System.out.println("The set is empty!");
		}
		
		try {
			set4.smallest();
			System.out.println("Smallest Number: " + set4.smallest());
		}
		catch (Exception e) {
			System.out.println("The set is empty!" + "\n");
		}
		
		//Adds item to set, if not already there
		//Check
		int num3 = 1;
		int num4 = 6;
		set1.add(num3);
		System.out.println("Adds 1 to Set 1: " + set1);
		set1.add(num4);
		System.out.println("Adds 6 to Set 1: " + set1 + "\n");
		
		//Removes item from set unless it's not in the set
		//Check
		int num5 = 9;
		int num6 = 2;
		set3.remove(num5);
		System.out.println("Removes 9 from Set 3: " + set3);
		set3.remove(num6);
		System.out.println("Removes 2 from Set 3: " + set3 + "\n");
		
		//Finds difference between sets
		set1.diff(set2);
		System.out.println("Set Difference (Set 1 - Set 2): " + set1);
		set1.diff(set2);
		System.out.println("Set Difference (Set 2 - Set 1): " + set1 + "\n");
		
		//Determines if the set is empty
		System.out.println("Is Set 4 Empty?: " + set4.isEmpty());
		System.out.println("Is Set 3 Empty?: " + set3.isEmpty() + "\n");
		
		//Returns a string representation of the set
		System.out.println("String Representation of Set 3: " + set3.toString() + "\n");
		
		
		//Cleared set
		set1.clear();
		System.out.println("Set 1 Cleared: " + set1);

	}

}
