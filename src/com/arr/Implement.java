package com.arr;




public class Implement {

	
	public static void main(String[] args)  {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int length= a.length;
		int sum =0;
		for (int i=0; i<a.length;i++)
		{
			sum = sum+a[i];	
	}
		int average = sum/length;
		System.out.println("Avearge valye is: "+ average);
		
		System.out.println("Work done by Dev");
	}
}
