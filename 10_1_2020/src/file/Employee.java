package file;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Employee implements Serializable{
private String employeeName;
private String employeeId;
private LocalDate Date;
public Employee(String employeeName, LocalDate date) {
	super();
	this.employeeId =UUID.randomUUID().toString();

	this.employeeName = employeeName;
	this.employeeId = employeeId;
	Date = date;
}

}
