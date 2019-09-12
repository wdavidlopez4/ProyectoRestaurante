package co.com.restaurante.DTO;

/**clase concreta que representa el administradorDTO y hereda de UsuarioDTO
 * @author wdavi
 *
 */
public class AdministradorDTO extends UsuarioDTO
{
	/**constructor 1 de la clase AdministradorDTO SIN CODIGO
	 * @param correo
	 * @param contraseņa
	 */
	public AdministradorDTO(String correo, String contraseņa)
	{
		super(correo, contraseņa);
	}
	
	/**constructor 2 de la clase AministradorDTO CON CODIGO
	 * @param codigo
	 * @param correo
	 * @param contraseņa
	 */
	public AdministradorDTO(int codigo, String correo, String contraseņa)
	{
		super(correo, contraseņa);
		this.codigo = codigo;
	}
}
