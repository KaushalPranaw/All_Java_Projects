package delta;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesterJunit {

	
		EmployeeBusinessLogic employeeBusinessLogic=new EmployeeBusinessLogic();
		Employee emp=new Employee();
		
		@BeforeClass
		public static void setUpBeforeClass()
		{
			System.out.println("Before class");
		}
		
		@Before
		public  void setUp()
		{
			System.out.println("Before ");
		}
		
		@Test
		public void testAnnualSalary() {
			emp.setId(1);
			emp.setName("asdasd");
			emp.setSalary(3000.0);
			assertEquals(36000.0, employeeBusinessLogic.annualSalary(emp), 0.0);
			System.out.println("in test annual");
		}
		
		@Test
		public void testAppraisal() {
			emp.setId(2);
			emp.setName("dasdas");
			emp.setSalary(12000.0);
			System.out.println("in test appraisal");
			assertEquals(1000, employeeBusinessLogic.appraisal(emp), 0.0);
		}
		
		
		@After
		public  void tearDown()
		{
			System.out.println("After ");
		}
		
		@AfterClass
		public static void tearDownBeforeClass()
		{
			System.out.println("After class");
		}
		
		
	
}
