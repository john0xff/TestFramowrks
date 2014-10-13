package business.employee;

public class EmployeeModel
{
	private String name;
	private Integer monthSalary;
	private Integer annualSalary;
	private Integer workHouers;
	private Integer bonus;

	public EmployeeModel()
	{
		// TODO Auto-generated constructor stub
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getMonthSalary()
	{
		return monthSalary;
	}

	public void setMonthSalary(Integer monthSalary)
	{
		this.monthSalary = monthSalary;
	}

	public Integer getAnnualSalary()
	{
		return annualSalary;
	}

	public void setAnnualSalary(Integer annualSalary)
	{
		this.annualSalary = annualSalary;
	}

	public Integer getWorkHouers()
	{
		return workHouers;
	}

	public void setWorkHouers(Integer workHouers)
	{
		this.workHouers = workHouers;
	}

	public Integer getBonus()
	{
		return bonus;
	}

	public void setBonus(Integer bonus)
	{
		this.bonus = bonus;
	}

}
