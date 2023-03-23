package windowBuilder_Test;

public class App {

	public static void main(String[] args) {

	}
	private String nome;
	private int idade;
	private String cpf;



	public App(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		if(idade >= 1) {
			this.idade = idade;
		}
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
