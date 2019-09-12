package co.com.restaurante.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IDAO<T>
{
	/**
	 * metodo crear, crea el objeto lo inserta en la db
	 * @param objeto
	 * @return boolean True si se creo
	 */
	public boolean crear(T objeto)throws SQLException;
	
	/**
	 * metodo modificar, modifica el objeto, modifica la info en la db
	 * @param objeto
	 * @return boolean true se modifico
	 */
	public boolean modificar(T objeto)throws SQLException;
	
	/**
	 * metodo eliminar, elimina el objeto, elimina la info de la db
	 * metodo
	 * @param codigo
	 * @return  boolean true si se elimino
	 */
	public boolean eliminar(int codigo)throws SQLException;
	
	/**
	 * metodo buscarPorCodigo, arma el objeto desde la db
	 * @param codigo
	 * @return objeto T generics
	 */
	public T buscarPorCodigo(int codigo)throws SQLException;
	
	/**metodo trae lista de objetos, arma la lista de objeto desde la db
	 * @return
	 */
	public ArrayList<T> traerLista()throws SQLException;
}
