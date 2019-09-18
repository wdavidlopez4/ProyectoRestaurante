package co.com.restaurante.DTO;

/**clase que representa la mesa personal y ereda de Comedero
 * @author wdavi
 *
 */
public class mesaPersonalDTO extends ComederoDTO
{
	/**constructor 1 de la clase mesaPersonalDTO SIN CODIGO
	 * @param cantidadSillas
	 * @param posicion
	 */
	public mesaPersonalDTO(int cantidadSillas, int posicion, int estado)
	{
		super(cantidadSillas, posicion, estado);
	}
	
	
	/**constructor 1 de la clase mesaPersonalDTO CON CODIGO
	 * @param codigo
	 * @param cantidadSillas
	 * @param posicion
	 */
	public mesaPersonalDTO(int codigo, int cantidadSillas, int posicion, int estado)
	{
		super(cantidadSillas, posicion, estado);
		this.codigo = codigo;
	}
}
