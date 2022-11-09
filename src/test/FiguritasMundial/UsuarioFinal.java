package test.FiguritasMundial;

import java.util.Set;
import java.util.TreeSet;

public class UsuarioFinal extends Usuario {

	private Set<Figurita> listaFiguritas;
	
	public UsuarioFinal(String nombre, Integer edad, Integer dni) {
		super(nombre, edad, dni);
		listaFiguritas = new TreeSet<Figurita>();
	}

	public void agregarFigurita(Figurita figurita) {
		listaFiguritas.add(figurita);
	}

	public Figurita buscarFiguritaPorPrecio(Double precio) {
		Figurita figuritaABuscar = new Figurita(null, null, null, null, null);
			for (Figurita figurita : listaFiguritas) {
				if(figurita.getPrecio().equals(precio)) {
					figuritaABuscar = figurita;
						return figuritaABuscar;
			}
		}
		return null;
	}

	public Set<Figurita> getListaFiguritas() {
		return listaFiguritas;
	}

	public Integer getNumeroDeFiguritasEnLaLista() {
		return listaFiguritas.size();
	}
	
	
}
