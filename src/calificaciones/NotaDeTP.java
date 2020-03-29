package calificaciones;

public class NotaDeTP extends Nota {

	private String grupo;
	
	public void nombrarElGrupo(String nombre) {

		grupo = nombre;
	}

	public String obtenerGrupo() {

		return grupo;
	}
}
