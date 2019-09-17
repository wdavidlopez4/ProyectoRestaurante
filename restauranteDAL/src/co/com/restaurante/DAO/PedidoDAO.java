package co.com.restaurante.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		//desarmar el objeto
		int codigoUsuario = objeto.getCodigoUsuario();
		int codigoComedero = objeto.getCodigoComedero();
		double totalAPagar = objeto.getTotalAPagar();
		int totalProductos = objeto.getTotalProductos();
		int estado = objeto.getEstado();
		
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "INSERT INTO Pedido "
				+ "(codigoUsuario, codigoComedero, totalAPagar, totalProductos, estado) "
				+ "VALUES "
				+ "("+codigoUsuario+", "+codigoComedero+", "+totalAPagar+", "+totalProductos+", "+estado+");";
		
		//ejecutar la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean modificar(PedidoDTO objeto) throws SQLException {
		//desarmar el objeto
		int codigo = objeto.getCodigo();
		int codigoUsuario = objeto.getCodigoUsuario();
		int codigoComedero = objeto.getCodigoComedero();
		double totalAPagar = objeto.getTotalAPagar();
		int totalProductos = objeto.getTotalProductos();
		int estado = objeto.getEstado();
		
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql ="UPDATE Pedido SET "
				+ "codigoUsuario ="+codigoUsuario+", codigoComedero ="+codigoComedero+", "
				+ "totalAPagar ="+totalAPagar+", totalProductos ="+totalProductos+", "
				+ "estado ="+estado+" "
				+ "WHERE codigo ="+codigo+";";
		
		//ejecutar la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean eliminar(int codigo) throws SQLException {
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "DELETE FROM Pedido WHERE codigo = "+codigo+";";
		
		//ejecutar la declaracion
		int seEjecuta = declarar.executeUpdate(sql);
		
		if(seEjecuta == 1)
		{
			return true;
		}
		return false;
	}

	@Override
	public PedidoDTO buscarUnoObjeto(int codigo) throws SQLException {
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql ="SELECT * FROM Pedido WHERE codigo = "+codigo+";";
		
		//ejecutar la delcaracion
		ResultSet resultado = declarar.executeQuery(sql);
		
		
		//armar el objeto 
		PedidoDTO pedido = null;
		if(resultado.next())
		{
			pedido = new PedidoDTO(resultado.getInt("codigo"), resultado.getInt("codigoUsuario"), 
					resultado.getInt("codigoComedero"), resultado.getDouble("totalAPagar"), 
					resultado.getInt("totalProductos"), resultado.getInt("estado"));
		}
		
		return pedido;
	}

	@Override
	public ArrayList<PedidoDTO> traerLista() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
