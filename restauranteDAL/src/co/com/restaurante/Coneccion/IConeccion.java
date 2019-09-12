package co.com.restaurante.Coneccion;

import java.sql.Connection;

/**
 * interfaz generica que representa los metodos de la coneccion
 * @author wdavi
 */
public interface IConeccion
{
	/**metodo conectar que conecta a la db
	 * @return connection de tipo Connection o null si no conecto
	 */
	public Connection conectar();
	
	/**metodo desconectar que lo desconecta de la db
	 * @return boolean True si desconecto
	 */
	public boolean desconectar();
}
