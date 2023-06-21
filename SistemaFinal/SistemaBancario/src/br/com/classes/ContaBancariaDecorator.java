package br.com.classes;

public abstract class ContaBancariaDecorator implements ContaBancariaInterface {

	private ContaBancariaInterface contaDecorada;

    public ContaBancariaDecorator(ContaBancariaInterface contaDecorada) {
        this.contaDecorada = contaDecorada;
    }

    @Override
    public int getNumero() {
        return contaDecorada.getNumero();
    }

    @Override
    public double getSaldo() {
        return contaDecorada.getSaldo();
    }

    @Override
    public void setSaldo(double saldo) {
        contaDecorada.setSaldo(saldo);
    }

}
