//Richard Brobbey
package org.howard.edu.hw5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class IntegerSet{
	List<Integer> set;
	
	public IntegerSet()
	{
		set = new ArrayList<Integer>();
	}
	public class IntegerSetException extends Exception {
		public IntegerSetException(String error) {
			super(error);
		}
	}
	public List<Integer> getset(){
		return set;
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
		else {
			return set.containsAll(set2);
		}
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
	public int largest() throws IntegerSetException{
		if(set.isEmpty()) {
			throw new IntegerSetException("The set is empty.");
		}
		else {
			int max = set.get(0);
			for(int i = 0; i < set.size(); i++) {
				if(set.get(i) > l) {
					max = set.get(i);
				}
			}
			return l;
		}
	}
	public int smallest() throws IntegerSetException
	{
		if(set.isEmpty()) {
			thow new IntegerSetException("This IntegerSet is empty.")
		}
		int min = set.get(0);
		for(int i = 0; i < set.size(); i++)
		{
			if(set.get(i) < min)
			{
				min = set.get(i);
			}
		}
		return min;
	}
	public void add(int item)
	{
		boolean trust = false;
		for(int i = 0; i < set.size(); i++)
		{
			if(set.get(i) == item)
			{
				trust = true;
			}
		}
		if(trust == false)
		{
			set.add(item);
		}
	}
	public void remove(int item)
	{
		for(int i = 0; i<set.size();i++)
		{
			if(set.get(i) == item)
			{
				set.remove(i);
			}
		}
	}
	public IntegerSet union(IntegerSet set2)
	{
		ArrayList<Integer> temp = set2.set;
		Set<Integer> st = new HashSet<>();
		st.addAll(set);
		st.addAll(temp);
		ArrayList<Integer> temp2 = new ArrayList<>(st);
		IntegerSet lt = new IntegerSet(temp2);
		return lt;
	}
	public IntegerSet diff(IntegerSet list)
	{
		ArrayList<Integer> temp = list.set;
		set.removeAll(temp);
		IntegerSet list0 = new IntegerSet(set);
		return list0;
	}
	boolean isEmpty()
	{
		boolean output = false;
		if(set.size() < 1)
		{
			output = true;
		}
		return output;
	}
	public String toString()
	{
		String output = "";
		for(int i = 0; i<set.size();i++)
		{
			
			output = output + set.get(i) + ", ";
		}
		return output;
	}
	public void intersect(IntegerSet intsetb)
	{
		set.retainAll(intsetb.set);
	}
}