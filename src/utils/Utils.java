package utils;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.table.DefaultTableModel;

import model.Task;

public class Utils {

	private static void deleteRows(DefaultTableModel model){
		int i = model.getRowCount();
		
		while(--i != -1){
			model.removeRow(i);
		}
	}
	
	public static void removeCompleted(ArrayList<Task> tasks) {
	    Iterator<Task> iterator = tasks.iterator();
	    while (iterator.hasNext()) {
	        Task t = iterator.next();
	        if (t.isCompleted()) {
	            iterator.remove();
	        }
	    }
	}

	public static void update(DefaultTableModel model, ArrayList<Task> tasks) {
		deleteRows(model);
		
		for(Task t : tasks){
			model.addRow(t.toRow());
		}
	}

	public static void markAsCompleted(int id, ArrayList<Task> tasks) {
		
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted("Completada");
                break;
            }
        }
      
    }
	
}
