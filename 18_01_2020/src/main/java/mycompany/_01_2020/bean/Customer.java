package mycompany._01_2020.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Component
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
		return "Customer [uId=" + uId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}

	
}
