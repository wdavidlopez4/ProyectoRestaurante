package co.com.restaurante.DTO;

/**
 * clase concreta que representa la mesa personal y que ereda de ComederoDTO
 * @author wdavi
 *
 */
public class MesaPersonalDTO extends ComederoDTO
{
	/**constructor 1 de la clase mesaPersonalDTO SIN CODIGO
	 * @param cantidadSillas
	 * @param posicion
	 */
	public MesaPersonalDTO(int cantidadSillas, int posicion, int estado)
	{
		super(cantidadSillas, posicion, estado);
	}
	
	
	/**constructor 1 de la clase mesaPersonalDTO CON CODIGO
	 * @param codigo
	 * @param cantidadSillas
	 * @param posicion
	 */
	public MesaPersonalDTO(int codigo, int cantidadSillas, int posicion, int estado)
	{
		super(cantidadSillas, posicion, estado);
		this.codigo = codigo;
	}
}
