package comm.example.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String fristName;
	@Column(name = "last_name")
	private String LastName;
	private String email;
	public Customer(String fristName, String lastName, String email) {
		super();
		this.fristName = fristName;
		LastName = lastName;
		this.email = email;
	}
	
}
