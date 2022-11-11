package Sesi_7;

import java.time.LocalDate;

public class Lecturer extends Employee{
	protected String officeHours;
	protected String position;
	
	

	public Lecturer(String name, String address, String phone, String email, String office, int salary,
			LocalDate recruitedDate, String officeHours, String position) {
		super(name, address, phone, email, office, salary, recruitedDate);
		this.officeHours = officeHours;
		this.position = position;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
	

}
