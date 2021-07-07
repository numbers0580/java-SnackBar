package SnackMachine;

public class Customer {
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;
	
	// constructors
	public Customer(String name, double cashOnHand) {
		maxId++;
		id = maxId;
		
		this.name = name;
		this.cashOnHand = cashOnHand;
	}
	
	@Override
	public String toString() {
		return name + "'s cash on hand is $" + String.format("%.2f", cashOnHand);
	}
	
	// getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCashOnHand() {
		return cashOnHand;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	// other Methods
	public void addCashOnHand(double loaded) {
		// add cash to cash on hand
		cashOnHand += loaded;
	}
	
	public void buySnacks(double totalCost) {
		// Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
		cashOnHand -= totalCost;
	}
}