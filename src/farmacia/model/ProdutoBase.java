package farmacia.model;

import java.io.Serializable;

public abstract class ProdutoBase implements Serializable {
    private String idproduto;
    private String nomeProduto;
    private String marcaProduto;
    private FormatoProduto tipoFormato;
    private double precoUnidade;
    private int stock;
    private boolean ativo;

    public ProdutoBase() {
    }

    public ProdutoBase(String idproduto, String nomeProduto, String marcaProduto, FormatoProduto tipoFormato, double precoUnidade, int stock, boolean ativo) {
        this.idproduto = idproduto;
        this.nomeProduto = nomeProduto;
        this.marcaProduto = marcaProduto;
        this.tipoFormato = tipoFormato;
        this.precoUnidade = precoUnidade;
        this.stock = stock;
        this.ativo = ativo;
    }

    public void atualizarStock(int quantidade) {
        this.stock = quantidade;
    }

    public void atualizaEstado(boolean valor) {
        this.ativo = valor;
    }

    public String getIdproduto() {
        return this.idproduto;
    }

    public void setIdproduto(String idproduto) {
        this.idproduto = idproduto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return this.marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public FormatoProduto getTipoFormato() {
        return this.tipoFormato;
    }

    public void setTipoFormato(FormatoProduto tipoFormato) {
        this.tipoFormato = tipoFormato;
    }

    public double getPrecoUnidade() {
        return this.precoUnidade;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
