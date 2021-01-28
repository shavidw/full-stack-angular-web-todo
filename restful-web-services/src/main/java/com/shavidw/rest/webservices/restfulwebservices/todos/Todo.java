package com.shavidw.rest.webservices.restfulwebservices.todos;

import java.util.Date;

public class Todo {
	
	private long id;
	private String username;
	private String description;
	private Date targetedDate;
	private boolean isDone;
	
	
	public Todo(long id, String username, String description, Date targetedDate, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetedDate = targetedDate;
		this.isDone = isDone;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTargetedDate() {
		return targetedDate;
	}
	public void setTargetedDate(Date targetedDate) {
		this.targetedDate = targetedDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
