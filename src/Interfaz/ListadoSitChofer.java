package Interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.DefaultCellEditor;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Toolkit;


public class ListadoSitChofer extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel buttonPane;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListadoSitChofer dialog = new ListadoSitChofer();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListadoSitChofer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListadoChoferes.class.getResource("/image/male-user.png")));
		setTitle("Lista de la Situaci�n de los Choferes");
		setAlwaysOnTop(true);
		this.repaint();
		setBounds(100, 100, 730, 429);
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton botonVolver = new JButton("Volver");
				botonVolver.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				botonVolver.setActionCommand("Cancel");
				buttonPane.add(botonVolver);
			}
		}
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
						.addComponent(buttonPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table = new JTable();
		ListadoSitChoferTableModel tableModel = new ListadoSitChoferTableModel();
		table.setModel(tableModel);

		scrollPane.setViewportView(table);
		
		table.setDefaultEditor(Object.class,new DefaultCellEditor(new JTextField()){
			public boolean isCellEditable(EventObject evt){
				return false;
			}
		});
		
		table.setRowSelectionAllowed(true);
		
		getContentPane().setLayout(groupLayout);
		setLocationRelativeTo(null);
	}
}