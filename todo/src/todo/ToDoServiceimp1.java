package todo;

import java.util.List;

public class ToDoServiceimp1 implements ToDoService {
	private ToDoDao dao=null;
	{
		dao=new ToDoDaoImpl();
	}

	@Override
	public ToDo createToDo(String toDoName) {
		// TODO Auto-generated method stub
		return dao.createToDo(toDoName);
	}

	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return dao.getAllToDos();
	}

	@Override
	public ToDo findById(String toDoName) {
		// TODO Auto-generated method stub
		return dao.findById(toDoName);
	}

	@Override
	public void deleteToDo(String toDoName) {
		// TODO Auto-generated method stub
		dao.deleteToDo(toDoName);

	}

	@Override
	public void removeAllToDo() {
		// TODO Auto-generated method stub
		dao.removeAllToDo();

	}

}

