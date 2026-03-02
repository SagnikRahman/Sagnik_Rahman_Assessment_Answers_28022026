package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JUnitTest {
	
	@BeforeEach
	public void start() {
		System.out.println("Before Each");
	}
	
	@BeforeAll
	public void start1() {
		System.out.println("Before All");
	}

	@Test
	void test1() {
		Junit j = new Junit();
		Boolean actual = j.reverse("MALAYALAM");
		Boolean expected = true;
		assertEquals(expected,actual);
	}
	
	@Test
	void test2() {
		Junit j = new Junit();
		assertTrue(j.isPrime(7));;
	}
	
	 @Test
	 void testSort() {
		 Junit j = new Junit();
	     int[] input = {5, 3, 1, 4, 2};
	     int[] expected = {1, 2, 3, 4, 5};
	     int[] actual = j.sortArray(input);
	     assertArrayEquals(expected, actual);
     }
	 
	 @Test
	 void arrayTest() {
	  	try {
	   		int arr[] = null;
	   		for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
	   	} catch (NullPointerException e) {
	   		System.out.println("NullPointerException Handled");
	   	}
	 }
	 
	 @Test
	 void multipleExceptionTest() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Handled");
        }
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Handled");
        }
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        }

        try {
            int n = Integer.parseInt("abc");
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        }
    }
}
