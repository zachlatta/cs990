import java.util.Scanner;


public class PayrollClassExceptionsDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Payroll employee = new Payroll();
		String name;
		int employeeId;
		double payRate;
		
		System.out.print("Please enter the employee's name: ");
		employee.setName(keyboard.nextLine());
		
		System.out.print("Please enter the employee's id: ");
		employee.setEmployeeId(keyboard.nextInt());
		
		System.out.print("Please enter the employee's hourly payrate: $");
		employee.setPayRate(keyboard.nextDouble());
		
		System.out.print("Please enter the employee's hours worked: ");
		employee.setHours(keyboard.nextInt());
		
		
		System.out.println("\n" + employee.getName());
		System.out.println("-----------");
		System.out.println("ID: " + employee.getEmployeeId());
		System.out.println("Pay rate: $" + employee.getPayRate());
		System.out.println("Hours worked: $" + employee.getHours());
		System.out.println("Gross pay: $" + employee.getGrossPay());
	}
}
