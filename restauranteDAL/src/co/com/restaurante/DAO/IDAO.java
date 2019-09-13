package co.com.restaurante.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IDAO<T>
{
	/**
	 * metodo crear, arma el objeto
	 * @param objeto
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean crear(T objeto)throws SQLException;
	
	/**
	 * metodo modificar, modifica el objeto"los valores en la db"
	 * @param objeto
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean modificar(T objeto)throws SQLException;
	
	/**
	 * metodo eliminar, elimina el objeto "valores en la db"
	 * @param codigo
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean eliminar(int codigo)throws SQLException;
	
	/**
	 * metodo buscar un solo objeto, busca el objeto por el codigo
	 * @param codigo
	 * @return boolean
	 * @throws SQLException
	 */
	public T buscarUnoObjeto(int codigo)throws SQLException;
	
	/**
	 * metodo traer lista, trae la lista de objeto
	 * @return boolean
	 * @throws SQLException
	 */
	public ArrayList<T> traerLista()throws SQLException;
}
