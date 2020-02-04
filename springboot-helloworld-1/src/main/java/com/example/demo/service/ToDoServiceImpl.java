package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ToDoDao;
import com.example.demo.model.ToDo;

@Service
public class ToDoServiceImpl implements ToDoService{
private ToDoDao toDoDao;
@Autowired
public ToDoServiceImpl(ToDoDao toDoDAO) {
	super();
	this.toDoDao = toDoDAO;
}
@Override
public List<ToDo> getAllToDos() {
	// TODO Auto-generated method stub
	return toDoDao.getAllToDos();
}

}
