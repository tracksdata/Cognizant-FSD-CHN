package com;
public class HR {

	public static void main(String[] args) {
		
		Department dept=new Department();
		dept.setDeptId(10);
		dept.setDeptName("Accounts");
		
		
		Location loc=new Location();
		loc.setLocId(150);
		loc.setLocName("Pune");
		
		
		Employee emp=new Employee();
		emp.setEmpId(100);
		emp.setEmpName("Praveen");
		emp.setSalary(49374);
		
		Project proj=new Project();
		proj.setProjId(1);
		proj.setProjName("Nissan");
		proj.setLoc(loc);
	
		emp.setDept(dept);
		emp.setProj(proj);
	
		
		System.out.println("Emp Id: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Dept Id: "+emp.getDept().getDeptId());
		System.out.println("Dept Name: "+emp.getDept().getDeptName());
		System.out.println("Project Id: "+emp.getProj().getProjId());
		System.out.println("Project Name: "+emp.getProj().getProjName());
		System.out.println("Location Id: "+emp.getProj().getLoc().getLocId());
		System.out.println("Loc Name: "+emp.getProj().getLoc().getLocName());
		System.out.println("-------------------------------");
		
		
		
		
		
	}
}
