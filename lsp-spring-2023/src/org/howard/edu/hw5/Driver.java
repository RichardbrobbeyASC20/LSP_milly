//Richard Brobbey
package org.howard.edu.hw5;
import java.util.*;
public class Driver
{
	public static void main(String[] args)
	{
		try {
			IntegerSet set1 = new IntegerSet();
			for(int i = 1; i <= 10; i++) {
				
				set1.add(i);
			}
			System.out.println("Value of Set 1 is: " + set1.toString() + "\n");
			System.out.println("Smallest value in Set 1 is: " + set1.smallest() + "\n");
			System.out.println("Largest value of Set 1 is: " + set1.largest() + "\n");
			ArrayList<Integer> list1 = new ArrayList<>();
			IntegerSet set2 = new IntegerSet(list1);
			set2.add(1);
			set2.add(2);
			set2.add(3);
			System.out.println("Value of set1 is: " + set1.toString());
			System.out.println("Smallest value in set1 is: " + set1.smallest());
			System.out.println("Largest value in set1 is: " + set1.largest());
			
			set1.remove(100);
			System.out.println("Removed 100 from Set 1.\n" + "New value of Set 1:" + set1.toString() + "\n");
			System.out.println("Length of Set 1 is: " + set1.length() + "\n");
			
			System.out.println("Set 1 contains 314? (true/false)");
			System.out.println(set1.contains(314) + "\n");
			System.out.println("Length of Set 1: " + set1.length() + "\n");
			System.out.println("Union of set1 and set2 " + set1.union(set2));
			System.out.println("Value of set2 is: " + set2.toString());
			System.out.println("The difference of set1 and set2 is  " + set1.diff(set2));
		}
	}
}