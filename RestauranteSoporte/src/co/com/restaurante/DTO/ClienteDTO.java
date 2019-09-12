package co.com.restaurante.DTO;

/**clase concreta que ereda de UsuarioDTO y representa el cliente dto
 * @author wdavi
 *
 */
public class ClienteDTO extends UsuarioDTO
{
	/**constructor 1 de clase ClienteDTO SIN CODIGO
	 * @param correo
	 * @param contrase�a
	 */
	public ClienteDTO(String correo, String contrase�a)
	{
		super(correo, contrase�a);
	}
	
	/**constructor 2 de la clase ClienteDTO CON CODIGO
	 * @param codigo
	 * @param correo
	 * @param contrace�a
	 */
	public ClienteDTO(int codigo, String correo, String contrace�a)
	{
		super(correo, contrace�a);
		this.codigo = codigo;
	}
}
