package file;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Employee implements Serializable{
private String employeeName;
private String employeeId;
private LocalDate Date;
public Employee(String employeeName, String employeeId, LocalDate date) {
	super();
	this.employeeId =UUID.randomUUID().toString();

	this.employeeName = employeeName;
	this.employeeId = employeeId;
	Date = date;
}

}
