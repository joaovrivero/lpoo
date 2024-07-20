package model;

public class Gerente extends Funcionario {
    public double getBonus() {
        double bonusFunc = getSalario() + (getSalario() * 20/100);

        return bonusFunc;
    }

    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                '}';
    }
}
