package view;

import javax.swing.*;

import model.Task;
import model.TaskManager;

import java.awt.*;
import java.awt.event.*;

public class IntoTask extends JDialog {
	private boolean createdTask = false;
	private Task newTask;
    private JTextField txtDescription;
    private JComboBox<String> cmbPrioridad;
    private JButton btnGuardar;
    private JButton btnCancelar;

    public IntoTask(JFrame parent) {
        super(parent, "Nueva Tarea", true);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Descripci�n:"));
        txtDescription = new JTextField();
        add(txtDescription);

        add(new JLabel("Prioridad:"));
        cmbPrioridad = new JComboBox<String>(new String[]{"Alta", "Media", "Baja"});
        add(cmbPrioridad);

        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");
        add(btnGuardar);
        add(btnCancelar);

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	newTask = new Task(TaskManager.getIdTask(), txtDescription.getText(), (String) cmbPrioridad.getSelectedItem(), false);
            	createdTask = true;
            	windowClosing();
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                windowClosing();
            }
        });

        setSize(300, 150);
        setLocationRelativeTo(parent);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        IntoTask dialog = new IntoTask(frame);
        dialog.setVisible(true);
    }

    public void windowClosing() {
        dispose();
    }
    
    public boolean isConfirmed(){
    	return createdTask;
    }

	public Task getTask() {
		return newTask;
	}
}

