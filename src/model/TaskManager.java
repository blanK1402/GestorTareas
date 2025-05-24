package model;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class TaskManager {
	private ArrayList<Task> tasks;
	private static AtomicLong idTask = new AtomicLong(1);
	
	public TaskManager(){
		tasks = new ArrayList<Task>();
	}
	
	public void addTask(Task t){
		tasks.add(t);
	}
	
	public ArrayList<Task> getTasks(){
		return tasks;
	}

	public static long getIdTask() {
		return idTask.getAndIncrement();
	}
}
