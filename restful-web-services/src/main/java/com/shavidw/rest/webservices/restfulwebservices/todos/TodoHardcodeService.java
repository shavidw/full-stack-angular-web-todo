package com.shavidw.rest.webservices.restfulwebservices.todos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.IdClass;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodeService {
	
	private static List<Todo> todo = new ArrayList<Todo>();
	private static int todoId=0;
	
	
	static {
		todo.add(new Todo(++todoId,"user1","doing fyp",new Date(),true));
		todo.add(new Todo(++todoId,"user2","doing dancing",new Date(),true));
		todo.add(new Todo(++todoId,"user3","doing matlab",new Date(),true));
	}
	
	public List<Todo> getAllTodos(){
		return todo;
	}
	
	public Todo deleteById(long id) {
		Todo todoById = findById(id);
		if(todoById!=null) {
			todo.remove(todoById);
			return todoById;}
		return null;
	}
	
	public Todo save(Todo todoData) {
		if(todoData.getId()==-1 || todoData.getId()==0) {
			todoData.setId(++todoId);
			todo.add(todoData);
		}else {
			deleteById(todoData.getId());
			todo.add(todoData);
		}
		return todoData;
	}

	public Todo findById(long id) {
		for(Todo todos:todo) {
			if(todos.getId()==id) {
				return todos;
			}
			
		}
		return null;
	}

}
