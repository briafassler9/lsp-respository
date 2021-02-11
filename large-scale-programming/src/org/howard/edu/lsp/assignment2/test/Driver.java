package org.howard.edu.lsp.assignment2.test;
import java.util.Arrays;
import org.howard.edu.lsp.assignment2.combination.Combination;

public class Driver {

	
	/**
	 * Tests various inputs for the class Combination
	 * @param args
	 */
	public static void main(String[] args) {
		Combination combination = new Combination();
		
		//multiple combinations
		int[] arr = {1, 2, 3, 4, 5, 6};
		int target_sum = 6;
		System.out.println("Input: " + Arrays.toString(arr));
		System.out.println("Target Sum: " + target_sum);
		System.out.println("Output: " + combination.calculateCombinations(arr, target_sum) + "\n");
		
		//double digit numbers
		int[] arr1 = {45, 60, 15, 23, 19, 18};
		int target_sum1 = 60;
		System.out.println("Input: " + Arrays.toString(arr1));
		System.out.println("Target Sum: " + target_sum1);
		System.out.println("Output: " + combination.calculateCombinations(arr1, target_sum1) + "\n");
		
		//unsorted array
		int[] arr2 = {5, 3, 2, 1, 4};
		int target_sum2 = 5;
		System.out.println("Input: " + Arrays.toString(arr2));
		System.out.println("Target Sum: " + target_sum2);
		System.out.println("Output: " + combination.calculateCombinations(arr2, target_sum2) + "\n");
		
		//negative numbers
		int[] arr3 = {-1, -2};
		int target_sum3 = -3;
		System.out.println("Input: " + Arrays.toString(arr3));
		System.out.println("Target Sum: " + target_sum3);
		System.out.println("Output: " + combination.calculateCombinations(arr3, target_sum3) + "\n");
		
		//duplicate numbers in array
		int[] arr4 = {7, 14, 7};
		int target_sum4 = 14;
		System.out.println("Input: " + Arrays.toString(arr4));
		System.out.println("Target Sum: " + target_sum4);
		System.out.println("Output: " + combination.calculateCombinations(arr4, target_sum4) + "\n");
		
		//single element
		int[] arr5 = {9};
		int target_sum5 = 9;
		System.out.println("Input: " + Arrays.toString(arr5));
		System.out.println("Target Sum: " + target_sum5);
		System.out.println("Output: " + combination.calculateCombinations(arr5, target_sum5) + "\n");
		
		//empty list
		int[] arr6 = {};
		int target_sum6 = 3;
		System.out.println("Input: " + Arrays.toString(arr6));
		System.out.println("Target Sum: " + target_sum6);
		System.out.println("Output: " + combination.calculateCombinations(arr6, target_sum6) + "\n");
		
		//sorted array
		int[] arr7 = {2, 3, 5, 7, 8, 9, 12};
		int target_sum7 = 12;
		System.out.println("Input: " + Arrays.toString(arr7));
		System.out.println("Target Sum: " + target_sum7);
		System.out.println("Output: " + combination.calculateCombinations(arr7, target_sum7) + "\n");
	}

}
