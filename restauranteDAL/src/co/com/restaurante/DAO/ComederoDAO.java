package co.com.restaurante.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.com.restaurante.Coneccion.Coneccion;
import co.com.restaurante.Coneccion.IConeccion;
import co.com.restaurante.DTO.ComederoDTO;
import co.com.restaurante.DTO.MesaFamiliarDTO;
import co.com.restaurante.DTO.MesaPersonalDTO;

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
		//desarmar el objeto
		int codigo = objeto.getCodigo();
		int cantidadSillas = objeto.getCantidadSillas();
		int posicion = objeto.getPosicion();
		int estado = objeto.getEstado();
		String tipo = objeto.getClass().getName();
		
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "UPDATE Comedero SET "
				+ "cantidadSillas ="+cantidadSillas+", posicion ="+posicion+", "
				+ "estado ="+estado+", tipo ='"+tipo+"' "
				+ "WHERE codigo ="+codigo+";";
		
		//ejecutar la delcaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean eliminar(int codigo) throws SQLException {
		//preparar la delcaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "DELETE FROM Comedero WHERE codigo = "+codigo+";";
		
		//ejecutar la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		return false;
	}

	@Override
	public ComederoDTO buscarUnoObjeto(int codigo) throws SQLException {
		//preparar la delcaracion 
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "SELECT * FROM Comedero WHERE codigo = "+codigo+";";
		
		//ejecutar la declaracion y almacenarla el resultado
		ResultSet resultado = declarar.executeQuery(sql);
		
		//llenar el objeto
		ComederoDTO comedero = null;
		if(resultado.next())
		{
			if(resultado.getString("tipo").equals("co.com.restaurante.DTO.MesaFamiliarDTO"))
			{
				comedero = new MesaFamiliarDTO(resultado.getInt("codigo"), resultado.getInt("cantidadSillas"),
						resultado.getInt("posicion"), resultado.getInt("estado"));
			}
			else if(resultado.getString("tipo").equals("co.com.restaurante.DTO.MesaPersonalDTO"))
			{
				comedero = new MesaPersonalDTO(resultado.getInt("codigo"), resultado.getInt("cantidadSillas"),
						resultado.getInt("posicion"), resultado.getInt("estado"));
			}
		}
		
		return comedero;
	}

	@Override
	public ArrayList<ComederoDTO> traerLista() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
