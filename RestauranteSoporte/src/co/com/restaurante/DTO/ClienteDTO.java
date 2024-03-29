package co.com.restaurante.DTO;

/**clase concreta que ereda de UsuarioDTO y representa el cliente dto
 * @author wdavi
 *
 */
public class ClienteDTO extends UsuarioDTO
{
	/**constructor 1 de clase ClienteDTO SIN CODIGO
	 * @param correo
	 * @param contraseņa
	 * @param estado
	 */
	public ClienteDTO(String correo, String contraseņa, int estado)
	{
		super(correo, contraseņa, estado);
	}
	
	/**constructor 2 de la clase ClienteDTO CON CODIGO
	 * @param codigo
	 * @param correo
	 * @param contraceņa
	 *  @param estado
	 */
	public ClienteDTO(int codigo, String correo, String contraceņa, int estado)
	{
		super(correo, contraceņa, estado);
		this.codigo = codigo;
	}
}
