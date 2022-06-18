package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Reloj {
	private String nombre;
	private HashSet<UsuarioDeportista> usuariosCargados;

	public Reloj(String nombreDelModelo) {
		this.nombre=nombreDelModelo;
		usuariosCargados = new HashSet<UsuarioDeportista>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<UsuarioDeportista> getUsuariosCargados() {
		return usuariosCargados;
	}

	@Override
	public String toString() {
		return "Modelo del Reloj \n" + nombre;
	}

	public void agregarUsuarioDeportista(UsuarioDeportista usuarioDeportista) throws UsuarioCreadoConDatosIncorrectos  {
		Integer cantidadInicial= 0;
		Integer cantidadActual= 0;
		if(usuariosCargados == null) usuariosCargados.add(usuarioDeportista);
		else{
			cantidadInicial = usuariosCargados.size();
			usuariosCargados.add(usuarioDeportista);
			cantidadActual = usuariosCargados.size();
			if(cantidadInicial == cantidadActual) {
				throw new UsuarioCreadoConDatosIncorrectos("No puede agregar un usuario de nombre repetido");
			}
		}
	}
	
}
