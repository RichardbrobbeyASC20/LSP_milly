package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range {
	private int lower;
   	private int upper;

	// Hint: implement getters for lower and upper

   	 IntegerRange(int lower, int upper) { 	// Constructor
        		this.lower = lower;
        		this.upper = upper;
   	 }
   	 public int getLow() {
   		 return lower;
   	 }
   	 public int getUp() {
   		 return upper;
   	 }
	public boolean contains(int value) {
		if(getLow() > value || value > getUp()) {
			return false;
		}
		else {
			return true;
		}
	}
public boolean overlaps(Range other) throws EmptyRangeException {
		if(other == null) {
			throw new EmptyRangeException("The range is empty");
		}
		else {
			if(getLow() >= other.getLow() && (getUp() <= other.getUp() || getUp() >= other.getUp()) && (getLow() > other.getUp())) {
				return false;
			}
			return true;
		}
	}

public int size()  {
		return getUp() - getLow();
	}


}
