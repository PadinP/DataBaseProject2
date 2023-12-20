package Services;

import java.sql.SQLException;
import java.sql.Types;

import dto.Car;
import dto.Car_Situation;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.sql.Connection;


public class CarServices {
	
	
	 public static void insertarCarro(Car carro) throws SQLException, ClassNotFoundException {
		  
		 String proCall="{call \"car_insert\"(?,?,?,?)}";
		 CallableStatement cs = ServicesLocator.getConnection().prepareCall(proCall); 		 
		  cs.setString(1, carro.getCarnumber());
		  cs.setString(2, carro.getCarbrand());
		  cs.setInt(3, carro.getNumberofseats());
		  cs.setInt(4, carro.getCscode());
		  
		  cs.executeUpdate();

		 }
	 
		
	 
	    public static LinkedList<Car> mostrarCar() throws SQLException, ClassNotFoundException {
		    LinkedList<Car> list = new LinkedList<Car>();
		     
		    
		    String proCall="{? = call find_available_cars()}"; // el simbolo de "?" se utiliza para indicar los parametros tanto de entrada como de salida
			CallableStatement cs = ServicesLocator.getConnection().prepareCall(proCall); 	
			cs.registerOutParameter(1, Types.REF_CURSOR); // Se define el valor de retorno de la funcion (En este caso un refcursor)
			cs.execute(); // se ejecuta la llamada a la funcion
			ResultSet result = (ResultSet) cs.getObject(1); // se obtiene el valor de retorno de la funcion (en este caso un refcursor)
		    
		    while (result.next()) {
		    	Car t = new Car(result.getInt("id_car"),result.getString("car_number"),result.getString("car_brand"),result.getInt("number_of_seats"),result.getInt("id_cs"));
		        list.add(t);
		        System.out.println(result.getInt("id_car") + " " + result.getString("car_number") 
		        + " " + result.getString("car_brand") + " " + result.getInt("number_of_seats") + " " + result.getInt("id_cs"));
		    }
		    
		    ServicesLocator.getConnection().commit(); // se confirman los cambios
		    
		    return list;
		}
	 
	
	   /* public static LinkedList<Car> obtenerCarrosDisponibles() throws SQLException, ClassNotFoundException {
	        LinkedList<Car> list = new LinkedList<Car>();

	        
	        Connection connection = ServicesLocator.getConnection();
	        ResultSet resultSet = connection.createStatement().executeQuery(
	        	    "SELECT car.id_car, car.car_number, car.car_brand, car.number_of_seats, car.id_cs " +
	        	    "FROM car " +
	        	    "INNER JOIN car_situation ON car_situation.id_cs = car.id_cs " +
	        	    "INNER JOIN type_car_situation ON type_car_situation.id_aut_type_cs = car_situation.id_aut_type_cs " +
	        	    "WHERE type_car_situation.type_cs_name = 'disponible'"
	        	);     
	       
	        
	        while (resultSet.next()) {
	            Car t = new Car(resultSet.getInt("id_car"), resultSet.getString("car_number"), resultSet.getString("car_brand"), resultSet.getInt("number_of_seats"), resultSet.getInt("id_cs"));
	            list.add(t);
	        }

	        System.out.println("salio carros disponibles");
	        return list;
	    }*/
	
	

}
