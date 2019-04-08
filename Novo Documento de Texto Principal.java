package CalculadoraEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class PrincipalCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfresultado;

	Calculadora ca = new Calculadora();
	double num1;
	double num2;
private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalCalculadora frame = new PrincipalCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 309, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel.setBounds(91, 11, 96, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("N\u00FAmero 1:");
		lblNmero.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNmero.setBounds(22, 79, 96, 22);
		contentPane.add(lblNmero);
		
		JLabel lblNmero_1 = new JLabel("N\u00FAmero 2:");
		lblNmero_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNmero_1.setBounds(22, 132, 96, 22);
		contentPane.add(lblNmero_1);

