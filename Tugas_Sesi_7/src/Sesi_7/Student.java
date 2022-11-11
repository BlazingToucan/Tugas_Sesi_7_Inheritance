package Sesi_7;

public class Student extends Persona{
	
	protected final String status;
	

	public Student(String name, String address, String phone, String email, String status) {
		super(name, address, phone, email);
		this.status=status;
	}

}
