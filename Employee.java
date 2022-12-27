package com.exercise.pll;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private Double salary;
	
	public Employee() {
		super();
		}

		public Employee(int id,String firstName, String lastName, Double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		}
	
		public int getId() {
			return id;
			}

		public void setId(int id) {
			this.id = id;
			}

		public String getfirstName() {
			return firstName;
			}

		public void setfirstName(String firstName) {
			this.firstName = firstName;
			}

		public String getlastName() {
			return lastName;
			}

		public void setlastName(String lastName) {
			this.lastName = lastName;
			}

		public Double getsalary() {
			return salary;
			}

		public void setsalary(Double salary) {
			this.salary = salary;
			}
		public Double getYearlysalary() {
			double yearlySalary = salary*12;
			return yearlySalary;
			}
		public Double getRaisesalary() {
			double raise = salary*0.1;
			double raiseSalary =( salary + raise)*12;
			return raiseSalary;
			}
		
		@Override
		public String toString() {
			
            
			return "ID: " + id + "\nfirstName: " + firstName + "\nlastName: " + lastName
			+ "\nsalary: " + salary;
			}
	

}
