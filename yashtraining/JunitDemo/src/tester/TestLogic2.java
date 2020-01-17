package tester;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import logic.Calculation;

public class TestLogic2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	public void testCube() {
		System.out.println("test cube");
		assertEquals(27, Calculation.cube(3));
	}

	@Test
	public void testFindMax() {
		System.out.println("test case find max");
		assertEquals(4, Calculation.findMax(new int[] { 1, 2, 3, 4 }));
		assertEquals(-1, Calculation.findMax(new int[] { -1, -2, -3, -54 }));
	}

	

	@After
	public void tearDown() {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("After class");
	}

}
