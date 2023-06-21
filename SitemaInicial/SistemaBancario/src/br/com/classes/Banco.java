package br.com.classes;
import java.util.ArrayList;
import java.util.List;
public class Banco {
    private String nome;
    private List<ContaBancaria> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    // Métodos para manipulação de contas

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(ContaBancaria conta) {
        contas.remove(conta);
    }

    public ContaBancaria buscarConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void imprimirContas() {
        for (ContaBancaria conta : contas) {
            System.out.println("Número: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
        }
    }
}