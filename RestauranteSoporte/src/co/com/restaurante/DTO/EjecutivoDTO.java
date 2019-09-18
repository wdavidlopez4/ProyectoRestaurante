package co.com.restaurante.DTO;

public class EjecutivoDTO extends ProductoDTO
{
	private double precioExtra;
	
	/**constructor 1 de la clase CorrienteDTO SIN CODIGO
	 * @param codigoPedido
	 * @param nombre
	 * @param disponibilidad
	 * @param precio
	 * @param costo
	 * @param tiempoPreparacion
	 * @param Descripcion
	 */
	public EjecutivoDTO(int codigoPedido, double precioExtra, String nombre, String disponibilidad, double precio, 
			double costo, double tiempoPreparacion, String Descripcion, int estado)
	{
		super(codigoPedido, nombre, disponibilidad, precio, costo, tiempoPreparacion, Descripcion, 
				estado);
		this.precioExtra = precioExtra;
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
	 */
	public EjecutivoDTO(int codigo, int codigoPedido, double precioExtra, String nombre, String disponibilidad, double precio, 
			double costo, double tiempoPreparacion, String Descripcion, int estado)
	{
		super(codigoPedido, nombre, disponibilidad, precio, costo, tiempoPreparacion, Descripcion, 
				estado);
		this.codigo = codigo;
		this.precioExtra = precioExtra;
	}
	
	/**
	 * @param precioExtra
	 */
	public void setPrecioExtra(double precioExtra)
	{
		this.precioExtra = precioExtra;
	}
	
	/**
	 * @return precio extra
	 */
	public double getPrecioExtra()
	{
		return precioExtra;
	}
}
