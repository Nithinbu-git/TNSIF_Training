package org.tnsif.acc.c2tc.datatype_typecasting;

public class TypecastingDemo {

	public static void main(String[] args) {
		
		double pricePerItem=99.30;
		int quantity =3;
		double totalPrice=quantity*pricePerItem;
		
		
		double discount =10.33;
		int roundedDiscount=(int)discount;
		
		
		double finalAmount = totalPrice-roundedDiscount;
		
		
		System.out.println("Online Shopping Summary");
		System.out.println("items Bought :"+ quantity);
		System.out.println("Price Per Item  :"+ pricePerItem);
		System.out.println("Final Amount to pay after discount  :"+ finalAmount);
		
		
		// TODO Auto-generated method stub

	}

}
