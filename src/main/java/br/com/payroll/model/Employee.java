package br.com.payroll.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String role;

	Employee() {

	}

	public Employee(String firstName, String lastName, String role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	public void setName(String name) {
		name.split(" ");
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Employee))
			return false;
		Employee employee = (Employee) o;
		return Objects.equals(this.id, employee.id) && Objects.equals(this.firstName, employee.firstName) && Objects.equals(this.lastName, employee.lastName)
				&& Objects.equals(this.role, employee.role);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.firstName,this.lastName, this.role);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role + "]";
	}

}
