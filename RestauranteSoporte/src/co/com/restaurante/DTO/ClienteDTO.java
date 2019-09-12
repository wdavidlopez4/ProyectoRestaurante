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
	 * @param estado
	 */
	public ClienteDTO(String correo, String contrase�a, int estado)
	{
		super(correo, contrase�a, estado);
	}
	
	/**constructor 2 de la clase ClienteDTO CON CODIGO
	 * @param codigo
	 * @param correo
	 * @param contrace�a
	 *  @param estado
	 */
	public ClienteDTO(int codigo, String correo, String contrace�a, int estado)
	{
		super(correo, contrace�a, estado);
		this.codigo = codigo;
	}
}
