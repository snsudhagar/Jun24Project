package com.arr;

public class ArrayEn {
	public static void main(String[] args) {
		//create object for array
		//Datatype variable[]= new Datatype[size];
		int a[]=new int[4];
		//index         //size
		//To insert values from Array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[3]=100;
		//to print the values from array
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		//System.out.println(a[2]);
		//System.out.println(a[3]);
		
		int length = a.length;
		//for loop
		//index based
	//	for(int i=0; i<a.length;i++)
		//{
		//	System.out.println(a[i]);
	//	}
		//Enhanced for loop is value based
		
	for(int b:a)	{
		System.out.println(b);
	}
		
		
	}

}
