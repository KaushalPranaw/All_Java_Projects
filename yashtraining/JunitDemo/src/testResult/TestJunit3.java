package testResult;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import logic.Calculation;

public class TestJunit3 extends TestResult {
   // add the error
   /*public synchronized void addError(Test test, Throwable t) {
      super.addError((junit.framework.Test) test, t);
   }*/
	 @Override
	 public synchronized void addError(junit.framework.Test arg0, Throwable arg1) {
	 	// TODO Auto-generated method stub
	 	super.addError(arg0, arg1);
	 }
	

   // add the failure
  /* public synchronized void addFailure(Test test, AssertionFailedError t) {
      super.addFailure((junit.framework.Test) test, t);
   }*/
	 @Override
	 public synchronized void addFailure(junit.framework.Test arg0, AssertionFailedError arg1) {
	 	// TODO Auto-generated method stub
	 	super.addFailure(arg0, arg1);
	 }
  

@Test
   public void testAdd() {
      // add any test
	assertEquals(27, Calculation.cube(5));
	//assertEquals(27, Calculation.cube(4));
	//System.out.println(addFailure(arg0, arg1););
   }
@Test
public void testAdd1() {
   // add any test
	//assertEquals(27, Calculation.cube(5));
	assertEquals(27, Calculation.cube(4));
	//System.out.println(addFailure(arg0, arg1););
}
  


// Marks that the test run should stop.
   public synchronized void stop() {
      //stop the test here
   }
}