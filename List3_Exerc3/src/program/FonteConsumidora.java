package program;


public class FonteConsumidora {
    private String descricao;
    private int consumoMensal;

    public FonteConsumidora(String descricao, int consumoMensal) {
        this.descricao = descricao;
        this.consumoMensal = consumoMensal;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getConsumoMensal() {
        return consumoMensal;
    }
}