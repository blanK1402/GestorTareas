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


	// Eliminar tarea por ID 
	public void deleteTask(int id) {
		for (int i =0; i < tasks.size(); i++) {
			Task task = tasks.get(i);
			if (task.getId() == id) {
				tasks.remove(task); 
				break; 
			}
		}
	}

	// Marcar tarea como completada
	public void markAsCompleted(int id) {
		for (Task task : tasks) {
			if (task.getId() == id) {
				task.setCompleted(true);
				break;
			}
		}
	}


	public ArrayList FiltrarPorPrioridad(String prioridad){
		ArrayList<Task> prioridadAlmacenada= new ArrayList<Task>();

		for(Task task: tasks){
			if(task.getPriority().equals(prioridad))
				prioridadAlmacenada.add(task);
		}
		return prioridadAlmacenada;
	}




}
