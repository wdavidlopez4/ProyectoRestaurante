package co.com.restaurante.DTO;

public class EjecutivoDTO extends ProductoDTO
{
	/**
	 * atributo que representa el precio extra
	 */
	private double precioExtra;
	
	
	/**constructor 1 de la clase CorrienteDTO SIN CODIGO
	 * @param codigoPedido
	 * @param nombre
	 * @param disponibilidad
	 * @param precio
	 * @param costo
	 * @param tiempoPreparacion
	 * @param Descripcion
	 * @param estado
	 * @param precioExtra
	 * @param tipo
	 */
	public EjecutivoDTO(int codigoPedido, String nombre, String disponibilidad, double precio, 
			double costo, double tiempoPreparacion, String Descripcion, int estado, 
			double precioExtra, String tipo)
	{
		super(codigoPedido, nombre, disponibilidad, precio, costo, tiempoPreparacion, Descripcion, 
				estado, tipo);
		this.precioExtra = precioExtra;
	}
	
	/**constructor 1 de la clase CorrienteDTO CON CODIGO
	 * @param codigo
	 * @param codigoPedido
	 * @param nombre
	 * @param disponibilidad
	 * @param precio
	 * @param costo
	 * @param tiempoPreparacion
	 * @param Descripcion
	 * @param estado
	 * @param precioExtra
	 * @param tipo
	 */
	public EjecutivoDTO(int codigo, int codigoPedido, String nombre, String disponibilidad, double precio, 
			double costo, double tiempoPreparacion, String Descripcion, int estado, 
			double precioExtra, String tipo)
	{
		super(codigoPedido, nombre, disponibilidad, precio, costo, tiempoPreparacion, Descripcion, 
				estado, tipo);
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
