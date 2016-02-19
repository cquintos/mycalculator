/**
 * Author: JC Carlo Quintos
 * Program Description: Tester of the following calculator functions: Nfactorial of an integer and binary search.
 * Section: AB-6L
 * Date finished: 2-19-16
**/

package calculator;													// My package name				

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {												// Class

	@Test
	public void testNfactorial() {									// Test for the NFactorial function
		MyCalculator newCal = new MyCalculator();					// Instantiate a MyCalculator
		
		////////////////////////////////////////////////////////////// FIRST test case: 0
		int test1 = newCal.nfactorial(0);
		// Expected output: 1 with delta 0
		assertEquals("Expected 0!=1", 1, test1, 0.0);
		
		////////////////////////////////////////////////////////////// SECOND test case: 2
		int test2 = newCal.nfactorial(2);
		//Expected output: 2 with delta 0
		assertEquals("Expected 2!=2", 2, test2, 0.0);
		
		////////////////////////////////////////////////////////////// THIRD test case: 5
		int test3 = newCal.nfactorial(5);
		// Expected output: 120 with delta 0
		assertEquals("Expected 5!=120", 120, test3, 0.0);
	}// End of NFactorial of an integer tester

	@Test
	public void testBinarySearch() {								// Test for the binary search function
		MyCalculator myCal = new MyCalculator();					// Instantiate a MyCalculator
		int[] array1 = {1,2,3,4,5};									// Array for the first test
		int[] array2 = {1,2,3,4,5,6};								// Array for the second test
		int[] array3 = {1,4,7};										// Array for the third test
		
		//////////////////////////////////////////////////////////////FIRST test case: array1; to be searched: 1
		int test1 = myCal.binarySearch(array1, 1);
		// Expected output: 0 with delta 0
		assertEquals("Expected location = 0", 0, test1, 0.0);
		
		//////////////////////////////////////////////////////////////FIRST test case: array2; to be searched: 3
		int test2 = myCal.binarySearch(array2, 3);
		// Expected output: 2 with delta 0
		assertEquals("Expected location = 2", 2, test2, 0.0);
		
		//////////////////////////////////////////////////////////////FIRST test case: array3; to be searched: 7
		int test3 = myCal.binarySearch(array3, 7);
		// Expected output: 2 with delta 0
		assertEquals("Expected location = 2", 2, test3, 0.0);
	} // End of BinarySearch tester

} // End of tester