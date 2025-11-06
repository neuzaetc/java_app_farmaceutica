package farmacia.model;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String nif;
    private String nome;
    private String contato;
    private String email;
    private Morada morada;

    public Cliente() {
    }

    public Cliente(String nif, String nome, String contato, String email, Morada morada) {
        this.nif = nif;
        this.nome = nome;
        this.contato = contato;
        this.email = email;
        this.morada = morada;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return this.contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Morada getMorada() {
        return this.morada;
    }

    public void setMorada(Morada morada) {
        this.morada = morada;
    }

    public String toString() {
        String var10000 = nome;
        return "Detalhes Cliente\n\nNome: " + var10000 + "\nNif: " + nif + "\nContato: " + contato + "\nMorada: " + String.valueOf(morada) + "\nEmail: " + email;
    }
}
