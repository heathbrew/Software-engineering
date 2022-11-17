package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers 
{
	@Test
	public void test()
	{
		jUnitFunctions jUnit = new jUnitFunctions();
		int result = jUnit.addNumbers(55,56);
		assertEquals(111,result);
	}

}