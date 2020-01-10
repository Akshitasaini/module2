package comm.taskk;

 
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
	 int rollNo = 0;
	 String lastName;
	 String firstName;
	 double cgpa=0.0;
	/*@Override
	public int compareTo(Student student) {
	 int result = 0;
	 if(this.getCgpa()>student.getCgpa())
	 {
		 result = -1;
	 }
	 if (this.getCgpa()<student.getCgpa())
	 {
		 result=1;
	 }
	 if(this.getCgpa()==student.getCgpa())
	{	 return 0;
	}
	 return result;
	}
	public void checkName(String str) throws InvalidNameException {
		
		
	}*/
	public Student(String firstName, String lastName, int rollNo, double cgpa) {
		if (firstName == null || lastName == null || rollNo == 0 || cgpa == 0.0)
			throw new NullPointerException();
		this.rollNo = rollNo;
		this.lastName = lastName;
		this.firstName = firstName;
		this.cgpa = cgpa;
	}
	public String firstName()
	{
		return firstName;
	}
	public String lastName() {
		return lastName;
	}
public int rollNo() {
	return rollNo;
}	
public double cgpa()
{
	return cgpa;
	}

}
	
	
	


