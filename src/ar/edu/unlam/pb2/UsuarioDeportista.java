package ar.edu.unlam.pb2;

public abstract class UsuarioDeportista {

	private String nombre;
	private Integer edadActual;
	private Double pesoActual;
	private Double alturaActual;
	private Integer pasosDiarios;
	protected Double distanciaRecorrida;
	protected Double tiempoTranscurridoMinutosYSegundos;

	public UsuarioDeportista(String nombre, Integer edadActual, Double pesoActual, Double alturaActual, Integer pasosDiarios) {
		this.nombre=nombre;
		this.edadActual=edadActual;
		this.pesoActual=pesoActual;
		this.alturaActual=alturaActual;
		this.pasosDiarios=pasosDiarios;
		distanciaRecorrida=0.0;
		tiempoTranscurridoMinutosYSegundos=0.0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdadActual() {
		return edadActual;
	}

	public void setEdadActual(Integer edadActual) {
		this.edadActual = edadActual;
	}

	public Double getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(Double pesoActual) {
		this.pesoActual = pesoActual;
	}

	public Double getAlturaActual() {
		return alturaActual;
	}

	public void setAlturaActual(Double alturaActual) {
		this.alturaActual = alturaActual;
	}

	public Integer getPasosDiarios() {
		return pasosDiarios;
	}

	public void setPasosDiarios(Integer pasosDiarios) {
		this.pasosDiarios = pasosDiarios;
	}
	

	public Double getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	public void resetDistanciaRecorrida() {
		this.distanciaRecorrida = 0.0;
	}

	public Double getTiempoTranscurridoMinutosYSegundos() {
		return tiempoTranscurridoMinutosYSegundos;
	}

	@Override
	public String toString() {
		return "\t Usuario \n Nombre= " + nombre ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioDeportista other = (UsuarioDeportista) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public abstract void iniciarRecorrido();
	
	
}
