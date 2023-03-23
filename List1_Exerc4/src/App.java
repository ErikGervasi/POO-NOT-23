
public class App {

	public static void main(String[] args) {
		
		Cidade gaspar = new Cidade();
		gaspar.setNome( "Gaspar" );
		gaspar.setUf( "SC" );
		gaspar.setPopulacaoMasculina( 28141 );
		
		Cidade indaial = new Cidade();
		indaial.setNome( "Indaial" );
		indaial.setPopulacaoFeminina( 25844 );
		indaial.setCalculado( true );
		
		Cidade blumenau = new Cidade( "Blumenau", 154580, 165420 );


	}

}
