package br.com.classes;

public class ContaCorrenteFactory extends ContaFactory {
    public ContaBancaria criarConta(int numero) {
        return new ContaCorrente(numero, 1000.0);
    }
}