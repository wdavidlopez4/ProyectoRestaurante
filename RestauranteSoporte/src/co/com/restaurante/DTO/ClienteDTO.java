package co.com.restaurante.DTO;

/**clase concreta que ereda de UsuarioDTO y representa el cliente dto
 * @author wdavi
 *
 */
public class ClienteDTO extends UsuarioDTO
{
	/**constructor 1 de clase ClienteDTO SIN CODIGO
	 * @param correo
	 * @param contraseña
	 * @param estado
	 */
	public ClienteDTO(String correo, String contraseña, int estado)
	{
		super(correo, contraseña, estado);
	}
	
	/**constructor 2 de la clase ClienteDTO CON CODIGO
	 * @param codigo
	 * @param correo
	 * @param contraceña
	 *  @param estado
	 */
	public ClienteDTO(int codigo, String correo, String contraceña, int estado)
	{
		super(correo, contraceña, estado);
		this.codigo = codigo;
	}
}
