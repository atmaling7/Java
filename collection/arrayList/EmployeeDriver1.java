package collection.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDriver1 {
		
		static Employee1 db1 = new Employee1();
		static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			
			 List or = new ArrayList<>();
		
			 or.add(new Employee1(7369,"SMITH","CLERK",7902,"17-DEC-80",800,20));
			 or.add(new Employee1(7499,"ALLEN","SALESMAN",7698,"20-FEB-81",1600,30));
			 or.add(new Employee1(7521,"WARD","SALESMAN",7698,"22-FEB-81",1250,30));
			 or.add(new Employee1(7566,"JONES","MANAGER",7839,"02-APR-81",2975,20));
			 or.add(new Employee1(7654,"MARTIN","SALESMAN",7698,"28-SEP-81",1250,30));
			 or.add(new Employee1(7698,"BLAKE","MANAGER",7839,"01-MAY-81",2850,30));
			 or.add(new Employee1(7782,"CLARK","MANAGER",7839,"09-JUN-81",2450,10));
			 or.add(new Employee1(7788,"SCOTT","ANALYST",7566,"19-APR-87",3000,20));
			 or.add(new Employee1(7839,"KING","PRESIDENT",0,"17-NOV-81",5000,10));
			 or.add(new Employee1(7844,"TURNER","SALESMAN",7698,"08-DEC-81",1500,30));
			 or.add(new Employee1(7876,"ADAMS","CLERK",7788,"23-MAY-87",1100,20));
			 or.add(new Employee1(7900,"JAMES","CLERK",7698,"03-DEC-81",950,30));
			 or.add(new Employee1(7902,"FORD","ANALYST",7566,"03-DEC-81",3000,20));
			 or.add(new Employee1(7934,"MILLER","CLERK",7782,"23-JAN-82",1300,10));
			 or.add(new Employee1(7654,"MARTIN","SALESMAN",7698,"28-SEP-81",1250,30));
			 or.add(new Employee1(7698,"BLAKE","MANAGER",7839,"01-MAY-81",2850,30));
			 or.add(new Employee1(7782,"CLARK","MANAGER",7839,"09-JUN-81",2450,10));
			 or.add(new Employee1(7788,"SCOTT","ANALYST",7566,"19-APR-87",3000,20));
			 or.add(new Employee1(7839,"KING","PRESIDENT",0,"17-NOV-81",5000,10));
			 or.add(new Employee1(7844,"TURNER","SALESMAN",7698,"08-DEC-81",1500,30));
			 
			 
//			 for (Object object : or) {
//				
//				 System.out.println(object);
//			}

			getMaxSal(or);
			getSecMin(or);

			 db1.getEmpByMGR(or);
		}

		public static void getMaxSal(List or)
		{
			double max = Integer.MIN_VALUE;
			double secMax = Integer.MIN_VALUE;
			for (Object ob : or) {
				Employee1 oc = (Employee1)ob;
				if(oc.sal>max)
				{
					secMax = max;
					max = oc.sal;
				}
				else if(oc.sal>max && oc.sal!=max)
				{
					secMax = oc.sal;
				}
			}
			System.out.println("Max "+max);
			System.out.println("Second Max"+secMax);
			
		}
		
		public static void getSecMin(List l)
		{
			double min = Integer.MAX_VALUE;
			double secMin = Integer.MAX_VALUE;
			for (Object ob : l) {
				Employee1 o = (Employee1)ob;
				
				if(o.sal<min)
				{
					secMin=min;
					min=o.sal;
				}
				else if(o.sal<secMin && o.sal!=min)
				{
					secMin=o.sal;
				}
			}
			System.out.println("Min "+min);
			System.out.println("Second Min "+secMin);
		}
		
		public void getEmpByMGR(List l)
		{
			System.out.println("Enter Manager Name : ");
			String mgr = sc.next();
			int mgrId=0;
			for (Object obj : l) {
				
				Employee1 o = (Employee1)obj;
				if(o.ename.equals(mgr))
				{
					mgrId=o.empNo;
				}
			}
			if (mgrId!=0) {
				
				for (Object obj : l) {
					
					Employee1 o =(Employee1)obj;
					if(o.mgr==mgrId)
					{
						System.out.println(o.ename);
					}
				}
			}
			else {
				System.out.println("Manager Not Found IN DB...!");
			}
		}

	
}
