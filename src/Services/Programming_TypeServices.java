package Services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import dto.Car;
import dto.Programming_Type;

public class Programming_TypeServices {
	
	 public static void insertarPrograma(Programming_Type prog) throws SQLException, ClassNotFoundException {
		  
		 String proCall="{call \"programming_type_insert\"(?)}";
		 CallableStatement cs = ServicesLocator.getConnection().prepareCall(proCall); 		 
		  cs.setString(1, prog.getProg_type_name());

		  
		  cs.executeUpdate();

		 }
	 
	 
	    public static LinkedList<Programming_Type> mostrarProg() throws SQLException, ClassNotFoundException {
		    LinkedList<Programming_Type> list = new LinkedList<Programming_Type>();
		     
		    
		    Connection connection = ServicesLocator.getConnection();
		    ResultSet result = connection.createStatement().executeQuery(" SELECT * FROM \"programming_type\"");
		    
		  
		    while (result.next()) {
		    	Programming_Type t = new Programming_Type(result.getString("prog_type_name"));
		        list.add(t);
		    }
	System.out.println("salio6");
		    return list;
		}
	 
	
	

}
