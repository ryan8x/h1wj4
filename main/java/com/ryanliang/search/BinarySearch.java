/**
 *
 * @author Ryan L.
 */

package com.ryanliang.search;

public class BinarySearch {

    public static int binarySearch(int[] a, int key) {
    	int low = 0;
    	int high = a.length - 1;

    	while (low <= high) {
    		//If the sum of low+high is greater than (2^31)-1 or 2,147,483,647 or Integer.MAX_VALUE, the sum overflows to a negative value.  
    		//The result of a negative value divided by 2 causes ArrayIndexOutOfBoundsException to be throwing for a[mid]. 
    		
    		//int mid = (low + high) / 2;
    		
    		int mid = low + ((high - low) / 2);	//This line fixes the overflow issue.
    		int midVal = a[mid];

    		if (midVal < key)
    			low = mid + 1;
    		else if (midVal > key)
    			high = mid - 1;
    		else
    			return mid; // key found
    	}
    	return -(low + 1);  // key not found.

    }

}
