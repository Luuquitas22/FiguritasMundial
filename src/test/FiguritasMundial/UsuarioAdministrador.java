package test.FiguritasMundial;

import java.util.HashSet;
import java.util.Set;

public class UsuarioAdministrador extends Usuario {

	public Set<Figurita> listaFiguritas;
	
	public UsuarioAdministrador(String nombre, Integer edad, Integer dni) {
		super(nombre, edad, dni);
		listaFiguritas = new HashSet<Figurita>();
		
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
