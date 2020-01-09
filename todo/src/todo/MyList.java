package todo;

import java.util.Collections;
import java.util.LinkedList;

public class MyList {
private LinkedList<String> list=new LinkedList<String>();

public void getSortedList()
          {
	list.add("sang");
	list.add("sing");
	list.add("sung");
	list.add("sangu");
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	
          }
public static void main (String[] args) {
	MyList myList = new MyList();
	myList.getSortedList();
	
}
}
