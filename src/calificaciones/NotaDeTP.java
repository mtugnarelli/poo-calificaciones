package calificaciones;

public class NotaDeTP extends Nota {

	private String grupo;
	
	public NotaDeTP() {
		
	}
	
	public NotaDeTP(int valor) {
		
		super(valor);
	}
	
	public NotaDeTP(int valor, String nombreDelGrupo) {
		
		super(valor);
		nombrarElGrupo(nombreDelGrupo);
	}
	
	public void nombrarElGrupo(String nombre) {

		grupo = nombre;
	}

	public String obtenerGrupo() {

		return grupo;
	}
}
