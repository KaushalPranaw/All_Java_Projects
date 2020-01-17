package tester;

import junit.framework.TestCase;

public class JavaTest extends TestCase {

	protected int value1,value2;
	protected void setUp()
	{
		value1=3;
		value2=6;
	}
	
	public void testAdd() {
		// TODO Auto-generated method stub
		int r=value1+value2;
		assertTrue(r==9);
	}
	
}
