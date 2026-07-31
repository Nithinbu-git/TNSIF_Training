package org.tnsif.acc.c2tc.oops;



class addition
{
	int add(int a,int b)
	{
	System.out.println(a+b);
	return a+b;
	}
	double add(int c , double d,int k)
	{
		System.out.println(c+d+k);
		return c+d+k;
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		addition a = new addition();
		a.add(23, 22.3,2);
		a.add(2, 4);
		
		// TODO Auto-generated method stub

	}

}
