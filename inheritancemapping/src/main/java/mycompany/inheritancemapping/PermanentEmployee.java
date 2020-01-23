package mycompany.inheritancemapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("permanent employee")
public class PermanentEmployee extends Employee {

	private int leaveBenefits;

	public PermanentEmployee() {

	}

	public PermanentEmployee(String firstName, String lastName, double salary,int leaveBenefits) {
		super(firstName, lastName, salary);
	this.leaveBenefits = leaveBenefits;
		
	}

	public int getLeaveBenefits() {
		return leaveBenefits;
	}

	public void setLeaveBenefits(int leaveBenefits) {
		this.leaveBenefits = leaveBenefits;
	}

	
}
