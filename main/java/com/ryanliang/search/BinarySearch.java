package com.ryanliang.search;

public class BinarySearch {

    public static int binarySearch(int[] a, int key) {
    	int low = 0;
    	int high = a.length - 1;

    	while (low <= high) {
    		int mid = (low + high) / 2;
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
    
	public static void main(String[] args) {
		
        int [] aa = {2, 45, 101, 234, 754, 1000, 1231};

        for (int i=0; i < aa.length; i++)
        	System.out.println("Binary search of key " + aa[i] + " is found on index: " + binarySearch(aa, aa[i])); 
        
        System.out.println("Binary search of 0 is found on index: " + binarySearch(aa, 0));
        System.out.println("Binary search of 5 is found on index: " + binarySearch(aa, 5));
        System.out.println("Binary search of 222 is found on index: " + binarySearch(aa, 222));
        System.out.println("Binary search of 1100 is found on index: " + binarySearch(aa, 1100));
        System.out.println("Binary search of 5555 is found on index: " + binarySearch(aa, 5555));
	}

}
