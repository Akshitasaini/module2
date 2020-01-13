package comm.example.jdbc;

import java.io.Serializable;

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
@ToString
@EqualsAndHashCode

public class Employee implements Serializable {

	private static final long serialVersionUID = 3279078357830607481L;

	private int employeeId;
	private String lastName;
	private String fristName;
	private double salary;
}
