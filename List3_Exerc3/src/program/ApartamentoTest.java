package program;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ApartamentoTest {
    
    private Apartamento apartamento;
    
    @Before
    public void setUp() {
        apartamento = new Apartamento("João da Silva", 101, "22/09/2015");
        apartamento.adicionarFonteConsumidora(new FonteConsumidora("Geladeira Biplex", 650));
        apartamento.adicionarFonteConsumidora(new FonteConsumidora("TV 20pol", 45));
        apartamento.adicionarFonteConsumidora(new FonteConsumidora("Freezer", 60));
        apartamento.adicionarFonteConsumidora(new FonteConsumidora("Chuveiro", 4000));
    }

    @Test
    public void testGetConsumoTotal() {
        float consumoTotalEsperado = 4.75f;
        float consumoTotalReal = apartamento.getConsumoTotal();
        assertEquals(consumoTotalEsperado, consumoTotalReal, 0.01);
    }

    @Test
    public void testGetConsumoMedio() {
        float consumoMedioEsperado = 1188.75f;
        float consumoMedioReal = apartamento.getConsumoMedio();
        assertEquals(consumoMedioEsperado, consumoMedioReal, 0.01);
    }

    @Test
    public void testGetMaiorFonte() {
        FonteConsumidora maiorFonteEsperada = new FonteConsumidora("Chuveiro", 4000);
        FonteConsumidora maiorFonteReal = apartamento.getMaiorFonte();
        assertEquals(maiorFonteEsperada.getDescricao(), maiorFonteReal.getDescricao());
        assertEquals(maiorFonteEsperada.getConsumoMensal(), maiorFonteReal.getConsumoMensal());
    }

    @Test
    public void testGetFontesConsumidoras() {
        String descricaoBuscada = "Chuveiro";
        List<FonteConsumidora> fontesEsperadas = List.of(new FonteConsumidora("Chuveiro", 4000));
        List<FonteConsumidora> fontesReais = apartamento.getFontesConsumidoras(descricaoBuscada);
        assertEquals(fontesEsperadas.size(), fontesReais.size());
        for (int i = 0; i < fontesEsperadas.size(); i++) {
            FonteConsumidora fonteEsperada = fontesEsperadas.get(i);
            FonteConsumidora fonteReal = fontesReais.get(i);
            assertEquals(fonteEsperada.getDescricao(), fonteReal.getDescricao());
            assertEquals(fonteEsperada.getConsumoMensal(), fonteReal.getConsumoMensal());
        }
    }
}
