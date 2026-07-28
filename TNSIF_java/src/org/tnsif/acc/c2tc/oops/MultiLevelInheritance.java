package org.tnsif.acc.c2tc.oops;



class Device
{
	void deviceType()
	{
		System.out.println(" I am  eclectronic Device");
		
	}
}


class Phone extends Device
{
	void brand()
	{
		System.out.println(" brand : IQ");
		
	}
}


class smartPhone  extends Phone

{
void features ()
{
	System.out.println(" features : Screen  ,  RAM");
}
		// TODO Auto-generated method stub


	
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		
	smartPhone SmartPhone = new smartPhone();
	SmartPhone.deviceType();
	SmartPhone.brand();
	SmartPhone.features();
	
	

	}

}
