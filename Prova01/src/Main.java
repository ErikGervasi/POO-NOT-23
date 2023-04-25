
public class Main {

	public static void main(String[] args) {

	}

	private void setOrdemServico() {
		Cliente cliente = new Cliente(1023, "João", "Rua X, 200.", "(47) 99999-9999", "C", "audi", 89002, 30);
		Produto produto = new Produto(null, null, 0);

		System.out.println("O cliente " + cliente.getNome() + " possui um veiculo do tipo " + cliente.getVeiculo()
				+ " deixou seu veiculo para revisão, com o numero de telefone de contato " + cliente.getTel()
				+ " gerando a ordem de serviço de número " + cliente.getNumId() + " que totalizou um valor de R$ "
				+ produto.getCalcularValor() + " sendo que o produto com maior valor é o " + produto.getMaiorValor());
	}

}
