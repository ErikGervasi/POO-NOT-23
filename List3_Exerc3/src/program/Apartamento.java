package program;

import java.util.ArrayList;
import java.util.List;

public class Apartamento {
	private String nomeResponsavel;
    private int numero;
    private String dataEntrada;
    private List<FonteConsumidora> fontesConsumidoras;

    public Apartamento(String nomeResponsavel, int numero, String dataEntrada) {
        this.nomeResponsavel = nomeResponsavel;
        this.numero = numero;
        this.dataEntrada = dataEntrada;
        this.fontesConsumidoras = new ArrayList<>();
    }

    public void adicionarFonteConsumidora(FonteConsumidora fonte) {
        this.fontesConsumidoras.add(fonte);
    }

    public float getConsumoTotal() {
        float consumoTotal = 0;
        for (FonteConsumidora fonte : fontesConsumidoras) {
            consumoTotal += fonte.getConsumoMensal();
        }
        return consumoTotal / 1000; // retorna em KW
    }

    public float getConsumoMedio() {
        float consumoTotal = getConsumoTotal() * 1000; // converte de KW para W
        return consumoTotal / fontesConsumidoras.size();
    }

    public FonteConsumidora getMaiorFonte() {
        FonteConsumidora maiorFonte = null;
        float consumoMaiorFonte = 0;
        for (FonteConsumidora fonte : fontesConsumidoras) {
            if (fonte.getConsumoMensal() > consumoMaiorFonte) {
                maiorFonte = fonte;
                consumoMaiorFonte = fonte.getConsumoMensal();
            }
        }
        return maiorFonte;
    }

    public List<FonteConsumidora> getFontesConsumidoras(String descricao) {
        List<FonteConsumidora> fontesEncontradas = new ArrayList<>();
        for (FonteConsumidora fonte : fontesConsumidoras) {
            if (fonte.getDescricao().equals(descricao)) {
                fontesEncontradas.add(fonte);
            }
        }
        return fontesEncontradas;
    }
}