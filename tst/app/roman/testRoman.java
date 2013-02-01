package app.roman;
import static org.junit.Assert.*;

import org.junit.Test;


public class testRoman
{

	@Test public void test_simple_roman_0()
	{
		assertEquals( 0, RomanNumber.convert("N") );
	}

	@Test public void test_simple_roman_1()
	{
		assertEquals( 1, RomanNumber.convert("I") );
	}
	
	@Test public void test_simple_roman_5()
	{
		assertEquals( 5, RomanNumber.convert("V") );
	}
	
	@Test public void test_simple_roman_10()
	{
		assertEquals( 10, RomanNumber.convert("X") );
	}
	
	@Test public void test_simple_roman_50()
	{
		assertEquals( 50, RomanNumber.convert("L") );
	}
	
	@Test public void test_simple_roman_100()
	{
		assertEquals( 100, RomanNumber.convert("C") );
	}
	
	@Test public void test_simple_roman_500()
	{
		assertEquals( 500, RomanNumber.convert("D") );
	}
	
	@Test public void test_simple_roman_1000()
	{
		assertEquals( 1000, RomanNumber.convert("M") );
	}
	
	@Test public void test_simple_roman_number()
	{
		assertEquals( 22, RomanNumber.convert("XXII") );
	}
	
	@Test public void test_complex_roman_number()
	{
		assertEquals( 1976, RomanNumber.convert("MCMLXXVI") );
	}
}
