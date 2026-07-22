package org.tnsif.acc.c2tc.datatype_typecasting;


public class FoodOrder {

	public static void main(String[] args) {
		int orderId = 101;
		double price=300.102;
		boolean isDeliverded=false;
		char rating='A';
		float deliveryDistance=3.4f;
		long deliveryBoyPhone =8383748782L;
		byte deliveryTime=34;
		short restaurntId=12;
		 
		
		String CustomerName="satish";
		String[]fooditem= {"Burger","Rice","Coke"};
		System.out.println("Order summary");
		System.out.println("Curtomer Name :"+CustomerName);          
		System.out.println("Order Id:"+orderId);
        System.out.println("restaurntId"+restaurntId);
        System.out.println("Delivery Boy Contact:"+deliveryBoyPhone);
        System.out.println("Food items:");
        for(String item : fooditem)
        {
        	System.out.println("-"+ item);
        	System.out.println("Total price :"+price);
        	System.out.println("Delivey Distance :" +deliveryDistance);
        	System.out.println("Expected Time :"+deliveryTime);
        	System.out.println("Delivery status :"+ isDeliverded);
        	System.out.println("Rating:"+ rating);
        	
        	
        }
		
		
		
		
		// TODO Auto-generated method stub

	}

}
