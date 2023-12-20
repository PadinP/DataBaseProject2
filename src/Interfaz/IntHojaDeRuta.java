package Interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import com.toedter.calendar.JDateChooser;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import util.Errors;
import util.Validar;

public class IntHojaDeRuta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			IntHojaDeRuta dialog = new IntHojaDeRuta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public IntHojaDeRuta() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IntHojaDeRuta.class.getResource("/image/note.png")));
		setTitle("Agregar Hoja de Ruta");
		setBounds(100, 100, 568, 703);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		this.repaint();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Copiloto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(34, 213, 479, 104);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setBounds(228, 56, 211, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
	    final JLabel lblNewLabel_5 = new JLabel("Nombre y Apellidos:");
	    lblNewLabel_5.setEnabled(false);
	    lblNewLabel_5.setBounds(90, 59, 118, 14);
	    panel.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Si");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_5.setEnabled(true);
				textField_4.setEnabled(true);		
			}
		});
		

		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(110, 23, 54, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_5.setEnabled(false);
				textField_4.setEnabled(false);
			}
		});
		rdbtnNewRadioButton_1.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(333, 23, 54, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(34, 25, 479, 177);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(226, 18, 208, 20);
		panel_1.add(dateChooser);
		dateChooser.setDateFormatString("dd/MM/yyyy");
		dateChooser.setDate(new Date());
		dateChooser.setMinSelectableDate(new Date());
		
		textField = new JTextField();
		textField.setBounds(226, 49, 208, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(226, 80, 208, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(226, 111, 208, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(227, 141, 207, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		{
			JLabel lblNewLabel = new JLabel("Fecha:");
			lblNewLabel.setBounds(164, 24, 52, 14);
			panel_1.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("N\u00FAmero del Carro:");
			lblNewLabel_1.setBounds(96, 52, 122, 14);
			panel_1.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Km disponibles al comenzar:");
			lblNewLabel_2.setBounds(35, 83, 168, 14);
			panel_1.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Km disponibles al terminar:");
			lblNewLabel_3.setBounds(45, 114, 158, 14);
			panel_1.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Nombre y Apellidos del chofer:");
			lblNewLabel_4.setBounds(29, 144, 174, 14);
			panel_1.add(lblNewLabel_4);
		}
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Programaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(34, 328, 479, 276);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTipo = new JLabel("Programaci\u00F3n:");
		lblTipo.setBounds(120, 186, 100, 14);
		panel_2.add(lblTipo);
		
		JLabel lblCdigoDelGrupo = new JLabel("C\u00F3digo del Grupo:");
		lblCdigoDelGrupo.setBounds(101, 62, 119, 14);
		panel_2.add(lblCdigoDelGrupo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(230, 59, 199, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Pa\u00EDs:");
		lblNewLabel_6.setBounds(173, 93, 34, 14);
		panel_2.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(230, 90, 199, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Cantidad de Pasajeros:");
		lblNewLabel_7.setBounds(70, 124, 150, 14);
		panel_2.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(230, 121, 199, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Lugar de Recogida:");
		lblNewLabel_8.setBounds(95, 155, 125, 14);
		panel_2.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		textField_8.setBounds(230, 152, 199, 20);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Transfer", "Visita", "Circuito", "Excursi\u00F3n"}));
		comboBox.setBounds(230, 183, 199, 20);
		panel_2.add(comboBox);
		
		JLabel lblNewLabel_9 = new JLabel("Hora de Inicio:");
		lblNewLabel_9.setBounds(122, 31, 85, 14);
		panel_2.add(lblNewLabel_9);
		
		textField_9 = new JTextField();
		textField_9.setBounds(230, 28, 199, 20);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("   Hora de Fin:");
		lblNewLabel_10.setBounds(130, 217, 85, 14);
		panel_2.add(lblNewLabel_10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(230, 214, 199, 20);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String nAp = textField_3.getText();
						if(Validar.solo_Letras(nAp))
							Errors.mostrarError("Nombre y Apellidos Incorrectos del Chofer");
						String nAp2 = textField_4.getText();
						if(Validar.solo_Letras(nAp2))
							Errors.mostrarError("Nombre y Apellidos Incorrectos del Copiloto");
						String paiss = textField_6.getText();
						if(Validar.solo_Letras(paiss))
							Errors.mostrarError("País Incorrecto");
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
