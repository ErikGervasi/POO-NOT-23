import java.time.LocalDate;

/*Primeiro, é importante definir uma classe principal para representar os telefones. Essa classe deve ter atributos para armazenar os 
  dados mencionados no enunciado, como nome do usuário, número do telefone, endereço de instalação, data de instalação, tipo de linha (residencial,
  comercial ou especializada), quantidade de ocorrências (apenas para linhas especializadas), ramo de atividade (apenas para linhas comerciais),
  conexão com a internet e valor básico a pagar.*/

public class Telefonia {

	private String nome;
	private String numeroTelefone;
	private String endereço;
	private LocalDate dataInstalacao;
	private String ramoAtividade;
	private double residencial;
	private double comercial;
	private double especializada;
	private int ocorrencias;

	public Telefonia(String nome, String numeroTelefone, String endereço, LocalDate dataInstalacao,
			String ramoAtividade) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.endereço = endereço;
		this.dataInstalacao = dataInstalacao;
		this.ramoAtividade = ramoAtividade;
		this.residencial = residencial;
		this.comercial = comercial;
		this.especializada = especializada;
		this.ocorrencias = ocorrencias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public LocalDate getDataInstalacao() {
		return dataInstalacao;
	}

	public void setDataInstalacao(LocalDate dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	public double getResidencial() {
		return residencial;
	}

	public void setResidencial(double residencial) {
		this.residencial = 25.00;
	}

	public double getComercial() {
		return comercial;
	}

	public void setComercial(double comercial) {
		LocalDate dataLimite = LocalDate.of(2018, 1, 2);

		if (dataInstalacao.isAfter(dataLimite)) {
			this.comercial = 27.50;
		} else {
			this.comercial = 37.50;
		}
	}

	public double getEspecializada() {
		return especializada;
	}

	public void setEspecializada(double especializada) {

		if (this.getOcorrencias() > 0 && this.getOcorrencias() < 1001) {
			this.especializada = 56.40;
			
			} else if (this.getOcorrencias() >= 1001 && this.getOcorrencias() < 5001) {
				this.especializada = 67.80;
			
				} else if (this.getOcorrencias() >= 5001 && this.getOcorrencias() < 10001) {
						this.especializada = 98.50;
			
					} else if (this.getOcorrencias() >= 10001 && this.getOcorrencias() < 50001) {
							this.especializada = 123.90;
						} else
								this.especializada = 187.82;
	}

	public int getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(int ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

}