package br.com.classes;

public class ObservadorAtualizacao implements Observador {
    @Override
    public void atualizar() {
        System.out.println("A conta bancária foi atualizada!");
    }
}
