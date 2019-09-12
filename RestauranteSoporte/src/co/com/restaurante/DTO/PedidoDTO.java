package co.com.restaurante.DTO;

/**clase concreta que representa el Pedido DTO
 * @author wdavi
 *
 */
public class PedidoDTO 
{
	/**
	 * atributo que representa el codigo PK
	 */
	private int codigo;
	
	/**
	 * atributo que representa el codigo del usuario FK
	 */
	private int codigoUsuario;
	
	/**
	 * atributo que representa el codigo del comedero FK
	 */
	private int codigoComedero;
	
	/**
	 * atributo que representa el total a pagar
	 */
	private Double totalAPagar;
	
	/**
	 * atributo que representa el total productos
	 */
	private int totalProductos;
	
	/**construtor 1 de la clase PedidoDTO SIN CODIGO
	 * @param codigoUsuario
	 * @param codigoComedero
	 * @param totalAPagar
	 * @param totalProductos
	 */
	public PedidoDTO(int codigoUsuario, int codigoComedero, Double totalAPagar, int totalProductos)
	{
		this.codigoUsuario = codigoUsuario;
		this.codigoComedero = codigoComedero;
		this.totalAPagar = totalAPagar;
		this.totalProductos = totalProductos;
	}
	
	/**construtor 1 de la clase PedidoDTO CODIGO CODIGO 
	 * @param codigo
	 * @param codigoUsuario
	 * @param codigoComedero
	 * @param totalAPagar
	 * @param totalProductos
	 */
	public PedidoDTO(int codigo, int codigoUsuario, int codigoComedero, Double totalAPagar, int totalProductos)
	{
		this.codigo = codigo;
		this.codigoUsuario = codigoUsuario;
		this.codigoComedero = codigoComedero;
		this.totalAPagar = totalAPagar;
		this.totalProductos = totalProductos;
	}

	/**
	 * @return codigo PK
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo PK
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return codigo usuario FK
	 */
	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * @param codigoUsuario FK
	 */
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	/**
	 * @return codigoComedero FK
	 */
	public int getCodigoComedero() {
		return codigoComedero;
	}

	/**
	 * @param codigoComedero FK
	 */
	public void setCodigoComedero(int codigoComedero) {
		this.codigoComedero = codigoComedero;
	}

	/**
	 * @return total a pagar
	 */
	public Double getTotalAPagar() {
		return totalAPagar;
	}

	/**
	 * @param totalAPagar
	 */
	public void setTotalAPagar(Double totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	/**
	 * @return total productos
	 */
	public int getTotalProductos() {
		return totalProductos;
	}

	/**
	 * @param totalProductos
	 */
	public void setTotalProductos(int totalProductos) {
		this.totalProductos = totalProductos;
	}
	
	
}
