//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package farmacia.model;

import java.io.Serializable;

public class LinhaEncomenda implements Serializable {
    private ProdutoBase produtoBase;
    private int quantidade;
    private double precoUnitario;

    public LinhaEncomenda(ProdutoBase produtoBase, int quantidade, double precoUnitario) {
        this.produtoBase = produtoBase;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public ProdutoBase getProdutoBase() {
        return this.produtoBase;
    }

    public void setProdutoBase(ProdutoBase produtoBase) {
        this.produtoBase = produtoBase;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String toString() {
        String var10000 = String.valueOf(produtoBase);
        return "Linha Encomenda: " + var10000 + ";" + quantidade + ";" + precoUnitario;
    }
}
