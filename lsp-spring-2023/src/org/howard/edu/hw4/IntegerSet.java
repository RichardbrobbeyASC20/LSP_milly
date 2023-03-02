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
	
}