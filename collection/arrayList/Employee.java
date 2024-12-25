package collection.arrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Employee {
	
	int empno;
	String ename;
	String job;
	int mgr;
	String hireDate;
	double sal;
	double comm;
	int deptno;
	
	public Employee() {
		
	}
	

	public Employee(int empno, String ename, String job, int mgr, String hireDate, double sal, double comm,
			int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	public Employee(int empno, String ename, String job, int mgr, String hireDate, double sal, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.deptno = deptno;
	}
	
	
	
	public Employee(int empno, String ename, String job, String hireDate, double sal, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hireDate = hireDate;
		this.sal = sal;
		this.deptno = deptno;
	}


	public String toString() {
		return "[Empno: "+empno+
				", Ename: "+ename+ 
				", Job: "+job+
				", MGR: "+mgr+
				", HireDate: "+hireDate+
				", Salary: "+sal+", Deptno: "+deptno+"]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(comm, deptno, empno, ename, hireDate, job, mgr, sal);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return comm == other.comm && deptno == other.deptno
				&& empno == other.empno && this.ename == other.ename
				&& this.hireDate == other.hireDate && this.job == other.job && mgr == other.mgr
				&& sal == other.sal;
	}
}
