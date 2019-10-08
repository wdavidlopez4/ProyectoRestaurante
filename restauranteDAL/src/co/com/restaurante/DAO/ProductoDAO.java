package co.com.restaurante.DAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.com.restaurante.Coneccion.Coneccion;
import co.com.restaurante.Coneccion.IConeccion;
import co.com.restaurante.DTO.CorrienteDTO;
import co.com.restaurante.DTO.EjecutivoDTO;
import co.com.restaurante.DTO.ProductoDTO;

/**clase concreta que implementa a la interfaze IDAO 
 * @author wdavi
 *
 */
public class ProductoDAO implements IDAO<ProductoDTO>
{
	/**
	 * atributo que representa la asociacion con la interface IConeccion
	 */
	private IConeccion coneccion;
	
	/**
	 * constructor
	 */
	public ProductoDAO()
	{
		coneccion = new Coneccion();
	}

	@Override
	public boolean crear(ProductoDTO objeto) throws SQLException {
		//desarmar el objeto 
		int  codigoPedido = objeto.getCodigoPedido();
		String nombre = objeto.getNombre();
		String disponibilidad = objeto.getDisponibilidad();
		double precio = objeto.getPrecio();
		double costo = objeto.getCosto();
		double tiempoPreparacion = objeto.getTiempoPreparacion();
		String descripcion = objeto.getDescripcion();
		String tipo = objeto.getClass().getName();
		int estado = objeto.getEstado();
		
		//prerarar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		String sql = "";
		
		if(objeto instanceof CorrienteDTO)
		{
			sql = "INSERT INTO `producto`"
				+ "(`codigoPedido`, `nombre`, `disponibilidad`, `precio`, `costo`, "
				+ "`tiempoPreparacion`, `descripcion`, `tipo`, `estado`) "
				+ "VALUES "
				+ "("+codigoPedido+", '"+nombre+"', '"+disponibilidad+"', '"+precio+"', '"+costo+"', "
				+ " "+tiempoPreparacion+", '"+descripcion+"', '"+tipo+"', "+estado+");";
		}
		else if(objeto instanceof EjecutivoDTO)
		{
			//hacer casteo para que me debuelva un objeto ejecutivo y asi poder llamar a los metodos que solo estan declarados en la clase ejecutivo
			EjecutivoDTO ejecutivo = (EjecutivoDTO)objeto;
			
			//como ya se se realizo el castin ahora si podemos llamar el metodo que solo esta implementado en la clase ejecutivo y que no lo ereda
			double precioExtra = ejecutivo.getPrecioExtra();
			
			sql = "INSERT INTO `producto`"
					+ "(`codigoPedido`, `nombre`, `disponibilidad`, `precio`, `costo`, "
					+ "`tiempoPreparacion`, `descripcion`, `tipo`, `estado`, `precioExtra`) "
					+ "VALUES "
					+ "("+codigoPedido+", '"+nombre+"', '"+disponibilidad+"', '"+precio+"', '"+costo+"', "
					+ " "+tiempoPreparacion+", '"+descripcion+"', '"+tipo+"', "+estado+", "+precioExtra+");";
		}
		
		//ejecutar la declaracion
		int seEjecuto =declarar.executeUpdate(sql);
		if(seEjecuto == 1)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean modificar(ProductoDTO objeto) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductoDTO buscarUnoObjeto(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ProductoDTO> traerLista() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
