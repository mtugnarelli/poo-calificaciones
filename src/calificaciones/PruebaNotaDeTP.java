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
}
