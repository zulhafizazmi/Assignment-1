package Assignment1;

import java.util.Scanner;

public class GroceryBackground {
	
	protected String name;
	protected String location;
	protected String contact;
	
	GroceryBackground() {
		this.name = "Watsun";
		this.location = "Tumpat";
		this.contact = "097193642";

		print();
	}
	
	public void print() {
		System.out.println("Name     : " + this.name);
		System.out.println("Location : " + this.location);
		System.out.println("Contact: " + this.contact);

	}

}

