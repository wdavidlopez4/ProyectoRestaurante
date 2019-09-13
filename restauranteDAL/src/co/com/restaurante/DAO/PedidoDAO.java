package co.com.restaurante.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import co.com.restaurante.Coneccion.Coneccion;
import co.com.restaurante.Coneccion.IConeccion;
import co.com.restaurante.DTO.PedidoDTO;

/**
 * clase que representa el pedidoDAO e implementa la interfaze IDAO
 * @author wdavi
 *
 */
public class PedidoDAO implements IDAO<PedidoDTO>
{
	/**
	 * atributo que representa la asociacion entre la interfaz IConeccion
	 */
	private IConeccion coneccion;
	
	/**
	 * constructor
	 */
	public PedidoDAO()
	{
		coneccion = new Coneccion();
	}

	@Override
	public boolean crear(PedidoDTO objeto) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificar(PedidoDTO objeto) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PedidoDTO buscarUnoObjeto(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PedidoDTO> traerLista() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
