package br.com.classes;

import java.util.List;

public class ClienteJuridico extends Pessoa {
    private String cnpj;

    public ClienteJuridico(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    // Getter e setter específico para cnpj

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
