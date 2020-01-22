package mycompany.hibernatetodo;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
		private int id;

    @Column(name = "task_name")
	    private String taskName;
   
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="todo")
    private Todo todo;
   
	
	public Task( String taskName) {
		super();
	
		this.taskName = taskName;
	
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public Todo getTodo() {
		return todo;
	}
	public void setTodo(Todo todo) {
		this.todo = todo;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + ", todo=" + todo + "]";
	}
	
	
}
