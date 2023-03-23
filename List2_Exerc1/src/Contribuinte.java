
public class Contribuinte {

	public static void main(String[] args) {

	}
	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;
	
	
	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaAnual(rendaAnual);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		if(uf.equals("RS") || uf.equals("SC") || uf.equals("PR")) {
		this.uf = uf;
		}
	}


	public double getRendaAnual() {
		return rendaAnual;
	}


	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual >= 0) {
			this.rendaAnual = rendaAnual;
		}
  }
	public double getAliquota() {
		double aliquota = 0;
		if (this.rendaAnual > 35000) {
			aliquota = 0.3; // 30%
		}
		else if (this.rendaAnual >= 25001) {
			aliquota = 0.275; // 27,5%
		}
		else if (this.rendaAnual >= 9001) {
			aliquota = 0.15; // 15%
		}
		else if (this.rendaAnual >= 4001) {
			aliquota = 0.058; // 5,8%
		}
		return aliquota;
	}
	
	public double calcularImposto() {
		return this.rendaAnual * this.getAliquota();
	}
}
