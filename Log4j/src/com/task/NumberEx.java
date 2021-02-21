package com.task;

import org.junit.jupiter.api.Test;

public class NumberEx{

	public boolean isPrime(Integer a) {
	      boolean value = true;
	      for (int i = 2; i < a.intValue(); i++) {
	         if (a.intValue() % i == 0) {
	            value = false;
	            break;
	         }    // if
	      }       // for i
	      return value;
	   }     


 
	public boolean isEvenNumber(int number){
        
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }


	public boolean isAmstrong(int a) {
        int temp, digit, sumOfPower = 0;
        temp = a;
        int digits = countDigit(a);
        while (temp != 0) {
            digit = temp % 10;
            sumOfPower = sumOfPower + (int) Math.pow(digit, digits);
            System.out.println("Current sumOfPower is " + sumOfPower);
            temp /= 10;
        }
        return sumOfPower == a;
    }



	private int countDigit(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

}




