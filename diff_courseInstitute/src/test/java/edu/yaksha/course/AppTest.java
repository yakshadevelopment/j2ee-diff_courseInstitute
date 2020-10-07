package edu.yaksha.course;

import static  edu.yaksha.course.TestUtils.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testApp() throws Exception {
		yakshaAssert(currentTest(),(true?"true":"false"),businessTestFile);
	}

	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }
}
