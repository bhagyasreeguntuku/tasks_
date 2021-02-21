package com.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllExceptionTest {
	 AllExceptionEx aee=new AllExceptionEx();
	@Test
	 public void testisArithmatic() {
		assertEquals(3, aee.Arithmatic(6, 2),"successfuly");
	
	}

}
