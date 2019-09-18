package co.com.restaurante.DTO;

/**clase abstracta que representa el comederoDTO
 * @author wdavi
 *
 */
public abstract class ComederoDTO 
{
	/**
	 * constante que representa el estado habilitado
	 */
	public static final int ESTADO_HABILITADO =1;
	
	/**
	 * constante que representa el estado inhabilitado
	 */
	public static final int ESTADO_INHABILITADO =0;
	
	/**
	 * atributo que representa el codigo del comederoDTO
	 */
	protected int codigo;
	
	/**
	 * atributo que representa la cantidad de sillas que tiene el comedero
	 */
	protected int cantidadSillas;
	
	/**
	 * atributo que representa las posicion del comedero
	 */
	protected int posicion;
	
	/**
	 * atributo que representa el estado
	 */
	protected int estado;
	
	/**
	 * constructor 
	 */
	public ComederoDTO(int cantidadSillas, int posicion, int estado)
	{
		this.cantidadSillas = cantidadSillas;
		this.posicion = posicion;
		this.estado = estado;
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
	 * @return cantidad de sillas
	 */
	public int getCantidadSillas() {
		return cantidadSillas;
	}

	/**
	 * @param cantidadSillas
	 */
	public void setCantidadSillas(int cantidadSillas) {
		this.cantidadSillas = cantidadSillas;
	}

	/**
	 * @return posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
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
