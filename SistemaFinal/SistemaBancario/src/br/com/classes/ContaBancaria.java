package br.com.classes;

import java.util.List;
import java.util.ArrayList;

public class ContaBancaria implements ContaBancariaInterface{
    private int numero;
    private double saldo;
    private Pessoa cliente;
    
    private List<Observador> observadores;

    public ContaBancaria() {
    	observadores = new ArrayList<>();
	}

	public ContaBancaria(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
        observadores = new ArrayList<>();
    }

    // Getters e setters
	
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

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
        notificarObservadores();
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        notificarObservadores();
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
        notificarObservadores();
    }

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar();
        }
    }
}
