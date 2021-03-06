package br.com.payroll.exceptions;

public class EmployeeNotFoundException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(Long id) {
		super("Could not find Employee" + id);
	}
}
