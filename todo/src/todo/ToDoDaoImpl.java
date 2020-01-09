package todo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ToDoDaoImpl implements ToDoDao {
	private List<ToDo> toDoList=null;
	private ToDo toDo;
	{
		toDoList=new ArrayList<ToDo>();
	}

	@Override
	public ToDo createToDo(String toDoName) {
		toDo=new ToDo(UUID.randomUUID().toString(), toDoName);
		
		toDoList.add(toDo);
		return toDo;
		
	}

	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return toDoList;
	}

	@Override
	public ToDo findById(String toDoName) {
		// TODO Auto-generated method stub
		
		Iterator<ToDo> iterator=toDoList.iterator();
		
		while(iterator.hasNext())
		{
			toDo=iterator.next();
			if(toDo.getToDoName()==toDoName)
			{
				
				System.out.println(toDo.getToDoName());
				break;
			}
		}
		return toDo;
		
	}

	@Override
	public void deleteToDo(String toDoName) {
		if(toDoName.isEmpty())
		{
			System.out.println("This list is empty.");
		}
		toDo=findById(toDoName);
if(toDo == null)
{
	System.out.println("no such todo to delete");
}
else
            {
	toDoList.remove(toDo);
	System.out.println("removed successfully with NAME:" +toDoName);
            }
	}

	@Override
	public void removeAllToDo() {
		// TODO Auto-generated method stub
		toDoList.removeAll(toDoList);

	}

}