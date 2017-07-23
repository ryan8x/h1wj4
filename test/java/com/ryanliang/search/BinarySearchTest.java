package com.ryanliang.search;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BinarySearchTest {
	int size = 2147483640;
	//int size = 200;
	int [] aa = new int[size];
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		for (int i = 0; i < size; i++){
			aa[i] = i;
		}
	}

	@After
	public void tearDown() throws Exception {
		aa = null;
	}
/*
	@Test
	public void testSmallestValue() {
		int index = 0;
		int result = BinarySearch.binarySearch(aa, aa[index]);
		assertEquals(index, result);
	}
*/	
	@Test
	public void testBiggestValue() {
		int index = size-1;
		int result = BinarySearch.binarySearch(aa, aa[index]);
		assertEquals(index, result);
	}
/*	
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
	
	@Ignore("Provide specific no match value")
	@Test
	public void testNonExistingValueWithinRange() {
		int result = BinarySearch.binarySearch(aa, 200);
		assertTrue("Result is expected to be a negative value", result < 0);
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
*/
}
