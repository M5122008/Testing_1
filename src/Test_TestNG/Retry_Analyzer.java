package Test_TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class Retry_Analyzer {
	@Test(retryAnalyzer=retryAnalysis.class)
	public void Test1()
	{
		AssertJUnit.assertEquals(false, true);
	}
 
	@Test
	public void Test2()
	{
		AssertJUnit.assertEquals(false, true);
	}

}
