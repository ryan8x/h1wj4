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
	@Test
	public void testOverFlow() {
	  //size = 2147483640;
		size = 1431655770;
		aa = new int[size];
		
		for (int i = 0; i < size; i++){
			aa[i] = i;
		}

		int index = size-1;

		try{
			int result = BinarySearch.binarySearch(aa, aa[index]);
			assertEquals(index, result);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			fail("ArrayIndexOutOfBoundsException is caught.");
		}

	}
	
	@Test
	public void testSizeOneArray() {
		int[] bb = {1};
		int result;
		
		for (int i = 0; i < bb.length; i++){
			result = BinarySearch.binarySearch(bb, bb[i]);
			assertEquals(i, result);
		}
		
		bb = null;
	}
	
	@Test
	public void testSizeTwoArray() {
		int[] bb = {1,2};
		int result;
		
		for (int i = 0; i < bb.length; i++){
			result = BinarySearch.binarySearch(bb, bb[i]);
			assertEquals(i, result);
		}
		
		bb = null;
	}

	@Test
	public void testSizeThreeArray() {
		int[] bb = {1,2,3};
		int result;
		
		for (int i = 0; i < bb.length; i++){
			result = BinarySearch.binarySearch(bb, bb[i]);
			assertEquals(i, result);
		}
		
		bb = null;
	}

	@Test
	public void testSizeFourArray() {
		int[] bb = {1,2,3,4};
		int result;
		
		for (int i = 0; i < bb.length; i++){
			result = BinarySearch.binarySearch(bb, bb[i]);
			assertEquals(i, result);
		}
		
		bb = null;
	}
	
	@Test
	public void testSizeFiveArray() {
		int[] bb = {1,2,3,4,5};
		int result;
		
		for (int i = 0; i < bb.length; i++){
			result = BinarySearch.binarySearch(bb, bb[i]);
			assertEquals(i, result);
		}
		
		bb = null;
	}

}
