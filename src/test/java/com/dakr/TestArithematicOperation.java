package com.dakr;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArithematicOperation {

 static  ArithematicOperation operation=new ArithematicOperation();
	
	
	@BeforeClass
	public static void init() {
		operation=new ArithematicOperation();
	}
	
	@AfterClass
	public static void destroy() {
		operation=null;
	}
	
	@Test
	public void test_add() {
		assertEquals(20,operation.add(15,5));
	}
	
	@Test
	public void test_multiply() {
		assertEquals(25, operation.multiply(5, 5));
	}

}
