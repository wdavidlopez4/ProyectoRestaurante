package co.com.restaurante.DAO;

import java.util.ArrayList;

public interface IDAO<T>
{
	public boolean crear(T objeto);
	
	public boolean modificar(T objeto);
	
	public boolean eliminar(int codigo);
	
	public T buscarUnoObjeto(int codigo);
	
	public ArrayList<T> traerLista();
	
	public boolean desabilitar(int codigo);
}
