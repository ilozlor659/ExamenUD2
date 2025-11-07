package es.oretania;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(158, 59, 237, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 90, 237, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JList list = new JList();
		list.setBounds(143, 201, 138, 0);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("Nombre completo:");
		lblNewLabel.setBounds(27, 62, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Correo electrónico:");
		lblNewLabel_1.setBounds(27, 93, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Curso a inscribirse:");
		lblNewLabel_2.setBounds(27, 128, 92, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Modalidad:");
		lblNewLabel_3.setBounds(27, 187, 92, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Turno de clases:");
		lblNewLabel_4.setBounds(27, 271, 92, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Duración (semanas):");
		lblNewLabel_5.setBounds(27, 328, 106, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Comentarios adicionales:");
		lblNewLabel_6.setBounds(27, 414, 124, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(62, 474, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(169, 474, 35, 0);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBounds(258, 474, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Limpiar");
		btnNewButton_3.setBounds(158, 474, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mañana");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(158, 267, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tarde");
		rdbtnNewRadioButton_1.setBounds(286, 267, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Online");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(153, 183, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Incluye material");
		chckbxNewCheckBox_1.setBounds(268, 183, 106, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Certificación al final");
		chckbxNewCheckBox_2.setBounds(153, 208, 128, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(158, 378, 237, 91);
		contentPane.add(textPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Programación en Java\r\nLenguaje de marcas\r\nBase de datos");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Programación en Java", "Lenguaje de marcas", "Base de datos"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(158, 121, 237, 22);
		contentPane.add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(6, 0, 10, 1));
		spinner.setBounds(158, 325, 237, 20);
		contentPane.add(spinner);

	}
}
