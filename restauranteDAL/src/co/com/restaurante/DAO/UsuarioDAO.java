package co.com.restaurante.DAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.com.restaurante.Coneccion.Coneccion;
import co.com.restaurante.Coneccion.IConeccion;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UsuarioDTO buscarUnoObjeto(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
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
