package Encapsulation;

public class Main {

	// Main.java
	
	    public static void main(String[] args) {
	        Employee emp = new Employee();

	        // Setting values using setters
	        emp.setName("Alice");
	        emp.setAge(30);

	        // Getting values using getters
	        System.out.println("Employee Name: " + emp.getName());
	        System.out.println("Employee Age: " + emp.getAge());
	    }
	}

