package org.howard.edu.lsp.midterm.problem51;

import org.junit.jupiter.api.Assertions;
import org.howard.edu.lsp.midterm.problem51.Range.EmptyRangeException;
class RangeTest{
	IntegerRange range;
	@BeforeEach
	void setUp() throws Exception {
		range = new IntegerRange(5, 25);
	}
	@AfterEach
	void clear() throws Exception {
		range = null;
	}
	
	@Test
	@DisplayName("Test for getLow")
	void testGetLow() {
		Assertions.assertEquals(range.getLow(), 5);
	}
	@Test 
	@DisplayName("Test for getUp")
	void testGetUp() {
		Assertions.assertEquals(range.getUp(), 25);
	}
	@Test 
	@DisplayName("Test for contains")
	void testContains() {
		Assertions.assertTrue(range.contains(24));
		Assertions.assertTrue(range.contains(4));
		Assertions.assertFalse(range.contains(-1));
		Assertions.assertFalse(range.contains(26));
	}
	@Test 
	@DisplayName("Test for overlaps")
	void testContains() {
		IntegerRange rangee;
		rangee = new IntegerRange(5, 10);
		Assertions.assertTrue(range.overlaps(rangee));
		Assertions.assertTrue(rangee.overlaps(range));
		
		rangee = new IntegerRange(26, 30);
		Assertions.assertFalse(range.overlaps(rangee));
		Assertions.assertFalse(rangee.overlaps(range));
		
	}
}