package mycompany.inheritancemapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contract employee")
public class ContractEmployee extends Employee {
	private double hourlyPay;
	private double contractTime;

	public ContractEmployee() {

	}

	public ContractEmployee(String firstName, String lastName,double salary, double hourlyPay, double contractTime) {
		super(firstName, lastName,salary);
		this.hourlyPay = hourlyPay;
		this.contractTime = contractTime;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public double getContractTime() {
		return contractTime;
	}

	public void setContractTime(double contractTime) {
		this.contractTime = contractTime;
	}

}
