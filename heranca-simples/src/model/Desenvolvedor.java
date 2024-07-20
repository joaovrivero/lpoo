package model;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor() {
    }

    public double getBonus() {
        // System.out.println(getSalario());
        double bonusDev = getSalario() + (getSalario() * 5/100);
        return bonusDev;
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                '}';
    }
}
