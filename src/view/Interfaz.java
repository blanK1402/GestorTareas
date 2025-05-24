package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import model.TaskManager;
import utils.Utils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private TaskManager taskManager;
	/**
	 * Create the frame.
	 */
	public Interfaz() {
		taskManager = new TaskManager();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddFilter = new JButton("Add Filter");
		btnAddFilter.setBounds(126, 11, 105, 23);
		contentPane.add(btnAddFilter);
		
		JButton btnImportTask = new JButton("Import Tasks");
		btnImportTask.setBounds(241, 11, 105, 23);
		contentPane.add(btnImportTask);
		
		JButton btnSaveTasks = new JButton("Save Tasks");
		btnSaveTasks.setBounds(356, 11, 105, 23);
		contentPane.add(btnSaveTasks);
		
		JPanel panelTasks = new JPanel();
		panelTasks.setBounds(10, 77, 451, 173);
		contentPane.add(panelTasks);

		String[] columns = {
		    "ID",
		    "Prioridad",
		    "Descripcion",
		    "Estado"
		};

		final DefaultTableModel model = new DefaultTableModel(columns, 0);
		table = new JTable(model);
		table.setRowHeight(30);
		table.setFont(new Font("SansSerif", Font.PLAIN, 14));
		table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 16));
		table.getTableHeader().setBackground(new Color(50, 50, 50));
		table.getTableHeader().setForeground(Color.WHITE);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 451, 205); 
		panelTasks.add(scrollPane);
		
		JButton btnNewTask = new JButton("New Task");
		btnNewTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IntoTask newTask = new IntoTask(Interfaz.this);
				newTask.setVisible(true);
				
				if(newTask.isConfirmed()){
					taskManager.addTask(newTask.getTask());
					model.addRow(newTask.getTask().toRow());
				}
			}
		});
		btnNewTask.setBounds(10, 11, 105, 23);
		contentPane.add(btnNewTask);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("asdasd");
				Utils.removeCompleted(taskManager.getTasks());
				Utils.update(model, taskManager.getTasks());
			}
		});
		btnUpdate.setBounds(10, 45, 105, 23);
		contentPane.add(btnUpdate);
		
		JButton btnClearTasks = new JButton("Mark as Completed");
		btnClearTasks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row = table.getSelectedRow();
				Utils.markAsCompleted(Integer.valueOf((String) model.getValueAt(row, 0)), taskManager.getTasks());
				Utils.update(model, taskManager.getTasks());
			}
		});
		btnClearTasks.setBounds(241, 45, 105, 23);
		contentPane.add(btnClearTasks);
		
		JButton btnNewButton = new JButton("Delete Task");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(126, 45, 105, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEditTask = new JButton("Edit Task");
		btnEditTask.setBounds(356, 45, 105, 23);
		contentPane.add(btnEditTask);
	}
}
