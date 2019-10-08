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
	 * @param estado
	 */
	public CorrienteDTO(int codigoPedido, String nombre, String disponibilidad, double precio, 
			double costo, double tiempoPreparacion, String descripcion, int estado)
	{
		super(codigoPedido, nombre, disponibilidad, precio, costo, tiempoPreparacion, descripcion, 
				estado);
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
	 * @param estado
	 */
	public CorrienteDTO(int codigo, int codigoPedido, String nombre, String disponibilidad, double precio, 
			double costo, double tiempoPreparacion, String descripcion, int estado)
	{
		super(codigoPedido, nombre, disponibilidad, precio, costo, tiempoPreparacion, descripcion, 
				estado);
		this.codigo = codigo;
	}
}
