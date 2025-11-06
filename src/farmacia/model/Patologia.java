package farmacia.model;

import java.io.Serializable;

public class Patologia implements Serializable {
    private String idPatologia;
    private String nomePatologia;

    public Patologia() {
    }

    public Patologia(String idPatologia, String nomePatologia) {
        this.idPatologia = idPatologia;
        this.nomePatologia = nomePatologia;
    }

    public String getIdPatologia() {
        return this.idPatologia;
    }

    public void setIdPatologia(String idPatologia) {
        this.idPatologia = idPatologia;
    }

    public String getNomePatologia() {
        return this.nomePatologia;
    }

    public void setNomePatologia(String nomePatologia) {
        this.nomePatologia = nomePatologia;
    }

    public String toString() {
        return "ID Patologia : " + idPatologia + "\nNome Patologia : " + nomePatologia;
    }
}