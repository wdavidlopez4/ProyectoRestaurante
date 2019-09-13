package co.com.restaurante.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.com.restaurante.Coneccion.Coneccion;
import co.com.restaurante.Coneccion.IConeccion;
import co.com.restaurante.DTO.AdministradorDTO;
import co.com.restaurante.DTO.ClienteDTO;
import co.com.restaurante.DTO.UsuarioDTO;

public class UsuarioDAO implements IDAO<UsuarioDTO>
{
	/**
	 * atributo que representa la asociacion con la interfaze IConeccion
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
		//desarmar el objeto
		String correo = objeto.getCorreo();
		String contraseña = objeto.getContraseña();
		int estado = objeto.getEstado();
		String tipo = objeto.getClass().getName();
		
		//preparar la declaracion sql
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "INSERT INTO usuario "
				+ "(correo, contraseña, tipo, estado) "
				+ "VALUES "
				+ "('"+correo+"', '"+contraseña+"', '"+tipo+"', "+estado+");";
		
		//ejecutar  la decalracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean modificar(UsuarioDTO objeto) throws SQLException {
		//desarmar el objeto
		int codigo = objeto.getCodigo();
		String correo = objeto.getCorreo();
		String contraseña = objeto.getContraseña();
		int estado = objeto.getEstado();
		String tipo = objeto.getClass().getName();
		
		//preparar declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql ="UPDATE Usuario SET "
				+ "correo ='"+correo+"', contraseña ='"+contraseña+"', "
				+ "estado ="+estado+", tipo ='"+tipo+"' "
				+ "WHERE codigo ="+codigo+";";
		
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
		
		String sql= "DELETE FROM Usuario WHERE codigo = "+codigo+";";
		
		//ejecutar la declaracion
		int seEjecuto = declarar.executeUpdate(sql);
		
		if(seEjecuto == 1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public UsuarioDTO buscarUnoObjeto(int codigo) throws SQLException {
		//preparer la declaracion
		Statement declarar = coneccion.conectar().createStatement();
		
		String sql = "SELECT * FROM Usuario WHERE codigo = "+codigo+";";
		
		//ejecutar la decalracion
		ResultSet resultado = declarar.executeQuery(sql);
		
		
		//llenar el objeto dependiendo su tipo administrador O cliente
		UsuarioDTO usuario = null;
		
		if(resultado.next())
		{
			if(resultado.getString("tipo").equals("co.com.restaurante.DTO.ClienteDTO"))
			{
				usuario = new ClienteDTO(resultado.getInt("codigo"), resultado.getString("correo"), 
						resultado.getString("contraseña"), resultado.getInt("estado"));
			}
			else if(resultado.getString("tipo").equals("co.com.restaurante.DTO.AdministradorDTO"))
			{
				usuario = new AdministradorDTO(resultado.getInt("codigo"), resultado.getString("correo"), 
						resultado.getString("contraseña"), resultado.getInt("estado"));
			}
		}
		
		return usuario;
	}

	@Override
	public ArrayList<UsuarioDTO> traerLista() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean desabilitar(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
