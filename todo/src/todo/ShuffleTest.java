package todo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;



public class ShuffleTest {
public static void main (String[] args) {
	String name[] = {
		new String("sang"),
		new String("shin"),	
		new String("boston"),	
		new String("passion"),
		new String("shin"),

	};
	/*List <String> l = Arrays.asList(name);
	System.out.println("before shuffling");
	System.out.println(1);
	System.out.println("after shuffling");
    Collection.shuffle(l);
    System.out.println(l);
    Collection.sort(l);
    System.out.println(l);*/
	List <Integer> l = new ArrayList<Integer>();
	l.add(1);
	l.add(100);
	l.add(-30);
	System.out.println(l);
	int index=Collections.binarySearch(l, -1);
if(index>=0)
{
System.out.println("found"+l.get(index));	
}
else
{
System.out.println("not found" +index);	
}
}
}

