package file;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObjectInOut {


		
		public static void main(String[] args) {
			BufferedReader reader;
			
			Employee myEmployee = null;
			List<Employee> list = new ArrayList<Employee>();
			try {
				reader = new BufferedReader(new FileReader("employee.in"));

				String line = reader.readLine();
				while (line != null) {
					String str[] = line.split(",");
					myEmployee = new Employee(str[0], str[1], LocalDate.now());
					System.out.println("employee to write is: " + myEmployee);
					list.add(myEmployee);
					line = reader.readLine();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				FileOutputStream out = new FileOutputStream("employee.out");
				ObjectOutputStream oos = new ObjectOutputStream(out);
				oos.writeObject(list);
				oos.flush();
			} catch (Exception e) {
				System.out.println("Problem serializing: " + e);
			}

			try {
				FileInputStream in = new FileInputStream("employee.out");
				ObjectInputStream ois = new ObjectInputStream(in);
				list = (List<Employee>) (ois.readObject());
			} catch (Exception e) {
				System.out.println("Problem serializing: " + e);
			}
			System.out.println("displaying all employee\n===================\n");
			for(Employee e:list)
			{
				System.out.println( e+"\n");
			}
				

		}
	}



