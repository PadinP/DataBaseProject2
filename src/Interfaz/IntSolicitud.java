package Interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import Services.CarServices;
import Services.DriverServices;
import Services.Group_TourServices;
import Services.Programming_TypeServices;

import com.toedter.calendar.JDateChooser;

import dto.Car;
import dto.Driver;
import dto.Group_Tour;
import dto.Programming_Type;
import dto.Type_Car_Situation;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.JSpinner;

import java.awt.Toolkit;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import util.Errors;
import util.Validar;

import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;

public class IntSolicitud extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Programming_TypeServices tp;
	private Group_TourServices gt;
	private CarServices cs;
	private DriverServices ds;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			IntSolicitud dialog = new IntSolicitud();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public IntSolicitud() throws ClassNotFoundException, SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IntSolicitud.class.getResource("/image/document.png")));
		setTitle("Solicitud");
		setBounds(100, 100, 558, 771);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		this.repaint();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(37, 24, 455, 92);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Programaci\u00F3n:");
		lblNewLabel.setBounds(109, 59, 89, 14);
		panel.add(lblNewLabel);
		
        final JComboBox<String> comboBox = new JComboBox<String>();

		LinkedList<Programming_Type> t = new  LinkedList<Programming_Type>();
		t = tp.mostrarProg();

		LinkedList<String> x = new LinkedList<String>();
		ListIterator<Programming_Type> iterator = t.listIterator();
		
		while(iterator.hasNext()){
			Programming_Type c =iterator.next();
		
		x.add(c.getProg_type_name()) ;
		
	}
		
		
	  for (String c : x)
		 {
	            comboBox.addItem(c);
	        }
		
		
		comboBox.setBounds(208, 53, 211, 20);
		panel.add(comboBox);
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"transfer", "visita", "circuito", "excursi\u00F3n"}));
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(208, 22, 211, 20);
		panel.add(dateChooser);
		dateChooser.setDateFormatString("dd/MM/yyyy");
		dateChooser.setDate(new Date());
		dateChooser.setMinSelectableDate(new Date());
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(155, 25, 43, 23);
		panel.add(lblFecha);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Grupo Tur\u00EDstico", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(37, 132, 455, 316);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setBounds(171, 235, 35, 14);
		panel_1.add(lblHora);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(216, 232, 211, 20);
		panel_1.add(spinner);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad de turistas:");
		lblNewLabel_2.setBounds(84, 204, 122, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Pa\u00EDs de prodecencia:");
		lblNewLabel_1.setBounds(84, 173, 122, 14);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(216, 170, 211, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		final JLabel lblNewLabel_3 = new JLabel("C\u00F3digo del Grupo:");
		lblNewLabel_3.setBounds(104, 37, 102, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Descripci\u00F3n de la Programaci\u00F3n:");
		lblNewLabel_4.setBounds(20, 270, 186, 14);
		panel_1.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(216, 267, 211, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		

		final JComboBox<String> comboBox_4 = new JComboBox<String>();

		LinkedList<Group_Tour> g = new  LinkedList<Group_Tour>();
		g = gt.mostrarGrupo();

		LinkedList<Integer> z = new LinkedList<Integer>();
		ListIterator<Group_Tour> iterator2 = g.listIterator();
		
		while(iterator2.hasNext()){
			Group_Tour c2 =iterator2.next();
				
		z.add(c2.getGroup_code()) ;	
	}
		
	  for (Integer c2 : z)
		 {
	            comboBox_4.addItem(String.valueOf(c2));
	        }
	  
	
		
		
		comboBox_4.setBounds(216, 34, 211, 20);
		panel_1.add(comboBox_4);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 45, 1));
		spinner_1.setBounds(216, 201, 211, 20);
		panel_1.add(spinner_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Crear Grupo Nuevo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(22, 59, 412, 103);
		panel_1.add(panel_4);
		
		final JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setEnabled(false);
		lblCdigo.setBounds(131, 60, 56, 14);
		panel_4.add(lblCdigo);
		
		JRadioButton radioButton = new JRadioButton("Si");
		buttonGroup_1.add(radioButton);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setEnabled(true);
				lblCdigo.setEnabled(true);
				comboBox_4.setEnabled(false);
				lblNewLabel_3.setEnabled(false);
				
			}
		});
		radioButton.setBounds(72, 24, 56, 23);
		panel_4.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		buttonGroup_1.add(radioButton_1);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setEnabled(false);
				lblCdigo.setEnabled(false);
				comboBox_4.setEnabled(true);
				lblNewLabel_3.setEnabled(true);
				
			}
		});
		radioButton_1.setSelected(true);
		radioButton_1.setBounds(320, 24, 56, 23);
		panel_4.add(radioButton_1);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(197, 57, 203, 20);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Carro Asignado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(37, 459, 455, 228);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("N\u00FAmero del Carro:");
		lblNewLabel_5.setBounds(97, 40, 103, 14);
		panel_2.add(lblNewLabel_5);
		
		
		
		
		final JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(219, 34, 209, 20);

		LinkedList<Car> availables_cars = new  LinkedList<Car>();
		availables_cars = cs.mostrarCar();

		LinkedList<String> carsNumber = new LinkedList<String>();
		ListIterator<Car> iterator3 = availables_cars.listIterator();
		
		while(iterator3.hasNext()){
			Car c3 =iterator3.next();
				
			carsNumber.add(c3.getCarnumber()) ;	
	}
		
	  for (String c3 : carsNumber)
		 {
	            comboBox_1.addItem(c3);
	        }
		panel_2.add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre y Apellidos del chofer:");
		lblNewLabel_6.setBounds(33, 71, 176, 14);
		panel_2.add(lblNewLabel_6);
		
		
		
		final JComboBox<String> comboBox_6 = new JComboBox<String>();
		comboBox_6.setBounds(219, 65, 209, 20);

		LinkedList<Driver> obtenerDriver = new  LinkedList<Driver>();
		obtenerDriver = ds.obtenerDriverDisponibles();

		LinkedList<String> driverName = new LinkedList<String>();
		ListIterator<Driver> iterator4 = obtenerDriver.listIterator();
		
		while(iterator4.hasNext()){
			Driver d3 =iterator4.next();
				
			driverName.add(d3.getDrivername()) ;	
	}
		
	  for (String d3 : driverName)
		 {
	            comboBox_6.addItem(d3);
	        }
		panel_2.add(comboBox_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(21, 114, 413, 103);
		panel_3.setBorder(new TitledBorder(null, "Copiloto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		final JLabel lblNewLabel_7 = new JLabel("Nombres y Apellidos:");
		lblNewLabel_7.setEnabled(false);
		lblNewLabel_7.setBounds(73, 60, 126, 14);
		panel_3.add(lblNewLabel_7);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(209, 57, 194, 20);
		panel_3.add(comboBox_2);
		
		JRadioButton rdbtnSi = new JRadioButton("Si");
		rdbtnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_7.setEnabled(true);
				comboBox_2.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnSi);
		rdbtnSi.setBounds(86, 24, 56, 23);
		panel_3.add(rdbtnSi);
		
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_7.setEnabled(false);
				comboBox_2.setEnabled(false);
			}
		});
		rdbtnNo.setSelected(true);
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(320, 24, 56, 23);
		panel_3.add(rdbtnNo);
		

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String paisss = textField.getText();
						if(Validar.solo_Letras(paisss))
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
