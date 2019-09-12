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
	public mesaPersonalDTO(int cantidadSillas, int posicion)
	{
		super(cantidadSillas, posicion);
	}
	
	
	/**constructor 1 de la clase mesaPersonalDTO CON CODIGO
	 * @param codigo
	 * @param cantidadSillas
	 * @param posicion
	 */
	public mesaPersonalDTO(int codigo, int cantidadSillas, int posicion)
	{
		super(cantidadSillas, posicion);
		this.codigo = codigo;
	}
}
