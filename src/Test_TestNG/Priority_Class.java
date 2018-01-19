package Test_TestNG;

import org.testng.annotations.Test;

public class Priority_Class {
	@Test(priority=19)
	public void fun1() {
		System.out.println("this is function 1");
	}
	@Test(priority=-100,enabled=false)
	public void fun2() {
		System.out.println("this is function 2");
	}
	@Test(priority=-100)
	public void fun3() {
		System.out.println("this is function 3");
	}
}
