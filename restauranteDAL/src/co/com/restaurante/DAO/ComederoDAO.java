package co.com.restaurante.DAO;

import java.sql.SQLException;

import co.com.restaurante.DTO.AdministradorDTO;
import co.com.restaurante.DTO.ClienteDTO;
import co.com.restaurante.DTO.UsuarioDTO;

public class ComederoDAO {

	public static void main(String[] args) throws SQLException {
		int codigo = 1;
		String correo = "william@";
		String contraseña = "123456";
		
		UsuarioDTO usuario = new AdministradorDTO(codigo, correo, contraseña);
		
		IDAO<UsuarioDTO> dao = new UsuarioDAO();
		
		
		boolean seEjecuto = dao.eliminar(codigo);
		
		if(seEjecuto)
		{
			System.out.print(true);
		}
	}

}
