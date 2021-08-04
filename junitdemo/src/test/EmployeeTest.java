package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import business.Employee;

public class EmployeeTest {
	Employee e;

	@Before
	public void setUp() throws Exception {
		e=new Employee(1,"Raj",15000);
	}

	@After
	public void tearDown() throws Exception {
		e=null;
	}

	@Test
	public void testGetEmpNameWithHighestSalary() {
		String name="Raj";
		assertEquals(name, e.getEmpNameWithHighestSalary());
	}

	@Test
	public void testGetHighestPaidEmployee() {
		Employee expectedEmp=new Employee(1,"Raj",15000);
		assertEquals(expectedEmp, e.getHighestPaidEmployee());
	}

}