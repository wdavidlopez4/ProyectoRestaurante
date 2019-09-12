package co.com.restaurante.DTO;

/**clase concreta que representa el administradorDTO y hereda de UsuarioDTO
 * @author wdavi
 *
 */
public class AdministradorDTO extends UsuarioDTO
{
	/**constructor 1 de la clase AdministradorDTO SIN CODIGO
	 * @param correo
	 * @param contraseña
	 * @param estado
	 */
	public AdministradorDTO(String correo, String contraseña, int estado)
	{
		super(correo, contraseña, estado);
	}
	
	/**constructor 2 de la clase AministradorDTO CON CODIGO
	 * @param codigo
	 * @param correo
	 * @param contraseña
	 * @param estado
	 */
	public AdministradorDTO(int codigo, String correo, String contraseña, int estado)
	{
		super(correo, contraseña, estado);
		this.codigo = codigo;
	}
}
