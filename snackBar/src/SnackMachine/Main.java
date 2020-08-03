package SnackMachine;

public class Main {
	private static void vendMySnacks() {
		// String name, double cashOnHand
		Customer cust1 = new Customer("Jason", 37.75);
		Customer cust2 = new Customer("Kimberly", 28.14);
		
		// String name, int quantity, double cost, int vendingMachineId
		Snack s1 = new Snack("Snickers", 21, 1.00, 1);
		Snack s2 = new Snack("Twinkies", 35, 1.00, 1);
		Snack s3 = new Snack("Chimichangas", 29, 1.00, 1);
		Snack s4 = new Snack("Doritos", 19, 1.00, 1);
		
		//Output c1 and cash
		System.out.println(cust1);
		//Output s4 and qty
		System.out.println(s4);
		
		//decrease c1 cash by 2.00, output c1 and cash
		//output s3 and qty
		
		//output c2 and cash
		//decrease s4 qty by 2, output s4 and qty
		
		//increase c1 cash by 10.00, output c1 and cash
		
		//decrease c1 cash by 1.00, output c1 and cash
		//output s2 and qty
		
		//increase s3 by 12, output s3 and qty
		
		//decrease c2 cash by 6.00, output c2 and cash
		//decrease s3 by 3, output s3 and qty
	}
	
	public static void main(String[] args) {
		vendMySnacks();
	}
}