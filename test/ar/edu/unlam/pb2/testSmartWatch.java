package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSmartWatch {

	@Test
	public void queSePuedaCrearUnReloj() {
		Reloj smartwatch = new Reloj("nuevo modelo: a7");
		assertNotNull(smartwatch);
	}
	
	@Test
	public void queSePuedaAgregarUsuarioDeportistaAlReloj() {
		Reloj smartwatch = new Reloj("nuevo modelo: a7");
		String nombre = "German";
		Integer edadActual= 31;
		Double pesoActual = 72.4d;
		Double alturaActual = 1.74;
		Integer pasosDiario = 0;
		Integer CANTIDAD_DE_USUARIOS_ESPERADOS=1;
		UsuarioDeportista german = new Caminante(nombre,  edadActual,  pesoActual,  alturaActual,  pasosDiario);
		try {
			smartwatch.agregarUsuarioDeportista( german );
		} catch (UsuarioCreadoConDatosIncorrectos e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(CANTIDAD_DE_USUARIOS_ESPERADOS, (Integer)smartwatch.getUsuariosCargados().size());
	}
	
	@Test (expected = UsuarioCreadoConDatosIncorrectos.class )
	public void queNoSePuedaAgregarUsuarioConDatosIncorrectosYLanceUnaExcepcionPropia() throws UsuarioCreadoConDatosIncorrectos {
		Reloj smartwatch = new Reloj("nuevo modelo: a7");
		String nombre = "German";
		Integer edadActual= 31;
		Double pesoActual = 72.4d;
		Double alturaActual = 1.74;
		Integer pasosDiario = 0;
		Integer CANTIDAD_DE_USUARIOS_ESPERADOS=1;
		UsuarioDeportista german = new Caminante(nombre,  edadActual,  pesoActual,  alturaActual,  pasosDiario);
		UsuarioDeportista germanRepetido = new Caminante(nombre,  edadActual,  pesoActual,  alturaActual,  pasosDiario);

		smartwatch.agregarUsuarioDeportista(german);
		smartwatch.agregarUsuarioDeportista( germanRepetido);
		assertEquals(CANTIDAD_DE_USUARIOS_ESPERADOS, (Integer)smartwatch.getUsuariosCargados().size());
	}
	
	@Test
	public void queUnUsuarioSeaCorredor() {
		Reloj smartwatch = new Reloj("nuevo modelo: a7");
		String nombre = "German";
		Integer edadActual= 31, pasosDiario = 0;
		Double pesoActual = 72.4d, alturaActual = 1.74;
		UsuarioDeportista german = new Corredor(nombre,  edadActual,  pesoActual,  alturaActual,  pasosDiario);
		try { smartwatch.agregarUsuarioDeportista(german);}
		catch (UsuarioCreadoConDatosIncorrectos e) 	{e.printStackTrace();}
		
		assertNotNull(german);
	}
	
	@Test
	public void queSePuedaConocerLaDistanciaRecorridaDeUnCorredor() {
		Reloj smartwatch = new Reloj("nuevo modelo: a7");
		String nombre = "German";
		Integer edadActual= 31, pasosDiario = 0;
		Double pesoActual = 72.4d, alturaActual = 1.74;
		UsuarioDeportista german = new Corredor(nombre,  edadActual,  pesoActual,  alturaActual,  pasosDiario);
		try { smartwatch.agregarUsuarioDeportista(german);}
		catch (UsuarioCreadoConDatosIncorrectos e) 	{e.printStackTrace();}
		Double DISTANCIA_ESPERADA = 0.0;
		Double DISTANCIA_ESPERADA_DOS = 1.0;

		assertEquals(DISTANCIA_ESPERADA, german.getDistanciaRecorrida());
		german.iniciarRecorrido();
		assertEquals(DISTANCIA_ESPERADA_DOS, german.getDistanciaRecorrida());
	}
	@Test
	public void queSePuedaConocerTiempoTranscurridoDeUnCorredor() {
		Reloj smartwatch = new Reloj("nuevo modelo: a7");
		String nombre = "German";
		Integer edadActual= 31, pasosDiario = 0;
		Double pesoActual = 72.4d, alturaActual = 1.74;
		UsuarioDeportista german = new Corredor(nombre,  edadActual,  pesoActual,  alturaActual,  pasosDiario);
		try { smartwatch.agregarUsuarioDeportista(german);}
		catch (UsuarioCreadoConDatosIncorrectos e) 	{e.printStackTrace();}
		Double TIEMPO_ESPERADO = 0.0;
		Double TIEMPO_ESPERADO_DOS = 1.0;

		assertEquals(TIEMPO_ESPERADO, german.getDistanciaRecorrida());
		german.iniciarRecorrido();
		assertEquals(TIEMPO_ESPERADO_DOS, german.getDistanciaRecorrida());
	}
	@Test
	public void queSePuedaConocerRitmoDeUnCorredor() {
		Reloj smartwatch = new Reloj("nuevo modelo: a7");
		String nombre = "German";
		Integer edadActual= 31, pasosDiario = 0;
		Double pesoActual = 72.4d, alturaActual = 1.74;
		UsuarioDeportista german = new Corredor(nombre,  edadActual,  pesoActual,  alturaActual,  pasosDiario);
		try { smartwatch.agregarUsuarioDeportista(german);}
		catch (UsuarioCreadoConDatosIncorrectos e) 	{e.printStackTrace();}
		Double RITMO_ESPERADO = 6.0;
		assertEquals(RITMO_ESPERADO, ((Corredor)german).getRitmo());
	}
	@Test
	public void queSePuedaConocerZonaDeFrecuenciaCardiacaActualDeUnCorredor() {
		//será necesario		conocer los límites de cada zona para el corredor
	}

}
