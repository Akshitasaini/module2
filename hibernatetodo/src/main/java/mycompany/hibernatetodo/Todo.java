package mycompany.hibernatetodo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="todo")
public class Todo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;

@Column(name = "todoname")
private String todoname;

public Todo() {
	
}

public Todo( String todoname) {
	super();
	
	this.todoname = todoname;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTodoname() {
	return todoname;
}

public void setTodoname(String todoname) {
	this.todoname = todoname;
}


}


