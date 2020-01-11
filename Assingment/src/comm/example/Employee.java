package comm.example;

import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Employee implements Comparable<Employee> {
private int empId;
private String empName;
private String empDept;
private Date DateOfJoining;
private int empAge;
private int empSalary;
static int count;
public Employee() {
	super();
}

public Employee(int empId, String empName, String empDept, Date dateOfJoining, int empAge, int empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empDept = empDept;
	DateOfJoining = dateOfJoining;
	this.empAge = empAge;
	this.empSalary = empSalary;
}


public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpDept() {
	return empDept;
}

public void setEmpDept(String empDept) {
	this.empDept = empDept;
}

public Date getDateOfJoining() {
	return DateOfJoining;
}

public void setDateOfJoining(Date dateOfJoining) {
	DateOfJoining = dateOfJoining;
}

public int getEmpAge() {
	return empAge;
}

public void setEmpAge(int empAge) {
	this.empAge = empAge;
}

public int getEmpSalary() {
	return empSalary;
}

public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}
@override
public int compare(Employee o1, Employee o2) {
	if(o1.getEmpSalary()>o2.getEmpSalary())
		{
		return 1;
		}
	else if(o1.getEmpSalary()< o2.getEmpSalary()) {
		
	return -1;
	}
}

@Override
public String toString() {
	return "%-15s %-30s %-30s %-20s %-10s %-10s\n","Employee ID","Name,"dept",new SimpleDateFormat("MM/dd/yyyy"),"Date Of Joining","Employee Age","Employee ID";	
}

}