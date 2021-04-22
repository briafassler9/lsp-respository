package org.howard.edu.lsp.exam.question41;
import java.util.ArrayList;


/**
 * Program that removes any occurrences of zero from a list
 * @author bria
 *
 */
public class RemoveZeroes {
	
	/**
	 * Removes any occurrences of zero from an arraylist
	 * @param arr an arraylist
	 */
	public ArrayList<Integer> removeZeroes(ArrayList<Integer> arr) {
	
		int index = 0;
		while (index < arr.size()) {
			if (arr.get(index) == 0) {
				arr.remove(index);
			}
			else {
				index++;
			}
		}
		return arr;
	}
}
