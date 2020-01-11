package comm.example;

import java.util.List;

public class EmployeeBO {
public static void printEmployees(List<Employee>employeeList)
{
System.out.format("%-15s %-30s %-30s %-20s %-10s %-10s\n","Employee ID","Name,"Department",new SimpleDateFormat("MM/dd/yyyy"),"Date Of Joining","Employee Age","Employee ID");	
}
}
