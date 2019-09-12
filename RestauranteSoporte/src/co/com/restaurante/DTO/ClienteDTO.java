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
	 */
	public ClienteDTO(String correo, String contraseņa)
	{
		super(correo, contraseņa);
	}
	
	/**constructor 2 de la clase ClienteDTO CON CODIGO
	 * @param codigo
	 * @param correo
	 * @param contraceņa
	 */
	public ClienteDTO(int codigo, String correo, String contraceņa)
	{
		super(correo, contraceņa);
		this.codigo = codigo;
	}
}
