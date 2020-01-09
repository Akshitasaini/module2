package todo;

import java.util.List;

public interface ToDoDao {
	public ToDo createToDo(String toDoName);
	public List<ToDo> getAllToDos();
	public ToDo findById(String toDoName);
    public void deleteToDo(String toDoName);
    public void removeAllToDo();

}
