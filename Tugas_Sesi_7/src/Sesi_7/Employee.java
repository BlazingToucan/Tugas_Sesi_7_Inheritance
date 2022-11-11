package Sesi_7;

import java.time.LocalDate;

public class Employee extends Persona{
	protected String office;
	protected int salary;
	protected LocalDate recruitedDate;
	
	public Employee(String name, String address, String phone, String email, String office, int salary,
			LocalDate recruitedDate) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.recruitedDate = recruitedDate;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getRecruitedDate() {
		return recruitedDate;
	}

	public void setRecruitedDate(LocalDate recruitedDate) {
		this.recruitedDate = recruitedDate;
	}
	
	
}
