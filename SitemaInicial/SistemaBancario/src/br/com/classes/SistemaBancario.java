package br.com.classes;

public class SistemaBancario {
    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco");

        ClienteFisico clienteFisico1 = new ClienteFisico("João", "123456789", "987654321");
        ClienteFisico clienteFisico2 = new ClienteFisico("Maria", "987654321", "123456789");
        ClienteJuridico clienteJuridico = new ClienteJuridico("Empresa X", "987654321");

        ContaCorrente contaCorrente1 = new ContaCorrente(1, 1000.0);
        contaCorrente1.setCliente(clienteFisico1);
        ContaCorrente contaCorrente2 = new ContaCorrente(2, 2000.0);
        contaCorrente2.setCliente(clienteFisico2);
        ContaPoupanca contaPoupanca = new ContaPoupanca(3, 0.05);
        contaPoupanca.setCliente(clienteJuridico);

        banco.adicionarConta(contaCorrente1);
        banco.adicionarConta(contaCorrente2);
        banco.adicionarConta(contaPoupanca);

        System.out.println("Informações das contas no banco:");
        banco.imprimirContas();

        System.out.println();

        System.out.println("Cliente Físico 1: " + clienteFisico1.getNome() + ", RG: " + clienteFisico1.getRg());
        System.out.println("Cliente Físico 2: " + clienteFisico2.getNome() + ", RG: " + clienteFisico2.getRg());
        System.out.println("Cliente Jurídico: " + clienteJuridico.getNome() + ", CNPJ: " + clienteJuridico.getCnpj());

        System.out.println();

        System.out.println("Depósito na conta corrente 1:");
        contaCorrente1.depositar(500.0);

        System.out.println();

        System.out.println("Saque na conta poupança:");
        contaPoupanca.sacar(200.0);

        System.out.println();

        System.out.println("Transferência entre contas:");
        contaCorrente1.transferir(contaCorrente2, 300.0);

        System.out.println();

        System.out.println("Informações das contas no banco após as operações:");
        banco.imprimirContas();
    }
}