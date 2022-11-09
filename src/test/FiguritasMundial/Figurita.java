package test.FiguritasMundial;

import java.util.Objects;

public class Figurita implements Comparable<Figurita> {

	private Integer codigoUnico;
	private String grupo;
	private Seleccion seleccion;
	private String jugador;
	private Double precio;

	public Figurita(Integer codigoUnico, String grupo, Seleccion seleccion, String jugador, Double precio) {
		this.codigoUnico = codigoUnico;
		this.grupo = grupo;
		this.seleccion = seleccion;
		this.jugador = jugador;
		this.precio = precio;
	}

	public Integer getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(Integer codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Seleccion getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(Seleccion seleccion) {
		this.seleccion = seleccion;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Figurita o) {
		return (int) (o.getPrecio() - this.getPrecio());
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoUnico, jugador, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Figurita other = (Figurita) obj;
		return Objects.equals(codigoUnico, other.codigoUnico) && Objects.equals(jugador, other.jugador)
				&& Objects.equals(precio, other.precio);
	}

	

	
	
	
	
	
}
