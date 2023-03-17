package org.howard.edu.lsp.midterm.problem51;

import org.howard.edu.lsp.midterm.problem51.Range.EmptyRangeException;

public interface Range {
	public boolean contains(int value);
	public boolean overlaps(Range other) throws EmptyRangeException;
	public class EmptyRangeException extends Exception {
		public EmptyRangeException(String error) {
			super(error);
		}
	}
	public int size();
	public int getUp();
	public int getLow();

}
