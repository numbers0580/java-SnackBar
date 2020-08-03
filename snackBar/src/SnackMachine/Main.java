package SnackMachine;

public class Main {
	private static void vendMySnacks() {
		// String name, double cashOnHand
		Customer cust1 = new Customer("Jason", 37.75);
		Customer cust2 = new Customer("Kimberly", 28.14);
		
		// String name, int quantity, double cost, int vendingMachineId
		Snack s1 = new Snack("Snickers", 26, 1.50, 1);
		Snack s2 = new Snack("Twinkies", 35, 1.75, 1);
		Snack s3 = new Snack("Chimichangas", 29, 3.50, 1);
		Snack s4 = new Snack("Doritos", 21, 1.00, 1);
		
		/*
		System.out.println("Tests below:");
		System.out.println("1 Snickers");
		System.out.println(s1.totalCost(1));
		System.out.println("1 Twinkie");
		System.out.println(s2.totalCost(1));
		System.out.println("1 Chimichanga");
		System.out.println(s3.totalCost(1));
		System.out.println("1 Doritos");
		System.out.println(s4.totalCost(1));
		System.out.println("3 Snickers");
		System.out.println(s1.totalCost(3));
		System.out.println("7 Twinkies");
		System.out.println(s2.totalCost(7));
		System.out.println("5 Chimichangas");
		System.out.println(s3.totalCost(5));
		System.out.println("12 Doritos");
		System.out.println(s4.totalCost(12));
		*/
		//The above tests were successful
		
		//Output c1 and cash
		System.out.println(cust1);
		//Output s4 and qty
		System.out.println(s4);
		
		//decrease c1 cash by 2.00 and s4 by 2, output c1 and cash
		if(cust1.getCashOnHand() > s4.totalCost(2)) {
			System.out.println(cust1.getName() + " is able to afford 2 " + s4.getName());
			s4.buySnack(2);
			cust1.buySnacks(s4.totalCost(2));
		} else {
			System.out.println(cust1.getName() + " cannot afford 2 " + s4.getName());
		}
		System.out.println('\n');
		System.out.println(cust1);
		//output s3 and qty
		System.out.println(s3);
		
		//No specifications in instructions on how much s3 costs or how much was purchased, so I'll make it up
		if(cust1.getCashOnHand() > s3.totalCost(3)) {
			System.out.println(cust1.getName() + " is able to afford 3 " + s3.getName());
			s3.buySnack(3);
			cust1.buySnacks(s3.totalCost(3));
		} else {
			System.out.println(cust1.getName() + " cannot afford 3 " + s3.getName());
		}
		System.out.println('\n');
		
		//output c2 and cash
		System.out.println(cust2);
		//output s4 and qty
		System.out.println(s4);
		if(cust2.getCashOnHand() > s4.totalCost(6)) {
			System.out.println(cust2.getName() + " is able to afford 6 " + s4.getName());
			s4.buySnack(6);
			cust2.buySnacks(s4.totalCost(6));
		} else {
			System.out.println(cust2.getName() + " cannot afford 6 " + s4.getName());
		}
		
		//increase c1 cash by 20.50, output c1 and cash
		cust1.addCashOnHand(20.50);
		System.out.println('\n');
		System.out.println(cust1);
		
		//decrease c1 cash by 1.00, output c1 and cash
		cust1.addCashOnHand(-1);
		System.out.println('\n');
		System.out.println(cust1);
		//output s2 and qty
		System.out.println(s2);
		
		//increase s3 by 15, output s3 and qty
		s3.addQuantity(15);
		System.out.println('\n');
		System.out.println(s3);
		
		if(cust1.getCashOnHand() > s3.totalCost(3)) {
			System.out.println(cust1.getName() + " is able to afford 3 " + s3.getName());
			s3.buySnack(3);
			cust1.buySnacks(s3.totalCost(3));
		} else {
			System.out.println(cust1.getName() + " cannot afford 3 " + s3.getName());
		}
		System.out.println('\n');
		
		//output c2 and cash
		System.out.println(cust2);
		//decrease s3 by 3, output s3 and qty
		System.out.println(s3);
	}
	
	public static void main(String[] args) {
		vendMySnacks();
	}
}