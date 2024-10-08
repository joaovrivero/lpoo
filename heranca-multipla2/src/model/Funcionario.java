package model;

public abstract class Funcionario {
    private String nome;

    private Double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public abstract Double getBonus();

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
