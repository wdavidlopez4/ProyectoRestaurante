package co.com.restaurante.Coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**clase que representa la coneccion hacia la db MYSQL
 * @author wdavi
 *
 */
public class Coneccion implements IConeccion
{
	/**
	 * constante que representa la url de la coneccion
	 */
	private static final String URL ="jdbc:mysql://localhost:3306/restaurantedb";
	
	/**
	 * constante que representa el usuario root de la db
	 */
	private static final String USUARIO = "adminRestauran";
	
	/**
	 * constante que representa la contaceña de la db
	 */
	private static final String PASSWORD = "Colombia2018";
	
	/**
	 * atributo que representa la asociacion con la clase Connecion
	 */
	private Connection coneccion;
	
	/**
	 * constructor
	 */
	public Coneccion()
	{
		coneccion = null;
	}

	/*
	 * @see co.com.restaurante.Coneccion.IConeccion#conectar()
	 */
	@Override
	public Connection conectar()
	{
		try
		{
			//cargar el driver
			Class.forName("org.gjt.mm.mysql.Driver");
			
			//conectar el dirver, pasar como parametro URL USUARIO PASSWORD
			return coneccion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return coneccion = null;
	}

	/*
	 * @see co.com.restaurante.Coneccion.IConeccion#desconectar()
	 */
	@Override
	public boolean desconectar() {
		try{
			//cerrar la coneccion
			coneccion.close();
			return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
}
