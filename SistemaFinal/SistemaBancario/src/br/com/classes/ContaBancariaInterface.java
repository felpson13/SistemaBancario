package br.com.classes;

public interface ContaBancariaInterface {

    int getNumero();
    double getSaldo();
    void setSaldo(double saldo);
    void depositar(double valor);
    void sacar(double valor);
    void transferir(ContaBancaria destino, double valor);
    Pessoa getCliente();
    void setCliente(Pessoa cliente);
}
