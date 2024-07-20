package model;

public class Vendedor extends Funcionario {
    public double taxaDeComissao;

    public Vendedor(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    public Vendedor(String nome, String sobrenome, double salario, double taxaDeComissao) {
        super(nome, sobrenome, salario);
        this.taxaDeComissao = taxaDeComissao;
    }

    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "taxaDeComissao=" + taxaDeComissao +
                '}';
    }

    @Override
    public int getQuantidadeDeAcoes() {
        return 0;
    }

    @Override
    public double getValorDaAcao() {
        return 0;
    }
}
