package Services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import dto.Car_Situation;
import dto.Driver_Situation;

public class Driver_SituationServices {

	 public static void insertarDriverSituation(Driver_Situation sitDriv) throws SQLException, ClassNotFoundException {

	        String proCall = "{call \"driver_situation_insert\"(?,?,?)}";
	        CallableStatement cs = ServicesLocator.getConnection().prepareCall(proCall);

	        
	        cs.setDate(1, new java.sql.Date(sitDriv.getReturndateds().getTime()));
	        cs.setDate(2, new java.sql.Date(sitDriv.getCurrentdateds().getTime()));
	        cs.setInt(3, sitDriv.getIdtypesitd());

	        cs.executeUpdate();
	    }
	    
	    
	    
	    
	    public static LinkedList<Driver_Situation> obtenerDriverSituation() throws SQLException, ClassNotFoundException {
		    LinkedList<Driver_Situation> list = new LinkedList<Driver_Situation>();
		     
		    
		    Connection connection = ServicesLocator.getConnection();
		    ResultSet result = connection.createStatement().executeQuery(" SELECT * FROM \"driver_situation\"");
		    
		  
		    while (result.next()) {
		    	Driver_Situation t = new Driver_Situation(result.getInt("id_ds"),result.getDate("return_date_ds"),result.getDate("current_date_ds"),result.getInt("id_aut_type_ds"));
		        list.add(t);
		    }
	System.out.println("salio4");
		    return list;
		}
	    
	
}
