package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Calculates the possible combinations of a given array and a desired target sum, and returns a set of combinations
 * of any length that add up to that target sum.
 * @author Bria Fassler
 *
 */
public class Combination {
	
	
	/**
	 * Returns an ArrayList of ArrayLists containing various combinations that are the sum of the desired target
	 * @param arr          the initial given array
	 * @param target_sum   the desired sum to be achieved
	 * @return             an ArrayList with all possible desired sum combinations
	 */
	public ArrayList<ArrayList<Integer>> calculateCombinations(int[] arr, int target_sum) {
			
		ArrayList<Integer> temp_array = new ArrayList<>(); // temporary array
		ArrayList<ArrayList<Integer>> temp_combinations = new ArrayList<>(); // temporary arraylist of arraylists
	    ArrayList<ArrayList<Integer>> final_combinations = new ArrayList<>(); // final list of combinations that is returned
	    ArrayList<Integer> duplicated_array = new ArrayList<>(); // duplicates original array

	    int[] sorted_array = arr.clone(); //sorts input array
	    Arrays.sort(sorted_array);
	    
	    int difference, temp_array_sum, temp_array_difference, temp_sum;

	    // determines if element in arr = target sum and adds to temporary combinations
	    for (int num = 0; num < arr.length; num++) {  
	      if (arr[num] == target_sum) { 
	        temp_array.add(arr[num]);
	        temp_combinations.add(temp_array);
	        temp_array = new ArrayList<>();
	      }
	    }  
	    
	    // loops through sorted array backwards
	    for (int i = sorted_array.length - 1; i >= 0; i--) {
	    	temp_sum = sorted_array[i];
	    	temp_array.add(sorted_array[i]);

	    	// adds elements of arr to temp arr if they add up to the target sum
	    	for (int j = i - 1; j >= 0; j--) {
		      difference = target_sum - temp_sum;
		      
		      if (sorted_array[j] <= difference && sorted_array[j] != target_sum) {
		        temp_array.add(sorted_array[j]);
		        temp_sum += sorted_array[j];
		        
		        if(temp_sum == target_sum) {
		          temp_combinations.add(temp_array);
		        }
		      }
		      else if (sorted_array[j] != target_sum) {
		    	 // determines the sum and difference of the temp array
		        temp_array_sum = temp_sum + sorted_array[j];
		        temp_array_difference = temp_array_sum - target_sum;
		        
		        // finds the number in sorted array needed to make the target sum
		        if(temp_array.contains(temp_array_difference)) {
		          temp_array.remove(Integer.valueOf(temp_array_difference));
		          temp_array.add(sorted_array[j]);
		          temp_sum += sorted_array[j];
		          temp_combinations.add(temp_array);
		        }
		      }
		    }
	    temp_array = new ArrayList<>();
	    }

	    // duplicates the input array
	    for (int element = 0; element < arr.length; element++) {
	        duplicated_array.add(arr[element]);
	    }

	    // replaces the numbers in the temporary arraylist with their original indices in the input
	    for (int m = 0; m < temp_combinations.size(); m++) {
	      ArrayList<Integer> row = new ArrayList<>();
	      
	      for (int n = 0; n < temp_combinations.get(m).size(); n++) {
	        row.add(duplicated_array.indexOf(temp_combinations.get(m).get(n)));
	      }
	      final_combinations.add(row);
	    }
		return final_combinations;	
		}
}
		
