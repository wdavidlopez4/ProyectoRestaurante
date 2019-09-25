package co.com.restaurante.DTO;

public abstract class ProductoDTO
{
	/**
	 * cosntante que representa la disponibilidad dañada
	 */
	public static final String DISPONIBILIDAD_DANIADA ="DISPONIBILIDAD DAÑADA";
	
	/**
	 * cosntante que representa la disponibilidad disponible
	 */
	public static final String DISPONIBILIDAD_DISPONIBLE ="DISPONIBILIDAD DISPONIBLE";
	
	/**
	 * cosntante que representa la disponibilidad no disponible
	 */
	public static final String DISPONIBILIDAD_NO_DISPONIBLE ="DISPONIBILIDAD NO DISPONIBLE";
	
	/**
	 * atributo que representa el codigo del producto PK
	 */
	protected int codigo;
	
	/**
	 * atributo que representa el codigo de pedido FK
	 */
	protected int codigoPedido;
	
	/**
	 * atributo que representa el nombre del producto
	 */
	protected String nombre;
	
	/**
	 * atributo que representa la disponibilidad del producto
	 */
	protected String disponibilidad;
	
	/**
	 * atributo que representa el precio del producto
	 */
	protected double precio;
	
	/**
	 * atributo que representa el costo del producto
	 */
	protected double costo;
	
	/**
	 * atributo que representa el tiempoPreparacion del producto
	 */
	protected double tiempoPreparacion;
	
	/**
	 * atributo que representa el descripcion del producto
	 */
	protected String descripcion;
	
	/**
	 * atributo que representa el estado
	 */
	protected int estado;
	
	
	/**
	 * @param codigoPedido
	 * @param nombre
	 * @param disponibilidad
	 * @param precio
	 * @param costo
	 * @param tiempoPreparacion
	 * @param descripcion
	 * @param estado
	 */
	public ProductoDTO(int codigoPedido, String nombre, String disponibilidad, double precio, 
			double costo, double tiempoPreparacion, String descripcion, int estado)
	{
		this.codigoPedido = codigoPedido;
		this.nombre = nombre;
		this.disponibilidad = disponibilidad;
		this.precio = precio;
		this.costo = costo;
		this.tiempoPreparacion = tiempoPreparacion;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	/**
	 * @return codigo pk
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return codigoPedido FK
	 */
	public int getCodigoPedido() {
		return codigoPedido;
	}

	/**
	 * @param codigoPedido fk
	 */
	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return disponibilidad
	 */
	public String getDisponibilidad() {
		return disponibilidad;
	}

	/**
	 * @param disponibilidad
	 */
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	/**
	 * @return precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return costo
	 */
	public double getCosto() {
		return costo;
	}

	/**
	 * @param costo
	 */
	public void setCosto(double costo) {
		this.costo = costo;
	}

	/**
	 * @return tiempo preparacion
	 */
	public double getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	/**
	 * @param tiempoPreparacion
	 */
	public void setTiempoPreparacion(double tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	/**
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
