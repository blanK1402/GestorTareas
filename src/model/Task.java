package model;

import java.time.format.DateTimeFormatter;
import java.util.Vector;

public class Task {
	private long id;
	private String description;
	private String priority;
	private String isCompleted;
	
	public Task(long id, String description, String priority, String isCompleted){
		setId(id);
		setDescription(description);
		setPriority(priority);
		setCompleted(isCompleted);
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public boolean isCompleted() {
		return isCompleted.equals("Completada") ? true : false;
	}
	
	public void setCompleted(String isCompleted) {
		this.isCompleted = isCompleted;
	}

	public String[] toRow() {
		String[] res = {
				String.valueOf(id),
				description,
				priority,
				isCompleted 
		};
		return res;
	}
}
