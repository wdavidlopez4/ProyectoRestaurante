package co.com.restaurante.DTO;

/**clase concreta que representa el administradorDTO y hereda de UsuarioDTO
 * @author wdavi
 *
 */
public class AdministradorDTO extends UsuarioDTO
{
	/**constructor 1 de la clase AdministradorDTO SIN CODIGO
	 * @param correo
	 * @param contrase�a
	 */
	public AdministradorDTO(String correo, String contrase�a)
	{
		super(correo, contrase�a);
	}
	
	/**constructor 2 de la clase AministradorDTO CON CODIGO
	 * @param codigo
	 * @param correo
	 * @param contrase�a
	 */
	public AdministradorDTO(int codigo, String correo, String contrase�a)
	{
		super(correo, contrase�a);
		this.codigo = codigo;
	}
}
