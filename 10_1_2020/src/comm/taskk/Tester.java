package comm.taskk;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {
public static void main (String[] args) {
	/*Set<Student> set = new TreeSet<Student>();
	set.add(new Student(101,"john","mangla",8.0));
	set.add(new Student(102,"cherry","singla",7.30));
	set.add(new Student(103,"dharam","singh",7.88));
	set.add(new Student(104,"king","kumar",8.6));
 Iterator iterator = set.iterator();
 while (iterator.hasNext())
	 System.out.println(iterator.next() + "\n");
*/
	

Set <Student> set = new HashSet<Student>();
set.add(new Student ("johnethan","mathew",100,0.5));
set.add(new Student ("shane","watson",105,0.7));
for (Student s:set)
{
System.out.println(s + "\n");	
}
}
}