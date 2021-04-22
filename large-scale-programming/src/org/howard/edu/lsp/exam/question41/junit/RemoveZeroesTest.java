package org.howard.edu.lsp.exam.question41.junit;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.howard.edu.lsp.exam.question41.RemoveZeroes;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;

/**
 * Tests removing zeroes from an arraylist
 * @author bria
 *
 */
class RemoveZeroesTest {
	
	RemoveZeroes zeroes = new RemoveZeroes();

	@Test
	@DisplayName("Tests empty list")
	public void testEmptyList() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		assertEquals("[]", zeroes.removeZeroes(arr).toString());	
	}
	
	@Test
	@DisplayName("Tests a list with numbers and zeroes")
	public void testNumList() {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		arr1.add(0);
		arr1.add(7);
		arr1.add(2);
		arr1.add(0);
		arr1.add(0);
		arr1.add(4);
		arr1.add(0);
		
		assertEquals("[7, 2, 4]", zeroes.removeZeroes(arr1).toString());
	}
	
	@Test
	@DisplayName("Tests a list with no zeroes")
	public void testOnlyNums() {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);

		assertEquals("[1, 2, 3, 4, 5]", zeroes.removeZeroes(arr2).toString());
	}
		
	@Test
	@DisplayName("Tests a list with only zeroes")
	public void testOnlyZeroes() {
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		
		arr3.add(0);
		arr3.add(0);
		arr3.add(0);
		
		assertEquals("[]", zeroes.removeZeroes(arr3).toString());
	}

}
