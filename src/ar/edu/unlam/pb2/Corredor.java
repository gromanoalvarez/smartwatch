package ar.edu.unlam.pb2;

public class Corredor extends UsuarioDeportista{
	
	private Double ritmo; //(minutos que se demora en completar un kilómetro)
	
	public Corredor(String nombre, Integer edadActual, Double pesoActual, Double alturaActual, Integer pasosDiarios) {
		super(nombre, edadActual, pesoActual, alturaActual, pasosDiarios);
		ritmo=6.0;
	}

	@Override
	public void iniciarRecorrido() {
		super.distanciaRecorrida++;
		super.tiempoTranscurridoMinutosYSegundos++;
	}

	public Double getRitmo() {
		return ritmo;
	}

	public void setRitmo(Double ritmo) {
		this.ritmo = ritmo;
	}
	
	

}
