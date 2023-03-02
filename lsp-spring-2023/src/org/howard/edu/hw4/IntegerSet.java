//Richard Brobbey
package org.howard.edu.hw4;
import java.util.ArrayList;

public class IntegerSet{
	ArrayList<Integer> set = new ArrayList<Integer>();
	
	public IntegerSet(ArrayList list)
	{
		this.set = list;
	}
	public void clear()
	{
		set.clear();
	}
	public int length() {
		return set.size();
	}
	public boolean equals(IntegerSet b)
	{
		ArrayList<Integer> set2 = b.list;
		if(set.size() != set2.size())
		{
			return false;
		}
	}
}