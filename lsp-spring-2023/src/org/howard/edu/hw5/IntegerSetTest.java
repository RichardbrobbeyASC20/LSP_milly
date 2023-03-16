package org.howard.edu.hw5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.howard.edu.hw5.IntegerSet.IntegerSetException;
import java.util.*;

public class IntegerSetTest{
	IntegerSet sett;
	@BeforeEach
	public void setUp() {
		sett = new IntegerSet(null);
	}
	@Test
	@DisplayName("Test case adding element into set")
	public void testAdd() {
		setUp();
		Assertions.assertEquals(0, sett.length(), "Length should be zero");
		sett.add(7);
		Assertions.assertEquals(1, sett.length(), "Length should be one");
		sett.add(4);
		sett.add(3);
		Assertions.assertEquals(3, sett.length(), "Length should be three");
		sett.add(3);
		Assertions.assertEquals(3, sett.length(), "Length should remain three because 3 is already there");
	
	}
	@Test
	@DisplayName("Test case removing element from set or doing nothing if element isnt in set")
	public void testRemove(){
		setUp();
		sett.add(3);
		Assertions.assertEquals(1, sett.length(), "Length should one");
		sett.remove(3);
		Assertions.assertEquals(0, sett.length(), "Length should zero");
		sett.add(5);
		sett.add(10);
		sett.add(15);
		Assertions.assertEquals(3, sett.length(), "Length should be three");
		sett.remove(5);
		Assertions.assertEquals(2, sett.length(), "Length should be two");
		sett.remove(3);
		Assertions.assertEquals(2, sett.length(), "Length should remain two because it is not in the set");
		sett.remove(10);
		Assertions.assertEquals(1, sett.length(), "Length should be one");
		sett.remove(15);
		Assertions.assertEquals(0, sett.length(), "Length should be zero");
	}
	@Test
	@DisplayName("Test case for returning length of the set")
	public void testLength() {
		setUp();
		Assertions.assertEquals(0, sett.length(), "Length should zero because empty set");
		sett.add(1);
		sett.add(2);
		Assertions.assertEquals(2, sett.length(), "Length should be two");
		sett.remove(2);
		Assertions.assertEquals(1, sett.length(), "Length should be one");
	}
	@Test
	@DisplayName("Test case for clearing set")
	public void testClear() {
		setUp();
		Assertions.assertEquals(0, sett.length(), "Length should be zero because empty set");
		sett.add(2);
		sett.add(4);
		sett.add(6);
		Assertions.assertEquals(3, sett.length(), "Length should be three");
		sett.clear();
		Assertions.assertEquals(2, sett.length(), "Length should be zero after being cleared");
	}
	@Test
	@DisplayName("Test case checking if two sets are equal")
	public void testEquals(){
		setUp();
		IntegerSet set2 = new IntegerSet(null);
		Assertions.assertTrue(true == sett.equals(set2), "Should be true because both are empty");
		sett.add(1);
		set2.add(2);
		Assertions.assertTrue(true == sett.equals(set2), "Should not be true because elements are not the same");
		sett.add(2);
		set2.add(1);
		Assertions.assertTrue(true == sett.equals(set2), "Should be true because contains the same elements");

	}
	@Test
	@DisplayName("Test case for checking if the set contains an element")
	public void testContains(){
		setUp();
		sett.add(1);
		sett.add(2);
		Assertions.assertTrue(true == sett.contains(1), "Should be true because contains the element");
		sett.add(3);
		sett.add(4);
		Assertions.assertTrue(true == sett.contains(3), "Should be true because contains the element");
		sett.add(5);
		Assertions.assertTrue(true == sett.contains(6), "Should be false because it does not contain the element");


		
	}
	@Test
	@DisplayName("Test case for finding the largest")
	public void testLargest() throws IntegerSetException{
		setUp();
		sett.add(-2);
		sett.add(4);
		sett.add(6);
		sett.add(8);
		sett.add(10);
		Assertions.assertEquals(10, sett.largest(), "Largest element should be 10");
		sett.add(100);
		Assertions.assertEquals(100, sett.largest(), "Largest element should be 100");
		sett.remove(100);
		sett.remove(10);
		Assertions.assertEquals(8, sett.largest(), "Largest element should be 8");
	}
	@Test 
	@DisplayName("Test case for finding the smallest")
	public void testSmallest() throws IntegerSetException{
		setUp();
		sett.add(-2);
		sett.add(4);
		sett.add(6);
		sett.add(8);
		sett.add(10);
		Assertions.assertEquals(-2, sett.smallest(), "Smallest element should be -2");
		sett.remove(-2);
		Assertions.assertEquals(4, sett.smallest(), "Smallest element should be 4");
		sett.remove(4);
		sett.remove(6);
		Assertions.assertEquals(8, sett.smallest(), "Largest element should be 8");
	}
	@Test
	@DisplayName("Test case for finding unions of 2 sets")
	public void testUnion() {
		setUp();
		IntegerSet set2 = new IntegerSet(null);
		Assertions.assertEquals(0, sett.union(set2), "Should return empty set because both sets are empty");
		sett.add(1);
		sett.add(3);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		int[] result = {1, 3, 2, 4};
		Assertions.assertEquals(result, sett.union(set2), "Should return {1,3,2,4} in the set because thats all thats in union");
	}
	@Test
	@DisplayName("Test case for finding intersection of 2 sets")
	public void testIntersect() {
		setUp();
		IntegerSet set2 = new IntegerSet(null);
		sett.add(1);
		sett.add(3);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		int[] result = {};
		Assertions.assertEquals(3, sett.intersect(set2));	
	}
	@Test
	@DisplayName("Test case for difference")
	public void testDifference() {
		setUp();
		IntegerSet set2 = new IntegerSet(null);
		int[] result = {};
		Assertions.assertEquals(result, sett.diff(set2), "Should return {} empty set because both sets are empty");
		sett.add(1);
		sett.add(2);
		sett.add(3);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		int[] resultt = {4, 5};
		Assertions.assertEquals(resultt, sett.diff(set2), "Should return {4,5} in the set because thats the difference of the two sets");	
	}
	@Test
	@DisplayName("Test case for empty sets")
	public void testEmpty() {
		setUp();
		Assertions.assertTrue(true == sett.isEmpty(), "Should be true because the set is empty");
		sett.add(0);
		sett.add(1);
		Assertions.assertTrue(false == sett.isEmpty(), "Should be false because it contains elements");		
	}
	@Test
	@DisplayName("Test case for string representation of the set")
	public void testString() {
		setUp();
		Assertions.assertEquals("", sett.toString(), "Should return empty string because the set is empty");
		sett.add(1);
		sett.add(2);
		sett.add(3);
		Assertions.assertEquals("1, 2, 3,", sett.toString(), "Should return 1, 2, 3 because of the elements in the set");


	}
	
}