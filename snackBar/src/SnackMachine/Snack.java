package SnackMachine;

public class Snack {
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;
	
	// constructors
	public Snack(String name, int quantity, double cost, int vendingMachineId) {
		maxId++;
		id = maxId;
		
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}
	
	@Override
	public String toString() {
		return "Quantity of " + name + " is " + quantity;
	}
	
	// getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getCost() {
		return cost;
	}
	
	public int getVendingMachineId() {
		return vendingMachineId;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setVendingMachineId(int vendingMachineId) {
		this.vendingMachineId = vendingMachineId;
	}
	
	// other Methods
	public void addQuantity(int additive) {
		// add quantity when given how many to add
		quantity += additive;
	}
	
	public void buySnack(int purchase) {
		// buy snack when given how many to buy
		quantity -= purchase;
	}
	
	public double totalCost(int totalQty) {
		// get total cost given a quantity
		return totalQty * cost;
	}
}