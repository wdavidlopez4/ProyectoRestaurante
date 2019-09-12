package co.com.restaurante.DAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.com.restaurante.Coneccion.Coneccion;
import co.com.restaurante.Coneccion.IConeccion;
import co.com.restaurante.DTO.ClienteDTO;
import co.com.restaurante.DTO.UsuarioDTO;

/**
 * clase abstracta que representa el usuario DTO
 * @author wdavi
 *
 */
public class UsuarioDAO implements IDAO<UsuarioDTO>
{
	/**
	 * atributo que representa la coneccion con la interfaz iconeccion
	 */
	private IConeccion coneccion;
	
	/**
	 * constructor
	 */
	public UsuarioDAO()
	{
		coneccion = new Coneccion();
	}

	@Override
	public boolean crear(UsuarioDTO objeto) throws SQLException {
		//desarmar objeto
		String correo = objeto.getCorreo();
		String contraseña = objeto.getContraseña();
		
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql="";
		if(objeto instanceof ClienteDTO)
		{
			sql = "INSERT INTO usuario(correo, contraseña, tipo)"
					+ "VALUES('"+correo+"', '"+contraseña+"', 'ClienteDTO');";
		}
		else
		{
			sql = "INSERT INTO usuario(correo, contraseña, tipo)"
					+ "VALUES('"+correo+"', '"+contraseña+"', 'AdministradorDTO');";
		}
		
		//ejecutar la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean modificar(UsuarioDTO objeto) throws SQLException {
		//desarmar objeto
		int codigo = objeto.getCodigo();
		String correo = objeto.getCorreo();
		String contraseña = objeto.getContraseña();
		
		//preparar la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql="UPDATE Usuario SET "
				+ "correo ='"+correo+"', contraseña ='"+contraseña+"' "
				+ "WHERE codigo ='"+codigo+"';";
		
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
		
		String sql ="DELETE FROM Usuario WHERE codigo = "+codigo+";";
		
		//ejecutar la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto ==1)
		{
			return true;
		}
		return false;
	}

	@Override
	public UsuarioDTO buscarPorCodigo(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UsuarioDTO> traerLista() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
