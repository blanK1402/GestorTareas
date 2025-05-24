package model;

import java.util.ArrayList;

public class TaskManager {
	private ArrayList<Task> tasks;
	
	public TaskManager(){
		tasks = new ArrayList<Task>();
	}
	
	public void addTask(Task t){
		tasks.add(t);
	}
	
	public ArrayList<Task> getTasks(){
		return tasks;
	}
}
