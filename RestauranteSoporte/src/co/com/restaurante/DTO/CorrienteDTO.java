package co.com.restaurante.DTO;

/**clase que representa el plato corriente y ereda de ProductoDTO
 * @author wdavi
 *
 */
public class CorrienteDTO extends ProductoDTO
{
	
	/**constructor 1 de la clase CorrienteDTO SIN CODIGO
	 * @param codigoPedido
	 * @param nombre
	 * @param disponibilidad
	 * @param precio
	 * @param costo
	 * @param tiempoPreparacion
	 * @param Descripcion
	 * @param tipo
	 */
	public CorrienteDTO(int codigoPedido, String nombre, String disponibilidad, double precio, 
			double costo, double tiempoPreparacion, String Descripcion, int estado, String tipo)
	{
		super(codigoPedido, nombre, disponibilidad, precio, costo, tiempoPreparacion, Descripcion, 
				estado, tipo);
	}
	
	
	/**onstructor 1 de la clase CorrienteDTO CON CODIGO
	 * @param codigo
	 * @param codigoPedido
	 * @param nombre
	 * @param disponibilidad
	 * @param precio
	 * @param costo
	 * @param tiempoPreparacion
	 * @param Descripcion
	 * @param tipo
	 */
	public CorrienteDTO(int codigo, int codigoPedido, String nombre, String disponibilidad, double precio, 
			double costo, double tiempoPreparacion, String Descripcion, int estado, String tipo)
	{
		super(codigoPedido, nombre, disponibilidad, precio, costo, tiempoPreparacion, Descripcion, 
				estado, tipo);
		this.codigo = codigo;
	}
}
