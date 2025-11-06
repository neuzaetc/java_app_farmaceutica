package farmacia.model;

import java.io.Serializable;

public class Morada implements Serializable {
    private String idMorada;
    private String endereco;
    private String codigoPostalRegiao;
    private String codigoPostalArea;
    private String localidade;
    private String concelho;
    private String pais;

    public Morada() {
    }

    public Morada(String idMorada, String endereco, String codigoPostalRegiao, String codigoPostalArea, String localidade, String concelho, String pais) {
        this.idMorada = idMorada;
        this.endereco = endereco;
        this.codigoPostalRegiao = codigoPostalRegiao;
        this.codigoPostalArea = codigoPostalArea;
        this.localidade = localidade;
        this.concelho = concelho;
        this.pais = pais;
    }

    public String getIdMorada() {
        return this.idMorada;
    }

    public void setIdMorada(String idMorada) {
        this.idMorada = idMorada;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCodigoPostalRegiao() {
        return this.codigoPostalRegiao;
    }

    public void setCodigoPostalRegiao(String codigoPostalRegiao) {
        this.codigoPostalRegiao = codigoPostalRegiao;
    }

    public String getCodigoPostalArea() {
        return this.codigoPostalArea;
    }

    public void setCodigoPostalArea(String codigoPostalArea) {
        this.codigoPostalArea = codigoPostalArea;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getConcelho() {
        return this.concelho;
    }

    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String toString() {
        return "Morada : " + endereco + "\nCodigo Postal : " + codigoPostalRegiao + "-" + codigoPostalArea + "\nLocalidade : " + localidade + "\nConcelho : " + concelho + "\nPaís : " + pais;
    }
}
