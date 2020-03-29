package calificaciones;

import org.junit.Assert;
import org.junit.Test;

public class PruebaNota {

	@Test
	public void creaLaNotaConValorCero() {
		
		Nota unaNota = new Nota();
		
		Assert.assertEquals(0, unaNota.obtenerValor());
	}
	
	@Test
	public void crearLaNotaConValorInicial7() {
		
		Nota unaNotaMuyBuena = new Nota(7);
		
		Assert.assertEquals(7, unaNotaMuyBuena.obtenerValor());
	}
	
	@Test
	public void asignarElValorPor10() {
		
		Nota notaExcelente = new Nota();
		
		notaExcelente.asignar(10);
		
		Assert.assertEquals(10, notaExcelente.obtenerValor());
	}
	
	@Test
	public void asignarElValorPor5() {
		
		Nota notaRegular = new Nota();
		
		notaRegular.asignar(5);
		
		Assert.assertEquals(5, notaRegular.obtenerValor());
	}
	
	@Test(expected = Error.class)
	public void noSePuedeAsignarElValor11() {
		
		Nota unaNota = new Nota();
		
		unaNota.asignar(11);
	}
	
	@Test(expected = Error.class)
	public void noSePuedeAsignarElValorMenos1() {
		
		Nota unaNota = new Nota();
		
		unaNota.asignar(-1);
	}
	
	@Test
	public void apruebaCon4() {
		
		Nota unaNota = new Nota();
		unaNota.asignar(4);
		
		Assert.assertTrue(unaNota.aprueba());
	}
	
	@Test
	public void noApruebaCon3() {
		
		Nota unaNota = new Nota();
		unaNota.asignar(3);
		
		Assert.assertFalse(unaNota.aprueba());
	}
}
