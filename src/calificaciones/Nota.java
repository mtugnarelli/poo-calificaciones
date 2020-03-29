package calificaciones;

public class Nota {

	private int valor = 0;
	
	public Nota() {
	}
	
	public Nota(int valorInicial) {

		asignar(valorInicial);
	}
	
	public int obtenerValor() {
		
		return valor;
	}
	
	public void asignar(int nuevoValor) {
	
		validar(nuevoValor);
		valor = nuevoValor;
	}
	
	private void validar(int nuevoValor) {

		if ((nuevoValor < 0) || (nuevoValor > 10)) {
			throw new Error("Valor de nota incorrecto: " + nuevoValor);
		}
	}

	public boolean aprueba() {
		
		return valor >= 4;
	}
}
