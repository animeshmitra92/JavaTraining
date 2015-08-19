package day2;


public class Department extends Employee {
	int deptID;
	Department(int empID,float empSalary, String empName, int deptID)
	{
		super(empID, empSalary, empName);
		this.deptID=deptID;
		System.out.println(empID+" "+empSalary+" "+empName+" "+deptID);
	}
	
	public static void main(String args[])
	{
		new Department(12,34975,"Animesh",345);
	}

}
