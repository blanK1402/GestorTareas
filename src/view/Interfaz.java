package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtHolaMundo;
	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHolaMundo = new JTextField();
		txtHolaMundo.setText("Hola mundo!");
		txtHolaMundo.setBounds(154, 106, 86, 20);
		contentPane.add(txtHolaMundo);
		txtHolaMundo.setColumns(10);
	}
}
