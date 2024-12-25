package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Arrays.Non_primitive.Employee;

public class EmployeeDriver {
	
public static void main(String[] args) {
		
		List emp = new ArrayList();
		
		emp.add(new Employee(7369,"Smith",	"Clerk",	 7902,"17-DEC-80",  800.00, 20)); 
		emp.add(new Employee(7499, "Allen",	"Salesman",	 7698, "20-FEB-81", 1600.00, 300.0, 30));
		emp.add(new Employee(7521, "Ward", 	"Salesman",	 7698, "22-FEB-81", 1250.00, 500.00, 30));
		emp.add(new Employee(7566, "Jones", 	"Manager",	 7839, "02-APR-81", 2975.00, 20));
		emp.add(new Employee(7654, "Martin",  "Salesman",	 7698, "28-SEP-81", 1250.00, 1400.00,30));
		emp.add(new Employee(7698, "Blake", 	"Manager",	 7839, "01-MAY-81", 2850.00, 30));
		emp.add(new Employee(7782, "Clark", 	"Manager",	 7839, "09-JUN-81", 2450.00, 10));
		emp.add(new Employee(7788, "Scott", 	"Analyst",	 7566, "19-APR-87", 3000.00, 20));
		emp.add(new Employee(7839, "King", 	"President",	   "17-NOV-81", 5000.00, 10));
		emp.add(new Employee(7844, "Turner", 	"Salesman",	 7698, "08-SEP-81", 1500.00, 30));
		emp.add(new Employee(7876, "Adams", 	"Clerk",	 7788, "23-MAY-87", 1100.00, 20));
		emp.add(new Employee(7900, "James", 	"Clerk",	 7698, "03-DEC-81", 950.00, 30));
		emp.add(new Employee(7902, "Ford", 	"Analyst",	 7566, "03-DEC-81", 3000.00, 20));
		emp.add(new Employee(7934, "Miller", 	"Clerk", 	 7782, "23-JAN-82", 1300.00, 10));
				
		
		
//		System.out.println(maxSal(emp));
//		System.out.println(minSal(emp));
//		System.out.println(secMaxSal(emp));
//		System.out.println(secMinSal(emp));
//		findEmp(emp,7698);
		findEmp(emp,"Blake");
	}
	

	//For finding max Sal
	public static double maxSal(List emp)
	{
		double max = Integer.MIN_VALUE;
		
		for (Object o : emp) {
			
			Employee e = (Employee) o;
			
			if(e.sal > max)
			{
				max = e.sal;
			}
			
		}return max;
	}
	
	//for finding secMax sal
	public static double secMaxSal(List emp)
	{
		double max = Integer.MIN_VALUE;
		double secMax = Integer.MIN_VALUE;
		
		for (Object o : emp) {
			
			Employee e = (Employee) o;
			
			double sal = e.sal;
			
			if(sal > max)
			{
				secMax = max;
				max = sal;
			}
			else if(sal > secMax && sal < max)
			{
				secMax = sal;
			}
			
		}return secMax;
	}
	
	//for finding minimum sal
	public static double minSal(List emp)
	{
		double min = Integer.MAX_VALUE;
		
		for (Object val : emp) {
			
			Employee e = (Employee)val;
			
			double sal = e.sal;
			
			if (sal < min) {
				
				min = sal;
			}
		}return min;
	}

	
	//for finding secMin sal
	public static double secMinSal(List emp)
	{
		double minSal = Integer.MAX_VALUE;
		
		double secMin = Integer.MAX_VALUE;
		
		for (Object o : emp) {
			
			Employee e = (Employee)o;
			
			double sal = e.sal;
			
			if (sal < minSal) {
				
				secMin = minSal;
				
				minSal = sal;
			}
			else if(sal > minSal && sal < secMin)
			{
				secMin = sal;
			}
			
		}return secMin;
	}
	
	//for finding employee of manager
	
	public static void findEmp(List emp,int mgrID)
	{
		for (Object o : emp) {
			
			Employee e = (Employee)o;
			
				int mgr = e.mgr;
				
				
				if (mgrID == mgr) {
					
					System.out.println(e.ename);
				}
				
		}
	}
	public static void findEmp(List emp,String mgrName)
	{
		for (Object o : emp) {
			
			Employee e = (Employee)o;
			
			String mgr_name = e.ename;
			
			int empId = e.empno;
			
			int mgrId = 0;
			
			if (mgr_name.equals(mgrName) ) {
				
				mgrId = empId;
//				System.out.println(empId);
				
			}
			
			if(mgrId == e.empno)
				
			{	System.out.println(e.ename);}
			
		}
	}
	
	
}
