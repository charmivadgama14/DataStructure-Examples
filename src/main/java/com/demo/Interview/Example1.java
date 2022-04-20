package com.demo.Interview;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		String str = "123";
		System.out.println("Reverse String  " + reverse(str));
		Example1.printFibonacciSeries(10);
	//	List<Integer> list = [1,2,3,4,5,6,7,8,910,11,12,13,14,15,16];
		List<Integer> i = new ArrayList<>();
		for(int n=1;n<10; n++){
		    // your logic here make use of Arrays.asList()
		    i.add(n);
		}
	
		Boolean onlyOdd = Example1.onlyOddNumbers(i);
		System.out.println(onlyOdd);
		
	}
	
	public static void printFibonacciSeries(int count) {
		int a = 0;
		int b = 1;
		int c = 1;
	//	ResultofSeries result = new ResultofSeries();
		for (int i = 1; i <= count; i++) {
		
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
		//return returl;
	}

	public static String reverse(String in) {
		if (in == null)
			
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();
		
		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
	
	public static boolean onlyOddNumbers(List<Integer> i2) {
		for (int i : i2) {
			if (i % 2 == 0)
				return false;
		}
		return true;
	}

}/*reverse a string*/

