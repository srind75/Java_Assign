package com.generics;

	class GenCollEx<T extends Number> {
		T[] nums; 
		GenCollEx(T[] o) {
		nums = o;
		}
		
		public double sum() {
	    double sum = 0.0;
		for(int i=0; i < nums.length; i++)
			sum += nums[i].doubleValue();
		System.out.println("sum   :  "+sum);
		return sum;
		}
		}