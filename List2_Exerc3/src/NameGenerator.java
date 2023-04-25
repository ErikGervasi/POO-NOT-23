
public class NameGenerator {

public static void main(String[] args) {
	
}
    
    public static String generateStarWarsName(String[] entrada){
        String[] nomeCompleto = entrada[0].split(" ");
        String sobrenomeMae = entrada[1];
        String cidade = entrada[2];

        String primeiroNome = nomeCompleto[0];
        String sobrenome = nomeCompleto[nomeCompleto.length-1];

        String nomeStarWars = sobrenome.substring(0,3) + primeiroNome.substring(0,2).toLowerCase();
        String sobrenomeStarWars = sobrenomeMae.substring(0,2) + cidade.substring(0,3).toLowerCase();

        return nomeStarWars + " " + sobrenomeStarWars;
    }

}