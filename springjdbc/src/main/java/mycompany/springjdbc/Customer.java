package mycompany.springjdbc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.jdbc.core.JdbcTemplate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Customer {
private String uId;
private String firstName;
private String lastName;
private String email;
public Customer( String firstName, String lastName, String email) {
	super();
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
}
@Override
public String toString() {
	return "Customer [uid=" + uId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
}

}
