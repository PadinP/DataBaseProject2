package Interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ListadoSitCarrosTableModel extends DefaultTableModel {
	
	public ListadoSitCarrosTableModel(){
		String[] columnNames = {
				"Fecha", "N�mero del Carro", "Situaci�n", "Fecha de Regreso"};
			this.setColumnIdentifiers(columnNames);
	}
	
}
