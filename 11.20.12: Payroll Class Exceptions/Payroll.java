public class Payroll
{
	private int employeeId, hours;
	private double payRate;
	private String name;
	
	public Payroll() {}
	
	public Payroll(String name, int employeeId, double payRate)
	{
		try
		{
			if(name == "")
			{
				throw new EmptyNameException();
			}
			
			setName(name);
			
			if(employeeId <= 0)
			{
				throw new InvalidEmployeeIdException();
			}
			
			setEmployeeId(employeeId);
			
			if(payRate < 0 || payRate > 25)
			{
				throw new InvalidPayRateException();
			}
			
			setPayRate(payRate);
		}
		catch(EmptyNameException e)
		{
			System.out.println("Error: the employee's name cannot be blank");
			System.exit(1);
		}
		catch(InvalidEmployeeIdException e)
		{
			System.out.println("Error: the employee's id must be above 0");
			System.exit(1);
		}
		catch(InvalidPayRateException e)
		{
			System.out.println("Error: the payrate must not be negative nor exceed 25");
			System.exit(1);
		}
		
		setEmployeeId(employeeId);
		setPayRate(payRate);
	}
	
	public double getGrossPay()
	{
		return payRate * hours;
	}

	public int getEmployeeId()
	{
		return employeeId;
	}

	public int getHours()
	{
		return hours;
	}

	public double getPayRate()
	{
		return payRate;
	}

	public String getName()
	{
		return name;
	}

	public void setEmployeeId(int employeeId)
	{
		try
		{
			if(employeeId <= 0)
			{
				throw new InvalidEmployeeIdException();
			}
			
			this.employeeId = employeeId;
		}
		catch(InvalidEmployeeIdException e)
		{
			System.out.println("Error: the employee's id must be above 0");
			System.exit(1);
		}
	}

	public void setHours(int hours)
	{
		try
		{
			if(hours < 0 || hours > 84)
			{
				throw new InvalidHoursException();
			}
			
			this.hours = hours;
		}
		catch(InvalidHoursException e)
		{
			System.out.println("Error: hours worked cannot be negative nor exceed 84");
			System.exit(1);
		}
	}

	public void setPayRate(double payRate)
	{
		try
		{
			if(payRate < 0 || payRate > 25)
			{
				throw new InvalidPayRateException();
			}
			
			this.payRate = payRate;
		}
		catch(InvalidPayRateException e)
		{
			System.err.println("Error: the payrate must not be negative nor exceed 25");
			System.exit(1);
		}
	}

	public void setName(String name)
	{
		try
		{
			if(name.isEmpty())
			{
				throw new EmptyNameException();
			}
			
			this.name = name;
		}
		catch(EmptyNameException e)
		{
			System.out.println("Error: the employee's name cannot be blank");
			System.exit(1);
		}
	}
}