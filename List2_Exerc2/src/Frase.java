
public class Frase {

	public static void main(String[] args) {

	}
	
	
	private String texto;
	
	public Frase(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String[] decompor() {
		return this.texto.split(" ");
	}
}
