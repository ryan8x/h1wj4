package com.ryanliang.search;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BinarySearchTest {
	int size;
	int [] aa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		size = 20;
		aa = new int[size];
		
		for (int i = 0; i < size; i++){
			aa[i] = i;
		}
	}

	@After
	public void tearDown() throws Exception {
		aa = null;
	}

	@Test
	public void testSmallestValue() {
		int index = 0;
		int result = BinarySearch.binarySearch(aa, aa[index]);
		assertEquals(index, result);
	}
	
	@Test
	public void testBiggestValue() {
		int index = size-1;
		int result = BinarySearch.binarySearch(aa, aa[index]);
		assertEquals(index, result);
	}
	
	@Test
	public void testOddIndex() {
		int index = 1;
		int result = BinarySearch.binarySearch(aa, aa[index]);
		assertEquals(index, result);
	}
	
	@Test
	public void testEvenIndex() {
		int index = 2;
		int result = BinarySearch.binarySearch(aa, aa[index]);
		assertEquals(index, result);
	}
	
	@Test
	public void testNonExistingValueWithinRange() {
		int[] bb = {2, 45, 101, 234, 754, 1000, 1231};
		
		int result = BinarySearch.binarySearch(bb, 200);
		assertTrue("Result is expected to be a negative value", result < 0);
		bb = null;
	}
	
	@Test
	public void testNonExistingValueOutsideOfSmallestValue() {
		int result = BinarySearch.binarySearch(aa, -100000);
		assertTrue("Result is expected to be a negative value", result < 0);
	}
	
	@Test
	public void testNonExistingValueOutsideOfBiggestValue() {
		int result = BinarySearch.binarySearch(aa, size);
		assertTrue("Result is expected to be a negative value", result < 0);
	}
	
	//@Ignore
	//@Test(expected = IndexOutOfBoundsException.class)
	@Test
	public void testOverFlow() {
		size = 2147483640;
		aa = new int[size];
		
		for (int i = 0; i < size; i++){
			aa[i] = i;
		}
		
		int index = size-1;
		int result = BinarySearch.binarySearch(aa, aa[index]);
		assertEquals(index, result);
	}
	
	@Test
	public void testUnsortedArray() {
	
	}
	
	@Test
	public void testSizeZeroArray() {
	
	}
	
	@Test
	public void testSizeOneArray() {
	
	}
	
	@Test
	public void testSizeTwoArray() {
	
	}

	@Test
	public void testSizeThreeArray() {
	
	}

	@Test
	public void testSizeFourArray() {
	
	}

}
