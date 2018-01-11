package com.accolite.mini_au;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzMain{

	
	int a = 6,b = 20, c = 30, d = 7;
	static Logger logger;
	FizzBuzzTester test; 
	
	@BeforeClass
	public static void init_() {
		System.out.println("beforeclass");
		//limit = 16;
		
	}

	@Before
	public void setup() throws Exception {
		System.out.println("before");
		test = new FizzBuzzTester();
		logger = Logger.getLogger("FizzBuzzTester");
		//BasicConfigurator.configure();
	}

	@Test
	public void getResult_()
	{
		
		
			assertEquals("Fizz",test.getResult(a));
			assertEquals("Buzz",test.getResult(b));
			assertEquals("FizzBuzz",test.getResult(c));
			assertEquals("none",test.getResult(d));
		
		
	}
	
	@AfterClass
	public static void afterClass()
	{
		logger.info("After Class");
	}
	
}
