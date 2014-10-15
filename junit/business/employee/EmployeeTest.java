package business.employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest
{
	EmployeeModel employeeModel;
	EmployeeLogic employeeLogic;

	@Before
	public void initEmployee()
	{
		employeeModel = new EmployeeModel();
		employeeModel.setName("Richard");
		employeeModel.setWorkHouers(160);
		employeeModel.setMonthSalary(4800);
		employeeModel.setBonus(1000);

		employeeLogic = new EmployeeLogic(employeeModel);
	}

	@Test
	public void hourWage()
	{
		Integer houerWage = employeeLogic.calculateHourWage();

		assertEquals(new Integer(30), houerWage);
	}
	
	@Test
	public void annualSalary()
	{
		Integer annual = (12 * 4800) + 1000;
		
		assertEquals(annual, employeeLogic.calculateAnnualSalary());
	}
}
