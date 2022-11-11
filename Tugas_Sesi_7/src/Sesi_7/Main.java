package Sesi_7;

import java.time.LocalDate;
import java.time.Month;
import java.util.Vector;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Vector<Persona> data = new Vector<>();
		Student tempStudent= new Student("Student1", "Bogor Street", "081389437853", "Student1@gmail.com","Freshman");
		Employee tempEmployee= new Employee("Employee1", "Jakarta Street", "081289937787", "Employee1@gmail.com","Room 724", 15000000, LocalDate.of(2017 , Month.JANUARY , 25 ));
		Persona tempPersona = new Persona("Persona1", "Kemanggisan Street", "081589337751", "Persona1@gmail.com");
		Staff tempStaff = new Staff("Staff1", "Kijang Street", "081900657787", "Staff1@gmail.com","Room 722", 10000000, LocalDate.of(2021 , Month.SEPTEMBER , 1 ));
		Lecturer tempLecturer = new Lecturer("Lecturer1", "Malang Street", "081599151627", "Lecturer1@gmail.com","Room 631", 10000000, LocalDate.of(2021 , Month.SEPTEMBER , 1 ),"07.00-15.00","Senior Lecturer");
	
		data.add(tempStudent);
		data.add(tempEmployee);
		data.add(tempPersona);
		data.add(tempStaff);
		data.add(tempLecturer);
		
		
		for (Persona persona : data) {
			
			if(persona instanceof Staff) {
				System.out.println(((Staff)persona).toString());
			}
			else if (persona instanceof Employee) {
				System.out.print("Name: "+persona.name + "| Recruited at: ");
				System.out.println(((Employee) persona).getRecruitedDate());				
			}
			else {
				System.out.println("Name: "+persona.getName());
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
