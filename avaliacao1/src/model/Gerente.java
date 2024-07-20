package model;

public class Gerente extends Funcionario {
    public double taxaDeBonificacao;

    public Gerente() {
        super();
    }



    public Gerente(String nome, String sobrenome, double salario, double taxaDeBonificacao) {
        super(nome, sobrenome, salario);
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    public Double taxaDeBonificacao() {
        return this.getSalario() * 0.5;
    }

    @Override
    public int getQuantidadeDeAcoes() {
        return 0;
    }

    @Override
    public double getValorDaAcao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "taxaDeBonificacao=" + taxaDeBonificacao +
                '}';
    }
}
