package br.com.classes;

public class ContaComTaxaDecorator extends ContaBancariaDecorator {
    private double taxa;
    private ContaBancariaInterface bancariaInterface;

    public ContaComTaxaDecorator(ContaBancariaInterface contaDecorada, double taxa) {
        super(contaDecorada);
        bancariaInterface = contaDecorada;
        this.taxa = taxa;
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = getSaldo();
        double valorComTaxa = valor + taxa;
        if (valorComTaxa <= saldoAtual) {
            setSaldo(saldoAtual - valorComTaxa);
            System.out.println("Saque realizado. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
    	double saldo = bancariaInterface.getSaldo();
        saldo += valor;
        bancariaInterface.setSaldo(saldo);
        System.out.println("Depósito realizado. Novo saldo: " + saldo);
    }

    @Override
    public void transferir(ContaBancaria destino, double valor) {
    	double saldo = getSaldo();
    	if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    @Override
    public Pessoa getCliente() {
        return bancariaInterface.getCliente();
    }

    @Override
    public void setCliente(Pessoa cliente) {
    	bancariaInterface.setCliente(cliente);
    }

}