package mycompany.hibernateannotation;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Person {
@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String uId;
@Column(name = "name")
private String cname;
@Column(name="dob")
private LocalDate dateOfBirth;
public Person(String uId, String cname, LocalDate dateOfBirth) {
	super();
	this.uId = uId;
	this.cname = cname;
	this.dateOfBirth = dateOfBirth;
}

}
