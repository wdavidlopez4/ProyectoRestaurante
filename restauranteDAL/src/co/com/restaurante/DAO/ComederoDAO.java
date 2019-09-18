package co.com.restaurante.DAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.com.restaurante.Coneccion.Coneccion;
import co.com.restaurante.Coneccion.IConeccion;
import co.com.restaurante.DTO.ComederoDTO;

/**
 * clase comederoDAO que representa un dao e implementa la interfaz IDAO
 * @author wdavi
 *
 */
public class ComederoDAO implements IDAO<ComederoDTO>
{
	/**
	 * atributo que representa la asociacion entre la interfaz IConeccion
	 */
	private IConeccion coneccion;
	
	/**
	 * constructor
	 */
	public ComederoDAO()
	{
		coneccion = new Coneccion();
	}

	@Override
	public boolean crear(ComederoDTO objeto) throws SQLException {
		//desarmar el objeto
		int cantidadSillas = objeto.getCantidadSillas();
		int posicion = objeto.getPosicion();
		int estado = objeto.getEstado();
		String tipo = objeto.getClass().getName();
		
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql="INSERT INTO Comedero "
				+ "(cantidadSillas, posicion, estado, tipo) "
				+ "VALUES "
				+ "("+cantidadSillas+", "+posicion+", "+estado+", '"+tipo+"');";
		
		//ejecutar la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean modificar(ComederoDTO objeto) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ComederoDTO buscarUnoObjeto(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ComederoDTO> traerLista() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
