package farmacia.model;

import java.io.Serializable;
import java.util.List;

public abstract class Loja implements Serializable {
    private String nomeLoja;
    private String nifEmpresa;
    private List<Cliente> clientes;
    private List<Morada> moradas;
    private List<Encomenda> encomendas;
    private List<ProdutoBase> catalogoProdutos;

    public Loja() {
    }

    public Loja(String nomeLoja, String nifEmpresa, List<Cliente> clientes, List<Morada> moradas, List<Encomenda> encomendas, List<ProdutoBase> catalogoProdutos) {
        this.nomeLoja = nomeLoja;
        this.nifEmpresa = nifEmpresa;
        this.clientes = clientes;
        this.moradas = moradas;
        this.encomendas = encomendas;
        this.catalogoProdutos = catalogoProdutos;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getNifEmpresa() {
        return this.nifEmpresa;
    }

    public void setNifEmpresa(String nifEmpresa) {
        this.nifEmpresa = nifEmpresa;
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Morada> getMoradas() {
        return this.moradas;
    }

    public void setMoradas(List<Morada> moradas) {
        this.moradas = moradas;
    }

    public List<Encomenda> getEncomendas() {
        return this.encomendas;
    }

    public void setEncomendas(List<Encomenda> encomendas) {
        this.encomendas = encomendas;
    }

    public List<ProdutoBase> getCatalogoProdutos() {
        return this.catalogoProdutos;
    }

    public void setCatalogoProdutos(List<ProdutoBase> catalogoProdutos) {
        this.catalogoProdutos = catalogoProdutos;
    }
}
