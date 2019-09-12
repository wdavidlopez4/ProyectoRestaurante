package co.com.restaurante.DTO;

/**clase abstracta que representa los Usuarion DTO
 * @author wdavi
 *
 */
public abstract class UsuarioDTO 
{
	/**
	 * constante que representa es estado habilitado 
	 */
	public static final int ESTADO_HABILITADO = 1;
	
	/**
	 * constante que representa es estado inhabilitado 
	 */
	public static final int ESTADO_INHABILITADO = 0;
	
	/**
	 * atributo que representa el codigo del usuario PK
	 */
	protected int codigo;
	
	/**
	 * atributo que representa el correo del usuario
	 */
	protected String correo;
	
	/**
	 * atributo que representa la contraseña del usuario
	 */
	protected String contraseña;
	
	/**
	 * atributo que representa el estado
	 */
	protected int estado;
	
	/**
	 * contructor
	 */
	public UsuarioDTO(String correo, String contraseña, int estado)
	{
		this.correo = correo;
		this.contraseña = contraseña;
		this.estado = estado;
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
	 * @return contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	/**
	 * @return estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
