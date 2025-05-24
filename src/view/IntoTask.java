package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntoTask extends JDialog {
	private JTextField txtDescripcion;
	private JTextField txtPrioridad;
	private JButton btnGuardar;
	private JButton btnCancelar;

	public IntoTask(JFrame parent) {
		super(parent, "Nueva Tarea", true);
		setLayout(new GridLayout(3, 2, 10, 10));

		add(new JLabel("Descripción:"));
		txtDescripcion = new JTextField();
		add(txtDescripcion);

		add(new JLabel("Prioridad:"));
		txtPrioridad = new JTextField();
		add(txtPrioridad);

		btnGuardar = new JButton("Guardar");
		btnCancelar = new JButton("Cancelar");
		add(btnGuardar);
		add(btnCancelar);

		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
}
