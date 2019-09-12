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
	 */
	public ClienteDTO(String correo, String contraseña)
	{
		super(correo, contraseña);
	}
	
	/**constructor 2 de la clase ClienteDTO CON CODIGO
	 * @param codigo
	 * @param correo
	 * @param contraceña
	 */
	public ClienteDTO(int codigo, String correo, String contraceña)
	{
		super(correo, contraceña);
		this.codigo = codigo;
	}
}
