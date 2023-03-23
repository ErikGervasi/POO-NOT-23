package exerc2;

public class Pessoa {

	public static void main(String[] args) {
	
	}
	private String nome;
	private String dataNascimento;
	private String estadoCivil;
	private char sexo;

	public Pessoa(String nome, char sexo, String dataNascimento) {
		setNome(nome);
		setSexo(sexo);
		this.dataNascimento = dataNascimento;
		this.estadoCivil  = "solteiro";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if(sexo == 'F' || sexo == 'M')
		this.sexo = sexo;
	}
}
