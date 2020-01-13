package comm.example;

import java.util.Comparator;

public class AgeComparator implements Comparator {
	
	
/*	public int compare(Employee o1, Employee o2) {
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
	}*/
	public int compare(Object o1,Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.getEmpAge()==e2.getEmpAge())
			return e1.getDateOfJoining().compareTo(e2.getDateOfJoining());
		else if(e1.getEmpAge()>e2.getEmpAge())
			return 1;
		else
			return -1;
		
		
	}
}
