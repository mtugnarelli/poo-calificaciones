package calificaciones;

import org.junit.Assert;
import org.junit.Test;

public class PruebaNotaDeTP {

	@Test
	public void creaLaNotaDeTPConValorCero() {
		
		NotaDeTP notaDeTP = new NotaDeTP();
		
		int valor = notaDeTP.obtenerValor();
		
		Assert.assertEquals(0, valor);
	}
	
	@Test
	public void creaLaNotaDeTPConValorInicial6() {
		
		NotaDeTP notaDeTP = new NotaDeTP(6);
		
		Assert.assertEquals(6, notaDeTP.obtenerValor());
	}
	
	@Test
	public void creaLaNotaDeTPConValorInicial5ParaElGrupoAlgo2() {
		
		NotaDeTP notaDeTP = new NotaDeTP(5, "Algo2");
		
		Assert.assertEquals(5, notaDeTP.obtenerValor());
		Assert.assertEquals("Algo2", notaDeTP.obtenerGrupo());
	}
	
	@Test
	public void asignarValor8() {
		
		NotaDeTP notaDeTP = new NotaDeTP();
		
		notaDeTP.asignar(8);
		
		Assert.assertEquals(8, notaDeTP.obtenerValor());
	}

	@Test
	public void nombrarElGrupo() {
		
		NotaDeTP notaGrupal = new NotaDeTP();
		
		notaGrupal.nombrarElGrupo("Coders");
		
		Assert.assertEquals("Coders", notaGrupal.obtenerGrupo());
	}
	
	@Test
	public void apruebaCon8() {
		
		NotaDeTP notaDeTP = new NotaDeTP();
		
		notaDeTP.asignar(8);
		
		Assert.assertTrue(notaDeTP.aprueba());
	}
}
