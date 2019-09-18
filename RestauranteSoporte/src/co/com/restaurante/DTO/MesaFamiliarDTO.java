package co.com.restaurante.DTO;

/**clase concreta que representa la mesa familiar hereda de Comedero 
 * @author wdavi
 *
 */
public class MesaFamiliarDTO extends ComederoDTO
{
	/**constructor 1 de la clase mesaFamiliarDTO SIN CODIGO
	 * @param cantidadSillas
	 * @param posicion
	 */
	public MesaFamiliarDTO(int cantidadSillas, int posicion, int estado)
	{
		super(cantidadSillas, posicion, estado);
	}
	
	
	/**constructor 1 de la clase mesaFamiliarDTO CON CODIGO
	 * @param codigo
	 * @param cantidadSillas
	 * @param posicion
	 */
	public MesaFamiliarDTO(int codigo, int cantidadSillas, int posicion, int estado)
	{
		super(cantidadSillas, posicion, estado);
		this.codigo = codigo;
	}
}
