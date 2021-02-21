package com.task;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class EvenPrimeAmsExTest {
	NumberEx nx=new NumberEx();
	
	 @Test
	   public void testIsPrime() {
	      
	      assertTrue("17 is a prime number",
	                 nx.isPrime(new Integer(17)));
	      assertFalse("16 is not a prime number",
	                  nx.isPrime(new Integer(16)));
	   } 

	 @Test
	    public void testEvenOddNumber(){
	      
	        assertEquals("10 is a even number", true, nx.isEvenNumber(10));
	    }


	 @Test
	    public void testisAmstrong() {
	      assertEquals(nx.isAmstrong(153), equals(true));
//	      assertEquals(nx.isAmstrong(370), equals(true));
//	      assertEquals(nx.isAmstrong(371), equals(true));
//	      assertEquals(nx.isAmstrong(407), equals(true));
//	      assertEquals(nx.isAmstrong(8208), equals(true));
	    }
}
