package br.com.classes;

public class ContaBancaria {
    private int numero;
    private double saldo;
    private Pessoa cliente;

    public ContaBancaria(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    // Getters e setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos para depósito e saque

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
}
