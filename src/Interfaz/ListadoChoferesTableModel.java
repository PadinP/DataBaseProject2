package Interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ListadoChoferesTableModel extends DefaultTableModel {
	
	public ListadoChoferesTableModel(){
		String[] columnNames = {
				"DNI", "Nombre y Apellidos", "Direcci�n Particular", "Categor�a","Carro Fijo"};
			this.setColumnIdentifiers(columnNames);
	}
	
}
