import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Apartamento {
    private String nomeResponsavel;
    private int numero;
    private LocalDate dataEntrada;
    private List<Equipamento> equipamentos;
    
    public Apartamento(String nomeResponsavel, int numero, LocalDate dataEntrada, List<Equipamento> equipamentos) {
        this.nomeResponsavel = nomeResponsavel;
        this.numero = numero;
        this.dataEntrada = dataEntrada;
        this.equipamentos = equipamentos;
    }
    
    public float getConsumoTotal() {
        float consumoTotal = 0;
        for (Equipamento equipamento : equipamentos) {
            consumoTotal += equipamento.getConsumoMensal();
        }
        return consumoTotal / 1000; // em KW
    }
    
    public float getConsumoMedio() {
        float consumoTotal = getConsumoTotal();
        return consumoTotal / equipamentos.size();
    }
    
    public Equipamento getMaiorFonte() {
        Equipamento maiorFonte = equipamentos.get(0);
        for (Equipamento equipamento : equipamentos) {
            if (equipamento.getConsumoMensal() > maiorFonte.getConsumoMensal()) {
                maiorFonte = equipamento;
            }
        }
        return maiorFonte;
    }
    
    public List<Equipamento> getFontesConsumidoras(String descricao) {
        List<Equipamento> fontes = new ArrayList<>();
        for (Equipamento equipamento : equipamentos) {
            if (equipamento.getDescricao().equals(descricao)) {
                fontes.add(equipamento);
            }
        }
        return fontes;
    }
    
    // getters e setters
}

