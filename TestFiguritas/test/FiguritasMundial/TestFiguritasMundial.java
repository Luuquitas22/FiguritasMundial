package test.FiguritasMundial;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class TestFiguritasMundial {

	@Test
	public void queSePuedaCrearUnaFigurita() {
	
	Figurita figurita = new Figurita(125, "H", Seleccion.ARGENTINA, "Messi", 2000.0);	
	
	Integer resultadoEsperado = 125;
	
	assertEquals(resultadoEsperado, figurita.getCodigoUnico());
		
	}
	
	@Test
	public void queSePuedaCrearUnUsuarioAdmistrador() {
	
		UsuarioAdministrador usuarioAdministrador = new UsuarioAdministrador("Juan", 25, 38758022);
		
		Integer resultadoEsperado = 38758022;
		
		assertEquals(resultadoEsperado, usuarioAdministrador.getDni());
				
	}
	
	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
	
		UsuarioFinal usuarioFinal = new UsuarioFinal("Pedro", 42, 20125496);
		
		Integer resultadoEsperado = 20125496;
		
		assertEquals(resultadoEsperado, usuarioFinal.getDni());
				
	}
	
	@Test
	public void queUnUsuarioAdministradorPuedaAgregarUnaFigurita() {
	
		UsuarioAdministrador usuarioAdministrador = new UsuarioAdministrador("Juan", 25, 38758022);
		
		Figurita figurita = new Figurita(125, "H", Seleccion.ARGENTINA, "Messi", 2000.0);	
		
		usuarioAdministrador.agregarFigurita(figurita);
		
		Figurita resultadoEsperado = figurita;
		
		Figurita resultadoObtenido = usuarioAdministrador.buscarFiguritaPorPrecio(2000.0);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
				
	}
	
	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() {
	
		UsuarioFinal usuarioFinal = new UsuarioFinal("Pedro", 42, 20125496);
		
		Figurita figurita = new Figurita(125, "H", Seleccion.ARGENTINA, "Messi", 2000.0);	
		
		usuarioFinal.agregarFigurita(figurita);
		
		Figurita resultadoEsperado = figurita;
		
		Figurita resultadoObtenido = usuarioFinal.buscarFiguritaPorPrecio(2000.0);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas() {
	
		UsuarioFinal usuarioFinal = new UsuarioFinal("Pedro", 42, 20125496);
		
		Figurita figurita = new Figurita(125, "H", Seleccion.ARGENTINA, "Messi", 22000.0);	
		Figurita figurita2 = new Figurita(10, "A", Seleccion.ALEMANIA, "Shnadier", 9000.0);	
		Figurita figurita3 = new Figurita(13, "B", Seleccion.BRASIL, "Neymar", 1900.0);	
		Figurita figurita4 = new Figurita(15, "D", Seleccion.CHILE, "Vidal", 8000.0);	
		Figurita figurita5 = new Figurita(5, "H", Seleccion.COLOMBIA, "Cuadrado", 14000.0);	
		Figurita figurita6 = new Figurita(20, "A", Seleccion.INGLATERRA, "Rooney", 12000.0);	
		Figurita figurita7 = new Figurita(7, "G", Seleccion.ARGENTINA, "Aguero", 15000.0);	
		
		usuarioFinal.agregarFigurita(figurita);
		usuarioFinal.agregarFigurita(figurita2);
		usuarioFinal.agregarFigurita(figurita3);
		usuarioFinal.agregarFigurita(figurita4);
		usuarioFinal.agregarFigurita(figurita5);
		usuarioFinal.agregarFigurita(figurita6);
		usuarioFinal.agregarFigurita(figurita7);
		
		Iterator<Figurita> it = usuarioFinal.getListaFiguritas().iterator();
		
		Figurita resultadoEsperado = figurita;
		Figurita resultadoEsperado2 = figurita7;
		Figurita resultadoEsperado3 = figurita5;
		Figurita resultadoEsperado4 = figurita6;
		Figurita resultadoEsperado5 = figurita2;
		Figurita resultadoEsperado6 = figurita4;
		Figurita resultadoEsperado7 = figurita3;
		
		assertEquals(resultadoEsperado, it.next());
		assertEquals(resultadoEsperado2, it.next());
		assertEquals(resultadoEsperado3, it.next());
		assertEquals(resultadoEsperado4, it.next());
		assertEquals(resultadoEsperado5, it.next());
		assertEquals(resultadoEsperado6, it.next());
		assertEquals(resultadoEsperado7, it.next());
		
	}
	
	@Test
	public void queUnUsuarioAdministradorNoPuedaAgregarUnaFiguritaExistente() {
	
		UsuarioAdministrador usuarioAdministrador = new UsuarioAdministrador("Juan", 25, 38758022);
		
		Figurita figurita = new Figurita(125, "H", Seleccion.ARGENTINA, "Messi", 2000.0);	
		Figurita figurita2 = new Figurita(10, "A", Seleccion.ALEMANIA, "Shnadier", 9000.0);	
		Figurita figurita3 = new Figurita(10, "A", Seleccion.ALEMANIA, "Shnadier", 9000.0);	
		Figurita figurita4 = new Figurita(10, "A", Seleccion.ALEMANIA, "Shnadier", 9000.0);		
		Figurita figurita5 = new Figurita(5, "H", Seleccion.COLOMBIA, "Cuadrado", 14000.0);	
		Figurita figurita6 = new Figurita(20, "A", Seleccion.INGLATERRA, "Rooney", 12000.0);	
		Figurita figurita7 = new Figurita(7, "G", Seleccion.ARGENTINA, "Aguero", 15000.0);	
		
		usuarioAdministrador.agregarFigurita(figurita);
		usuarioAdministrador.agregarFigurita(figurita2);
		usuarioAdministrador.agregarFigurita(figurita3);
		usuarioAdministrador.agregarFigurita(figurita4);
		usuarioAdministrador.agregarFigurita(figurita5);
		usuarioAdministrador.agregarFigurita(figurita6);
		usuarioAdministrador.agregarFigurita(figurita7);
		
		Integer resultadoEsperado = 5; 
		
		Integer resultadoObtenido = usuarioAdministrador.getNumeroDeFiguritasEnLaLista();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
					
	}
	
	@Test
	public void queUnUsuarioFinalSiPuedaAgregarUnaFiguritaExistente() {
	
		UsuarioAdministrador usuarioAdministrador = new UsuarioAdministrador("Juan", 25, 38758022);
		
		Figurita figurita = new Figurita(125, "H", Seleccion.ARGENTINA, "Messi", 2000.0);	
		Figurita figurita2 = new Figurita(10, "A", Seleccion.ALEMANIA, "Shnadier", 9000.0);	
		Figurita figurita3 = new Figurita(10, "A", Seleccion.ALEMANIA, "Shnadier", 9000.0);	
		Figurita figurita4 = new Figurita(10, "A", Seleccion.ALEMANIA, "Shnadier", 9000.0);		
		Figurita figurita5 = new Figurita(5, "H", Seleccion.COLOMBIA, "Cuadrado", 14000.0);	
		Figurita figurita6 = new Figurita(20, "A", Seleccion.INGLATERRA, "Rooney", 12000.0);	
		Figurita figurita7 = new Figurita(7, "G", Seleccion.ARGENTINA, "Aguero", 15000.0);	
		
		usuarioAdministrador.agregarFigurita(figurita);
		usuarioAdministrador.agregarFigurita(figurita2);
		usuarioAdministrador.agregarFigurita(figurita3);
		usuarioAdministrador.agregarFigurita(figurita4);
		usuarioAdministrador.agregarFigurita(figurita5);
		usuarioAdministrador.agregarFigurita(figurita6);
		usuarioAdministrador.agregarFigurita(figurita7);
		
		Integer resultadoEsperado = 7; 
		
		Integer resultadoObtenido = usuarioAdministrador.getNumeroDeFiguritasEnLaLista();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
					
	}
	
	
	
	
	
}
