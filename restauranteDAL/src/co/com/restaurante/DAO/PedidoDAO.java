package co.com.restaurante.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.com.restaurante.Coneccion.*;
import co.com.restaurante.DTO.PedidoDTO;


public class PedidoDAO implements IDAO<PedidoDTO>
{
	/**
	 * atributo que represntan la asociacion con la Interfaz IConeccion
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
	public boolean crear(PedidoDTO objeto) throws SQLException 
	{
		//desarmar el objeto
		int codigoUsuario = objeto.getCodigoUsuario();
		int codigoComedero = objeto.getCodigoComedero();
		double totalAPagar = objeto.getTotalAPagar();
		int totalProductos = objeto.getTotalProductos();
		
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "INSERT INTO Pedido "
				+ "(codigoUsuario, codigoComedero, totalAPagar, totalProductos)"
				+ "VALUES"
				+ "("+codigoUsuario+", "+codigoComedero+", "+totalAPagar+", "+totalProductos+")";
		
		//ejecutar la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean modificar(PedidoDTO objeto) throws SQLException 
	{
		//desarmar el objeto
		int codigo = objeto.getCodigo();
		int codigoUsuario = objeto.getCodigoUsuario();
		int codigoComedero = objeto.getCodigoComedero();
		double totalAPagar = objeto.getTotalAPagar();
		int totalProductos = objeto.getTotalProductos();
		
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "UPDATE Pedido "
				+ "SET codigoUsuario = "+codigoUsuario+", codigoComedero = "+codigoComedero+", "
					+ "totalAPagar = "+totalAPagar+", totalProductos = "+totalProductos+" "
				+ "WHERE codigo = "+codigo+"; ";
		
		//ejecuto la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean eliminar(int codigo) throws SQLException 
	{
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "DELETE usuario, pedido, producto "
				+ "FROM usuario "
				+ "LEFT JOIN pedido ON usuario.codigo = pedido.codigoUsuario "
				+ "LEFT JOIN producto ON pedido.codigo = producto.codigoPedido "
				+ "WHERE usuario.codigo = ;";
		
		//ejecutar la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		return false;
	}

	@Override
	public PedidoDTO buscarPorCodigo(int codigo) throws SQLException 
	{
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql ="SELECT * FROM Pedido WHERE codigo = "+codigo+"; ";
		
		//ejecutar la declaracion y resivir el resultado de la declaracion
		ResultSet resultado =  declarar.executeQuery(sql);
		
		//llenar el objeto
		PedidoDTO pedido = null;
		if(resultado.next())
		{
			pedido = new PedidoDTO(resultado.getInt("codigo"), resultado.getInt("codigoUsuario"), 
					resultado.getInt("codigoComedero"), resultado.getDouble("totalAPagar"), 
					resultado.getInt("totalProductos"));
			
			return pedido;
		}
		
		return pedido;
	}

	@Override
	public ArrayList<PedidoDTO> traerLista() throws SQLException 
	{
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "SELECT * FROM Pedido;";
		
		//ejecutar la declaracion
		ResultSet resultado = declarar.executeQuery(sql);
		
		//llenar la lista de objetos
		PedidoDTO pedido = null;
		ArrayList<PedidoDTO> lista = new ArrayList<PedidoDTO>();
		
		while(resultado.next())
		{
			pedido = new PedidoDTO(resultado.getInt("codigo"), resultado.getInt("codigoUsuario"), 
					resultado.getInt("codigoComedero"), resultado.getDouble("totalAPagar"), 
					resultado.getInt("totalProductos"));
			
			lista.add(pedido);
		}
		
		return lista;
	}	
}
