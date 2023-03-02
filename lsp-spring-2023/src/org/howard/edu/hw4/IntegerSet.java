//Richard Brobbey
package org.howard.edu.hw4;
import java.util.ArrayList;
import java.util.Collections;

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
		ArrayList<Integer> set2 = b.set;
		if(set.size() != set2.size())
		{
			return false;
		}
		ArrayList<Integer> temp = set;
		ArrayList<Integer> temp2 = set2;
		Collections.sort(temp);
		Collections.sort(temp2);
		
		for(int i = 0; i < temp.size(); i++)
		{
			if(temp.get(i) != temp2.get(i))
			{
				return false;
			}
		}
		return true;
	}
	public boolean contains(int v)
	{
		for(int i = 0; i< set.size(); i++)
		{
			if(v == set.get(i))
			{
				return true;
			}
		}
		return false;
	}
	
}