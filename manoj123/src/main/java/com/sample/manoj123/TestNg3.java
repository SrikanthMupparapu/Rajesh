package com.sample.manoj123;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg3 {
	
	@Test
	public void Demo1()

	{
		Assert.assertTrue(false);
		System.out.println("Demo1 is called................");
		
	}
	
	@Test(dependsOnMethods = "Demo1")
	public void Demo2()

	{
		System.out.println("Demo2 is called................");
	}
	
	@Test(dependsOnMethods = "Demo2")
	public void Demo3()

	{
		System.out.println("Demo3 is called................");
	}
	
	@Test(priority = 0)
	public void Demo4()

	{
		System.out.println("Demo4 is called................");
	}
	
	@Test(priority = 1)
	public void Demo5()

	{
		System.out.println("Demo5 is called................");
	}
}
