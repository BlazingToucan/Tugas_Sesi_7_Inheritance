package Sesi_7;

import java.time.LocalDate;

public class Staff extends Employee{


	
	public Staff(String name, String address, String phone, String email, String office, int salary,
			LocalDate recruitedDate) {
		super(name, address, phone, email, office, salary, recruitedDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Name: " + name +"| class: "+ this.getClass();
	}

	
	
}
