package farmacia.model;

import java.io.Serializable;
import java.util.List;

public class Medicamento extends ProdutoBase implements Serializable {
    private boolean receitaMedica;
    private boolean comparticipacao;
    private int taxaComparticipacao;
    private List<Patologia> patologias;
    private Consumo tipoConsumo;

    public boolean isReceitaMedica() {
        return this.receitaMedica;
    }

    public void setReceitaMedica(boolean receitaMedica) {
        this.receitaMedica = receitaMedica;
    }

    public boolean isComparticipacao() {
        return this.comparticipacao;
    }

    public void setComparticipacao(boolean comparticipacao) {
        this.comparticipacao = comparticipacao;
    }

    public int getTaxaComparticipacao() {
        return this.taxaComparticipacao;
    }

    public void setTaxaComparticipacao(int taxaComparticipacao) {
        this.taxaComparticipacao = taxaComparticipacao;
    }

    public List<Patologia> getPatologias() {
        return this.patologias;
    }

    public void setPatologias(List<Patologia> patologias) {
        this.patologias = patologias;
    }

    public Consumo getTipoConsumo() {
        return this.tipoConsumo;
    }

    public void setTipoConsumo(Consumo tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }
}

