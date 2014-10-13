package business.employee;

public class EmployeeLogic
{
	private EmployeeModel emplModel;

	public EmployeeLogic(EmployeeModel employeeModel)
	{
		this.emplModel = employeeModel;
	}

	public EmployeeModel getEmployeeModel()
	{
		return emplModel;
	}

	public void setEmployeeModel(EmployeeModel employeeModel)
	{
		this.emplModel = employeeModel;
	}

	public Integer calculateHourWage()
	{
		if (emplModel.getMonthSalary() != null && emplModel.getWorkHouers() != null)
		{
			return emplModel.getMonthSalary() / emplModel.getWorkHouers();
		}

		return null;
	}

	public Integer calculateAnnualSalary()
	{
		if (emplModel.getMonthSalary() != null && emplModel.getBonus() != null)
		{
			return (12 * emplModel.getMonthSalary()) + emplModel.getBonus();
		}

		return null;
	}

}
