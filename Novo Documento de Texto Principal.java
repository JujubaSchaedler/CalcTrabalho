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


		tfNum1 = new JTextField();
		tfNum1.setBounds(107, 81, 103, 24);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		tfNum2 = new JTextField();
		tfNum2.setBounds(107, 134, 103, 24);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				ca.setNum1(num1);
				ca.setNum2(num2);
				
			tfresultado.setText(""+ca.soma());
			}
		});
		button.setBounds(22, 198, 45, 22);
		contentPane.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				ca.setNum1(num1);
				ca.setNum2(num2);
				
			tfresultado.setText(""+ca.subtracao());
			}
		});
		button_1.setBounds(77, 198, 45, 22);
		contentPane.add(button_1);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				ca.setNum1(num1);
				ca.setNum2(num2);
				
			    tfresultado.setText(""+ca.multiplicacao());
			}
		});
		btnX.setBounds(132, 198, 45, 22);
		contentPane.add(btnX);
		
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				ca.setNum1(num1);
				ca.setNum2(num2);
				
			    tfresultado.setText(""+ca.divisao());
			}
		});
		button_3.setBounds(187, 198, 45, 22);
		contentPane.add(button_3);
		
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblResultado.setBounds(22, 441, 96, 22);
		contentPane.add(lblResultado);
		
		tfresultado = new JTextField();
		tfresultado.setEditable(false);
		tfresultado.setColumns(10);
		tfresultado.setBounds(107, 441, 103, 24);
		contentPane.add(tfresultado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent arg0) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				ca.setNum1(num1);
				ca.setNum2(num2);
				
				if(comboBox.getSelectedIndex()==0) {
					tfresultado.setText(""+ca.soma());
					
				}else if(comboBox.getSelectedIndex()==1) {
					tfresultado.setText(""+ca.subtracao());
					
				}else if(comboBox.getSelectedIndex()==2) {
					tfresultado.setText(""+ca.multiplicacao());
					
				}else if(comboBox.getSelectedIndex()==3) {
					tfresultado.setText(""+ca.divisao());
				}
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent arg0) {
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Soma", "Subtra\u00E7\u00E3o", "Multiplica\u00E7\u00E3o", "Divis\u00E3o"}));
	comboBox.setBounds(22, 241, 103, 20);
		contentPane.add(comboBox);
		
		JRadioButton rbSoma = new JRadioButton("Soma");
		rbSoma.setSelected(true);
		buttonGroup.add(rbSoma);
		rbSoma.setBounds(22, 272, 109, 23);
		contentPane.add(rbSoma);
		
		JRadioButton rbSub = new JRadioButton("Subtra\u00E7\u00E3o");
		buttonGroup.add(rbSub);
		rbSub.setBounds(22, 298, 109, 23);
		contentPane.add(rbSub);
		
		JRadioButton rbmult = new JRadioButton("Multiplica\u00E7\u00E3o");
		buttonGroup.add(rbmult);
		rbmult.setBounds(22, 325, 109, 23);
		contentPane.add(rbmult);
		
		JRadioButton rbDiv = new JRadioButton("Divis\u00E3o");
		buttonGroup.add(rbDiv);
		rbDiv.setBounds(22, 351, 109, 23);
		contentPane.add(rbDiv);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				ca.setNum1(num1);
				ca.setNum2(num2);
				
				if(rbSoma.isSelected()) {
					tfresultado.setText(""+ca.soma());
					
				}else if(rbSub.isSelected()) {
					tfresultado.setText(""+ca.subtracao());
					
				}else if(rbmult.isSelected()) {
					tfresultado.setText(""+ca.multiplicacao());
					
				}else if(rbDiv.isSelected()) {
					tfresultado.setText(""+ca.divisao());
				}
			
			}
		});
		btnNewButton.setBounds(108, 381, 89, 23);
		contentPane.add(btnNewButton);
	}
}




