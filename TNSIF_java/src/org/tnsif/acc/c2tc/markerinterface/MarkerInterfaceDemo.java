package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Object obj=new Object();
		
		if(obj instanceof Iterable)
		{
			System.out.println("Student is registered for this course");
			
		}
		else
		{
			System.out.println("Student is not registered for this course");
		}
		

	}

}