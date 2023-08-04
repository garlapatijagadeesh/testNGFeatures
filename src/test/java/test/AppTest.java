package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@BeforeSuite
		public void BeforeSuite() {
		System.out.println("@BeforeSuite");
	}
	@AfterSuite
		public void AfterSuite() {
		System.out.println("@AfterSuite");
	}
	@BeforeTest
		public void BeforeTest() {
		System.out.println("@BeforeTest");
	}
	@AfterTest
		public void AfterTest() {
		System.out.println("@AfterTest");
	}
	
	@BeforeGroups
		public void BeforeGroups() {
		System.out.println("@BeforeGroups");
	}
	@AfterGroups
	
	public void AfterGroups() {
		System.out.println("@AfterGroups");
	}
	@BeforeClass
	
	public void BeforeClass() {
		System.out.println("@BeforeClass");
	}
	@AfterClass
	
	public void AfterClass() {
		System.out.println("@AfterClass");
	}
	@BeforeMethod
	
	public void BeforeMethod() {
		System.out.println("@BeforeMethod");
	}	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("@AfterMethod");
	}

	@Test
	public void a() {
		System.out.println("a");
	}

	@Test
	public void b() {
		System.out.println("b");
	}

	@Test
	public void c() {
		System.out.println("c");
	}

	@Test
	public void d() {
		System.out.println("d");
	}

	@Test
	public void e() {
		System.out.println("e");
	}

	@Test
	public void f() {
		System.out.println("f");
	}

	@Test
	public void g() {
		System.out.println("g");
	}

	@Test
	public void h() {
		System.out.println("h");
	}

	@Test
	public void i() {
		System.out.println("i");
	}
}