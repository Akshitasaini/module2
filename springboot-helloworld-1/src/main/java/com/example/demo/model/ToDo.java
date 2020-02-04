package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ToDo {
private String toDoId;
private String toDoName;
public String getToDoId() {
	return toDoId;
}
public void setToDoId(String toDoId) {
	this.toDoId = toDoId;
}
public String getToDoName() {
	return toDoName;
}
public void setToDoName(String toDoName) {
	this.toDoName = toDoName;
}

}
