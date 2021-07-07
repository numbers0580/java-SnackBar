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
		
		System.out.println("\nStretch Goals");
		
		VendingMachine machine1 = new VendingMachine("Food");
		VendingMachine machine2 = new VendingMachine("Drink");
		
		// String name, int quantity, double cost, int vendingMachineId
		Snack stretch[] = new Snack[5];
		stretch[0] = new Snack("Chips", 36, 1.75, machine1.getId());
		stretch[1] = new Snack("Chocolate Bar", 35, 1.00, machine1.getId());
		stretch[2] = new Snack("Pretzel", 38, 2.00, machine1.getId());
		stretch[3] = new Snack("Soda", 19, 2.50, machine2.getId());
		stretch[4] = new Snack("Water", 20, 2.75, machine2.getId());
		
		for(int i = 0; i < stretch.length; i++) {
			System.out.println('\n');
			System.out.println("Snack: " + stretch[i].getName());
			if(stretch[i].getVendingMachineId() == 1) {
				System.out.println("Vending Machine: " + machine1.getName());
			} else if(stretch[i].getVendingMachineId() == 2) {
				System.out.println("Vending Machine: " + machine2.getName());
			} else {
				System.out.println("Vending Machine: Not Found");
			}
			System.out.println("Quantity: " + stretch[i].getQuantity());
			System.out.println("Total Cost: $" + String.format("%.2f", stretch[i].totalCost(stretch[i].getQuantity())));
		}
	}
	
	public static void main(String[] args) {
		vendMySnacks();
	}
}