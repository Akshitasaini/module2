package comm.example;

public class AgeComparator implements<Employee> {
	
	
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpAge()>o2.getEmpAge())
			{
			return 1;
			}
		else if(o1.getEmpAge()< o2.getEmpAge()) {
			
		return -1;
		}
		else if(o1.getEmpAge()==o2.getEmpAge())
		{
			public int compare(Employee o1,Employee o2) {
				if(o1.getDateOfJoining()>o2.getDateOfJoining()) {
					return 1;
				}
				else if (o1.getDateOfJoining()<o2.getDateOfJoining()) {
					return -1;
				}

			}
		}
	}
}
