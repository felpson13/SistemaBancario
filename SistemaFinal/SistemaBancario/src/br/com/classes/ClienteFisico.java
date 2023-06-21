package br.com.classes;

public class ClienteFisico extends Pessoa {
    private String rg;
    private String cpf;

    public ClienteFisico(String nome, String cpf, String rg) {
        super(nome);
        this.rg = rg;
        this.setCpf(cpf);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
