package br.com.classes;

public class ContaPoupancaFactory extends ContaFactory {
    public ContaBancaria criarConta(int numero) {
        return new ContaPoupanca(numero, 0.05);
    }
}