package co.com.restaurante.DTO;

/**clase abstracta que representa los Usuarion DTO
 * @author wdavi
 *
 */
public abstract class UsuarioDTO 
{
	/**
	 * atributo que representa el codigo del usuario PK
	 */
	protected int codigo;
	
	/**
	 * atributo que representa el correo del usuario
	 */
	protected String correo;
	
	/**
	 * atributo que representa la contrase�a del usuario
	 */
	protected String contrase�a;
	
	/**
	 * contructor
	 */
	public UsuarioDTO(String correo, String contrase�a)
	{
		this.correo = correo;
		this.contrase�a = contrase�a;
	}

	/**
	 * @return codigo;
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}

	/**
	 * @param contrase�a
	 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
}
