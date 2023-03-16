//Richard Brobbey
package org.howard.edu.hw4;
import java.util.*;
public class Driver
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		IntegerSet set1 = new IntegerSet(list1);
		IntegerSet set2 = new IntegerSet(list2);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Smallest value in set1 is: " + set1.smallest());
		System.out.println("Largest value in set1 is: " + set1.largest());
		
		set2.add(4);
		set2.add(5);
		
		System.out.println("Union of set1 and set2 " + set1.union(set2));
		System.out.println("Value of set2 is: " + set2.toString());
		System.out.println("The difference of set1 and set2 is  " + set1.diff(set2));
	}
}