package farmacia.model;

import java.io.Serializable;

public class FormatoProduto implements Serializable {
    private String formatoProduto;
    private String unidadeMedida;
    private double quantidade;

    public FormatoProduto() {
    }

    public FormatoProduto(String formatoProduto, String unidadeMedida, double quantidade) {
        this.formatoProduto = formatoProduto;
        this.unidadeMedida = unidadeMedida;
        this.quantidade = quantidade;
    }

    public String getFormatoProduto() {
        return this.formatoProduto;
    }

    public void setFormatoProduto(String formatoProduto) {
        this.formatoProduto = formatoProduto;
    }

    public String getUnidadeMedida() {
        return this.unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Detalhes Formato: " + formatoProduto + " " + quantidade + " " + unidadeMedida;
    }
}
