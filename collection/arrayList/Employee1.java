package collection.arrayList;

import java.util.List;

public class Employee1 {
	
		int empNo;
		String ename;
		String job;
		int mgr;
		String hiredate;
		double sal;
		int deptno;
		
		public Employee1() {}
		
		public Employee1(int empNo, String ename, String job, int mgr, String hiredate, double sal, int deptno) {
			super();
			this.empNo = empNo;
			this.ename = ename;
			this.job = job;
			this.mgr = mgr;
			this.hiredate = hiredate;
			this.sal = sal;
			this.deptno = deptno;
		}

		@Override
		public String toString() {
			return "Oracle [ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
					+ hiredate + ", sal=" + sal + ", deptno=" + deptno + "]";
		}

		public void getEmpByMGR(List or) {
			// TODO Auto-generated method stub
			
		}

		

		
	
}
