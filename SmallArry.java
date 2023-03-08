package com.jsp.Stringpack;

public class SmallArry {

	public static void main(String[] args) {
		int[] arr= {5,7,4,6,4,8,2};
		 
		int small= arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < small) small=arr[i];
		}
		System.out.println(small);
	}
}
