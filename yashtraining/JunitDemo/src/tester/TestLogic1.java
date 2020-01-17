package tester;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import logic.Calculation;

public class TestLogic1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	

	@Test
	public void reverse() {
		System.out.println("in reverse string");
		assertEquals("pranaw", Calculation.reverseWord("wanarp"));
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
