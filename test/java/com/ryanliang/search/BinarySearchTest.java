/**
 *
 * @author Ryan L.
 */

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
	int [] ArrayA1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		ArrayA1 = null;
	}

	private void initializeArrayA1() {
		size = 20;
		ArrayA1 = new int[size];

		for (int i = 0; i < size; i++){
			ArrayA1[i] = i;
		}
	}

	/*
	 * Ensure searching still work when array size is very big.
	 */
	@Test
	public void testOverFlow() {
		//size = 1431655770;
		size = Integer.MAX_VALUE/2 + 2;  //Minimum array size needed to cause potential integer overflow for binarySearch().
		ArrayA1 = new int[size];

		for (int i = 0; i < size; i++){
			ArrayA1[i] = i;
		}

		int index = size-1;

		try{
			int result = BinarySearch.binarySearch(ArrayA1, ArrayA1[index]);
			assertEquals(index, result);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			fail("ArrayIndexOutOfBoundsException is caught.");
		}

	}

	/*
	 * Search for smallest element value in the array.
	 */
	@Test
	public void testSmallestArrayElementValue() {
		initializeArrayA1();
		int index = 0;
		int result = BinarySearch.binarySearch(ArrayA1, ArrayA1[index]);
		assertEquals(index, result);
	}

	/*
	 * Search for biggest element value in the array.
	 */
	@Test
	public void testBiggestArrayElementValue() {
		initializeArrayA1();
		int index = size-1;
		int result = BinarySearch.binarySearch(ArrayA1, ArrayA1[index]);
		assertEquals(index, result);
	}

	/*
	 * Search for element value in the array with an odd index.
	 */
	@Test
	public void testOddIndex() {
		initializeArrayA1();
		int index = 1;
		int result = BinarySearch.binarySearch(ArrayA1, ArrayA1[index]);
		assertEquals(index, result);
	}

	/*
	 * Search for element value in the array with an even index.
	 */
	@Test
	public void testEvenIndex() {
		initializeArrayA1();
		int index = 2;
		int result = BinarySearch.binarySearch(ArrayA1, ArrayA1[index]);
		assertEquals(index, result);
	}

	/*
	 * Search for element value that does not exist in the array.
	 */
	@Test
	public void testNonExistingArrayElement1() {
		ArrayA1 = new int[]{2, 45, 101, 234, 754, 1000, 1231};

		int result = BinarySearch.binarySearch(ArrayA1, 200);
		assertTrue("Result is expected to be a negative value", result < 0);
	}

	/*
	 * Search for element value that does not exist in the array.
	 */
	@Test
	public void testNonExistingArrayElementValue2() {
		initializeArrayA1();
		int result = BinarySearch.binarySearch(ArrayA1, -100);
		assertTrue("Result is expected to be a negative value", result < 0);
	}

	/*
	 * Search for element value that does not exist in the array.
	 */
	@Test
	public void testNonExistingArrayElementValue3() {
		initializeArrayA1();
		int result = BinarySearch.binarySearch(ArrayA1, size+100);
		assertTrue("Result is expected to be a negative value", result < 0);
	}

	private void testArraySizeHelper(int arraySize) {
		ArrayA1 = new int[arraySize];

		for (int i = 0; i < arraySize; i++){
			ArrayA1[i] = i;
		}

		int result;

		for (int j = 0; j < arraySize; j++){
			result = BinarySearch.binarySearch(ArrayA1, ArrayA1[j]);
			assertEquals(j, result);
		}
	}

	/*
	 * Ensure searching still work when array size is as small as 1.
	 */
	@Test
	public void testSizeOneArray() {
		testArraySizeHelper(1);	
	}

	/*
	 * Ensure searching still work when array size is 2.
	 */
	@Test
	public void testSizeTwoArray() {
		testArraySizeHelper(2);
	}

	/*
	 * Ensure searching still work when array size is 3.
	 */
	@Test
	public void testSizeThreeArray() {
		testArraySizeHelper(3);
	}

	/*
	 * Ensure searching still work when array size is 4.
	 */
	@Test
	public void testSizeFourArray() {
		testArraySizeHelper(4);
	}

	/*
	 * Ensure searching still work when array size is 5.
	 */
	@Test
	public void testSizeFiveArray() {
		testArraySizeHelper(5);
	}

}
