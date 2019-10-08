package co.com.restaurante.DAO;

import java.sql.ResultSet;
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
		//desarmar el objeto
		int codigo = objeto.getCodigo();
		int  codigoPedido = objeto.getCodigoPedido();
		String nombre = objeto.getNombre();
		String disponibilidad = objeto.getDisponibilidad();
		double precio = objeto.getPrecio();
		double costo = objeto.getCosto();
		double tiempoPreparacion = objeto.getTiempoPreparacion();
		String descripcion = objeto.getDescripcion();
		String tipo = objeto.getClass().getName();
		int estado = objeto.getEstado();
		
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		String sql ="";
		
		if(objeto instanceof CorrienteDTO)
		{
			sql ="UPDATE `producto` SET "
					+ "`codigoPedido`="+codigoPedido+",`nombre`='"+nombre+"',`disponibilidad`='"+disponibilidad+"',"
					+ "`precio`="+precio+",`costo`="+costo+",`tiempoPreparacion`="+tiempoPreparacion+","
					+ "`descripcion`='"+descripcion+"',`tipo`='"+tipo+"',"
					+ "`estado`="+estado+" WHERE  `codigo`="+codigo+";";
		}
		else if(objeto instanceof EjecutivoDTO)
		{
			//hacer casteo para poder devolver un objeto tipo ejecutivo uso de polimorfismo
			EjecutivoDTO ejecutivo = (EjecutivoDTO)objeto;
			
			//como ya se realizo el castin ahora si podemos ejecutar el metodo espesifico de la clase ejecutivo ya que este metodo no lo eredamos
			double precioExtra = ejecutivo.getPrecioExtra();
			
			sql ="UPDATE `producto` SET "
					+ "`codigoPedido`="+codigoPedido+",`nombre`='"+nombre+"',`disponibilidad`='"+disponibilidad+"',"
					+ "`precio`="+precio+",`costo`="+costo+",`tiempoPreparacion`="+tiempoPreparacion+","
					+ "`descripcion`='"+descripcion+"',`tipo`='"+tipo+"',"
					+ "`estado`="+estado+", `estado`="+precioExtra+" WHERE  `codigo`="+codigo+";";
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
	public boolean eliminar(int codigo) throws SQLException {
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "DELETE FROM `producto` WHERE codigo = "+codigo+";";
		
		//ejecutar la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		if(seEjecuto == 1)
		{
			return true;
		}
		return false;
	}

	@Override
	public ProductoDTO buscarUnoObjeto(int codigo) throws SQLException {
		//preparar declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql ="SELECT * FROM `producto` WHERE codigo = "+codigo+";";
		
		//ejecutar declaracion
		ResultSet resultado = declarar.executeQuery(sql);
		
		//llegar el objeto dependiendo de su tipo
		ProductoDTO producto = null;
		if(resultado.next())
		{
			if(resultado.getString("tipo").equals("co.com.restaurante.DTO.CorrienteDTO"))
			{
				int codigoPedido = resultado.getInt("codigoPedido");
				String nombre = resultado.getString("nombre");
				String disponibilidad = resultado.getString("disponibilidad");
				double precio = resultado.getDouble("precio");
				double costo = resultado.getDouble("costo");
				double tiempoPreparacion = resultado.getDouble("tiempoPreparacion");
				String descripcion = resultado.getString("descripcion");
				int estado = resultado.getInt("estado");
				
				producto = new CorrienteDTO(codigo, codigoPedido, nombre, disponibilidad, precio, 
						costo, tiempoPreparacion, descripcion, estado);
			}
			
			else if(resultado.getString("tipo").equals("co.com.restaurante.DTO.EjecutivoDTO"))
			{	
				int codigoPedido = resultado.getInt("codigoPedido");
				String nombre = resultado.getString("nombre");
				String disponibilidad = resultado.getString("disponibilidad");
				double precio = resultado.getDouble("precio");
				double costo = resultado.getDouble("costo");
				double tiempoPreparacion = resultado.getDouble("tiempoPreparacion");
				String descripcion = resultado.getString("descripcion");
				int estado = resultado.getInt("estado");
				Double precioExtra = resultado.getDouble("precioExtra");
				
				producto = new EjecutivoDTO(codigo, codigoPedido, nombre, disponibilidad, precio, 
						costo, tiempoPreparacion, descripcion, estado, precioExtra);
			}
		}
		
		return producto;
	}

	@Override
	public ArrayList<ProductoDTO> traerLista() throws SQLException {
		//preparar declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql ="SELECT * FROM `producto`;";
		
		//ejecutar declaracion
		ResultSet resultado = declarar.executeQuery(sql);
		
		//llenar la lista de ojetos
		ProductoDTO producto = null;
		ArrayList<ProductoDTO> lista = new ArrayList<ProductoDTO>();
		
		while(resultado.next())
		{
			if(resultado.getString("tipo").equals("co.com.restaurante.DTO.CorrienteDTO"))
			{
				int codigo = resultado.getInt("codigo");
				int codigoPedido = resultado.getInt("codigoPedido");
				String nombre = resultado.getString("nombre");
				String disponibilidad = resultado.getString("disponibilidad");
				double precio = resultado.getDouble("precio");
				double costo = resultado.getDouble("costo");
				double tiempoPreparacion = resultado.getDouble("tiempoPreparacion");
				String descripcion = resultado.getString("descripcion");
				int estado = resultado.getInt("estado");
				
				producto = new CorrienteDTO(codigo, codigoPedido, nombre, disponibilidad, precio, 
						costo, tiempoPreparacion, descripcion, estado);
			}
			
			else if(resultado.getString("tipo").equals("co.com.restaurante.DTO.EjecutivoDTO"))
			{
				int codigo = resultado.getInt("codigo");
				int codigoPedido = resultado.getInt("codigoPedido");
				String nombre = resultado.getString("nombre");
				String disponibilidad = resultado.getString("disponibilidad");
				double precio = resultado.getDouble("precio");
				double costo = resultado.getDouble("costo");
				double tiempoPreparacion = resultado.getDouble("tiempoPreparacion");
				String descripcion = resultado.getString("descripcion");
				int estado = resultado.getInt("estado");
				Double precioExtra = resultado.getDouble("precioExtra");
				
				producto = new EjecutivoDTO(codigo, codigoPedido, nombre, disponibilidad, precio, 
						costo, tiempoPreparacion, descripcion, estado, precioExtra);
			}
			lista.add(producto);
		}
		
		return lista;
	}
}

