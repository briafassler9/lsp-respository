package org.howard.edu.lsp.assignment6.integerset;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class IntegerSet {
	
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	}
	
	/**
	 * Finds the length of the given set
	 * @return length of the set
	 */
	public int length() {
		int size = set.size();
		return size;
	}

	/**
	 * Determines if 2 sets contain all of the same values in any order
	 * @param b  a set
	 * @return true if sets are equal
	 */
	public boolean equals (IntegerSet b) {
		Collections.sort(set);
		Collections.sort(b.getIntegerSet(set));
		return set.equals(b.getIntegerSet(set));
	}
	
	/**
	 * Determines if the set contains a value
	 * @param value  number to check in set
	 * @return true if value is in set, otherwise false
	 */
	public boolean contains(int value) {
		boolean contains_value = set.contains(value);

		if (contains_value) {
			return true;
		}
		return false;
	}
	
	/**
	 * Finds the largest item in the set
	 * @return largest item
	 * @throws IntegerSetException if set is empty
	 */
	public int largest() throws IntegerSetException {
		boolean is_empty = set.isEmpty();
		int largest = Collections.max(set);
		
		if (is_empty) {
			throw new IntegerSetException("The set is empty!");
		}
		return largest;
	}
	
	/**
	 * Finds the smallest item in the set
	 * @return smallest item
	 * @throws IntegerSetException if set is empty
	 */
	public int smallest() throws IntegerSetException {
		boolean is_empty = set.isEmpty();
		int smallest = Collections.min(set);
		
		if (is_empty) {
			throw new IntegerSetException("The set is empty!");
		}
		return smallest;
	}
	
	/**
	 * Adds item to set if not already in the set
	 * @param item  number to be added to set
	 */
	public void add(int item) {
		boolean contains_item = set.contains(item);
		
		if (contains_item == false) {
			set.add(item);
		}
	}

	/**
	 * Removes item to set if it's in the set
	 * @param item  number to be removed to set
	 */
	public void remove(int item) {
		boolean contains_item = set.contains(item);
		
		if (contains_item) {
			set.remove(Integer.valueOf(item));
		}
	}

	/**
	 * Combines 2 sets together
	 * @param intSetb a set
	 */
	public void union(IntegerSet intSetb) {
		set.addAll(intSetb.getIntegerSet(set));
		set.toString();
	}

	/**
	 * Finds the common elements between 2 sets
	 * @param intSetb a set
	 */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.getIntegerSet(set));
		set.toString();
	}

	/**
	 * Finds the difference between 2 sets
	 * @param intSetb a set
	 */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.getIntegerSet(set));
		set.toString();
	}

	/**
	 * Determines if the set is empty
	 * @return true if set is empty, otherwise false
	 */
	public boolean isEmpty() {
		boolean is_empty = set.isEmpty();
		
		if (is_empty) {
			return true;
		}
		return false;
	}

	/**
	 * Returns a string representation of the set
	 */
	public String toString() {
		return set.toString();
	}
	
	/**
	 * Getter function to retrieve a variable value
	 * @param set a list
	 * @return the value of set as a list
	 */
	public List<Integer> getIntegerSet(List<Integer> set) {
		return this.set;
	}
	

}
