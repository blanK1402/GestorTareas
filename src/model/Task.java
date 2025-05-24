package model;

public class Task {
	private int id;
	private String description;
	private String priority;
	private boolean isCompleted;
	
	public Task(int id, String description, String priority, boolean isCompleted){
		setId(id);
		setDescription(description);
		setPriority(priority);
		setCompleted(isCompleted);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
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
		return isCompleted;
	}
	
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
}
