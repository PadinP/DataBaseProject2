package Services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import dto.Car;
import dto.Driver;

public class DriverServices {

	 public static void insertarChofer(Driver chofer) throws SQLException, ClassNotFoundException {
		  
		 String proCall="{call \"driver_insert\"(?,?,?,?,?,?,?)}";
		 CallableStatement cs = ServicesLocator.getConnection().prepareCall(proCall); 		 
		  cs.setString(1, chofer.getDni());
		  cs.setString(2, chofer.getDrivername());
		  cs.setString(3, chofer.getHomeaddress());
		  cs.setString(4, chofer.getCategory());
		  cs.setBoolean(5, chofer.isIscopilot());
		  cs.setInt(6, chofer.getDscode());
		  cs.setInt(7, chofer.getCarnumber());

		  
		  cs.executeUpdate();

		 }
	 
	 
	 
	 public static void insertarChofer2(Driver chofer) throws SQLException, ClassNotFoundException {
		  
		 String proCall="{call \"driver_insert2\"(?,?,?,?,?,?)}";
		 CallableStatement cs = ServicesLocator.getConnection().prepareCall(proCall); 		 
		  cs.setString(1, chofer.getDni());
		  cs.setString(2, chofer.getDrivername());
		  cs.setString(3, chofer.getHomeaddress());
		  cs.setString(4, chofer.getCategory());
		  cs.setBoolean(5, chofer.isIscopilot());
		  cs.setInt(6, chofer.getDscode());
		  

		  
		  cs.executeUpdate();

		 }
	 
	 
	 
	 
	 
	 
	  
	 public static LinkedList<Driver> obtenerDriverDisponibles() throws SQLException, ClassNotFoundException {
	        LinkedList<Driver> list = new LinkedList<Driver>();

	        
	        Connection connection = ServicesLocator.getConnection();
	        ResultSet resultSet = connection.createStatement().executeQuery(
	        	    "SELECT *" +
	        	    "FROM driver " +
	        	    "INNER JOIN driver_situation ON driver_situation.id_ds = driver.id_ds " +
	        	    "INNER JOIN type_driver_situation ON type_driver_situation.id_aut_type_ds = driver_situation.id_aut_type_ds " +
	        	    "WHERE type_driver_situation.type_ds_name = 'disponible'"
	        	);     
	       
	        
	        while (resultSet.next()) {
	        	Driver t = new Driver(resultSet.getInt("id_driver"), resultSet.getString("dni_driver"), resultSet.getString("driver_name"),resultSet.getString("home_address"),resultSet.getString("category"),resultSet.getBoolean("is_copilot"), resultSet.getInt("id_ds"), resultSet.getInt("id_car"));
	            if(resultSet.getBoolean("is_copilot")==false)
	        	list.add(t);
	        }

	        System.out.println("salio choferes disponibles");
	        return list;
	    }
	
	 
	 
	 
	 
	
	
}
