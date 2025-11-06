package farmacia.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Encomenda implements Serializable {
    private String idEncomenda;
    private Cliente cliente;
    private List<LinhaEncomenda> listaProdutos;
    private Date dataTransacao;

    public Encomenda(String idEncomenda, Cliente cliente, List<LinhaEncomenda> listaProdutos, Date dataTransacao) {
        this.idEncomenda = idEncomenda;
        this.cliente = cliente;
        this.listaProdutos = listaProdutos;
        this.dataTransacao = dataTransacao;
    }

    public String getIdEncomenda() {
        return this.idEncomenda;
    }

    public void setIdEncomenda(String idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<LinhaEncomenda> getListaProdutos() {
        return this.listaProdutos;
    }

    public void setListaProdutos(List<LinhaEncomenda> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Date getDataTransacao() {
        return this.dataTransacao;
    }

    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public String toString() {
        String var10000 = idEncomenda;
        return "Lista Produtos : " + var10000 + ";" + String.valueOf(cliente) + ";" + String.valueOf(listaProdutos) + ";" + String.valueOf(dataTransacao);
    }
}
