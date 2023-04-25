import java.util.ArrayList;

public class Produto {

	private int hora = 0;
	private boolean guincho;
	private String descPdt;
	private String medida;
	private int qtd;
	private double valorPdt;
	ArrayList<Produto> pdt = new ArrayList<>();

	public Produto(String descPdt, String medida, double valorPdt) {
		this.descPdt = descPdt;
		this.medida = medida;
		this.valorPdt = valorPdt;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public boolean isGuincho() {
		return guincho;
	}

	public void setGuincho(boolean guincho) {
		this.guincho = guincho;
	}

	public String getDescPdt() {
		return descPdt;
	}

	public void setDescPdt(String descPdt) {
		this.descPdt = descPdt;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getValorPdt() {
		return valorPdt;
	}

	public void setValorPdt(double valorPdt) {
		this.valorPdt = valorPdt;
	}

	public double getCalcularValor() {

		double valorPdt = 0;
		for (Produto produto : pdt) {

			valorPdt = getQtd() * getValorPdt();
		}

		return valorPdt;

	}
	
	public double getMaiorValor() {
		double maiorValor = 0;
		if(maiorValor == 0) {
			
		}
		return maiorValor;
		
	}

}
