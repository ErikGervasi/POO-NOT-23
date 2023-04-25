import java.util.ArrayList;

public class Cliente {

	private int numId;
	private String nome;
	private String end;
	private String tel;
	private String veiculo;
	private String marca;
	private int km;
	private int eixos;
	ArrayList<Cliente> cliente = new ArrayList<>();

	public Cliente(int numId, String nome, String endereco, String tel, String veiculo, String marca, int km,
			int eixos) {
		this.numId = numId;
		setNome(nome);
		this.end = endereco;
		this.tel = tel;
		setVeiculo(veiculo);
		this.marca = marca;
		setKm(km);
		this.eixos = eixos;

	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public  String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() < 2) {
			System.out.println("Digite um nome valido!");
		} else {
			this.nome = nome;
		}
	}

	public String getEndereco() {
		return end;
	}

	public void setEndereco(String endereco) {
		this.end = endereco;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		String c = "Caminhao";
		String d = "Carreta";
		String e = "Carreta bitrem";

		if (veiculo == "c") {
		}
		this.veiculo = c;

		if (veiculo == "d") {
		}
		this.veiculo = d;

		if (veiculo == "e") {
		}
		this.veiculo = e;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		if (km < 0) {
			System.out.println("Insira um valor valido!");
		} else {
			this.km = km;
		}
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	


}
