package org.howard.edu.lsp.assignment6.junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.jupiter.api.Test;


class IntegerSetTest {
	
	@Test
	@DisplayName("Test cases for clear")
	public void testClear() {
		IntegerSet set1 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set1.clear();
		
		String output1 = set1.toString();
		assertEquals("[]", output1);
	}
	
	@Test
	@DisplayName("Test cases for length")
	public void testLength() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		int output1 = set1.length();
		int output2 = set2.length();
		
		assertEquals(3, output1);
		assertEquals(5, output2);
	}

	@Test
	@DisplayName("Test cases for equals")
	public void testsEquals() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		
		set1.add(9);
		set1.add(1);
		set1.add(3);
		set1.add(5);
		
		set2.add(5);
		set2.add(1);
		set2.add(3);
		set2.add(9);
		
		set3.add(2);
		set3.add(6);
		set3.add(8);
		set3.add(7);
		
		boolean output1 = set1.equals(set2);
		boolean output2 = set2.equals(set3);
		
		assertTrue(output1);
		assertFalse(output2);
	}
	
	@Test
	@DisplayName("Test cases for contains")
	public void testContains() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(4);
		set1.add(3);
		set1.add(2);
		set1.add(1);
		
		set2.add(9);
		set2.add(8);
		set2.add(7);
		set2.add(6);
		
		boolean output1 = set1.contains(3);
		boolean output2 = set2.contains(5);
		
		assertTrue(output1);
		assertFalse(output2);
	}
	
	@Test
	@DisplayName("Test cases for largest")
	public void testLargest() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();

		set1.add(11);
		set1.add(5);
		set1.add(19);
		set1.add(9);
		set1.add(15);
		
		set2.add(21);
		set2.add(65);
		set2.add(43);
		set2.add(98);
		set2.add(54);
		
		int output1 = set1.largest();
		int output2 = set2.largest();
		
		assertEquals(19, output1);
		assertEquals(98, output2);

	}
	
	@Test
	@DisplayName("Test cases for smallest")
	public void testSmallest() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(11);
		set1.add(5);
		set1.add(19);
		set1.add(9);
		set1.add(15);
		
		set2.add(21);
		set2.add(65);
		set2.add(43);
		set2.add(98);
		set2.add(54);
		
		int output1 = set1.smallest();
		int output2 = set2.smallest();
		
		assertEquals(5, output1);
		assertEquals(21, output2);
	}
	
	@Test
	@DisplayName("Test cases for add")
	public void testAdd() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		set2.add(-1);
		set2.add(-2);
		set2.add(-3);
		set2.add(-4);
		set2.add(-5);
		
		set1.add(6);
		set2.add(-5);
		
		int output1 = set1.length();
		int output2 = set2.length();
		
		assertEquals(6, output1);
		assertEquals(5, output2);
	}
	
	@Test
	@DisplayName("Test cases for remove")
	public void testRemove() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		set2.add(-1);
		set2.add(-2);
		set2.add(-3);
		set2.add(-4);
		set2.add(-5);
		
		set1.remove(5);
		set2.remove(-7);
		
		int output1 = set1.length();
		int output2 = set2.length();
		
		assertEquals(4, output1);
		assertEquals(5, output2);
	}
	
	@Test
	@DisplayName("Test cases for union")
	public void testUnion() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set1.add(0);
		set1.add(1);
		set1.add(2);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		set3.add(-9);
		set3.add(3);
		set3.add(-1);
		set3.add(6);
		
		set4.add(11);
		set4.add(9);
		set4.add(-8);
		set4.add(4);
		
		set1.union(set2);
		set3.union(set4);
		
		String output1 = set1.toString();
		String output2 = set3.toString();
		
		assertEquals("[0, 1, 2, 3, 4, 5]", output1);
		assertEquals("[-9, 3, -1, 6, 11, 9, -8, 4]", output2);
		
	}
	
	@Test
	@DisplayName("Test cases for intersect")
	public void testIntersect() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set1.add(3);
		set1.add(7);
		set1.add(8);
		
		set2.add(8);
		set2.add(2);
		set2.add(3);
		
		set3.add(10);
		set3.add(-6);
		set3.add(-4);
		set3.add(2);
		
		set4.add(-6);
		set4.add(2);
		set4.add(10);
		set4.add(5);
		
		set1.intersect(set2);
		set3.intersect(set4);
		
		String output1 = set1.toString();
		String output2 = set3.toString();
		
		assertEquals("[3, 8]", output1);
		assertEquals("[10, -6, 2]", output2);
	}
	
	@Test
	@DisplayName("Test cases for diff")
	public void testDiff() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set1.add(1);
		set1.add(3);
		set1.add(5);
		
		set2.add(3);
		set2.add(5);
		set2.add(4);
		
		set3.add(11);
		set3.add(15);
		set3.add(23);
		set3.add(31);
		
		set4.add(19);
		set4.add(22);
		set4.add(11);
		set4.add(14);
		
		set1.diff(set2);
		set3.diff(set4);
		
		String output1 = set1.toString();
		String output2 = set3.toString();
		
		assertEquals("[1]", output1);
		assertEquals("[15, 23, 31]", output2);
	}
	
	@Test
	@DisplayName("Test cases for isEmpty")
	public void testIsEmpty() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set2.add(9);
		set2.add(5);
		set2.add(1);
		
		boolean output1 = set1.isEmpty();
		boolean output2 = set2.isEmpty();
		
		assertTrue(output1);
		assertFalse(output2);
		
	}

	@Test
	@DisplayName("Test cases for toString")
	public void testToString() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(6);
		set1.add(12);
		set1.add(18);
		set1.add(24);
		set1.add(30);
		
		set2.add(-1);
		set2.add(-3);
		set2.add(-5);
		
		String output1 = set1.toString();
		String output2 = set2.toString();
		
		assertEquals("[6, 12, 18, 24, 30]", output1);
		assertEquals("[-1, -3, -5]", output2);
	}
}
