package SnackMachine;

public class VendingMachine {
	private static int maxId = 0;
	private int id;
	private String name;
	
	// constructors
	public VendingMachine() {
		maxId++;
		id = maxId;
	}
	
	// getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	// other Methods
}