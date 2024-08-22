package model;

public abstract class Imobiliaria implements Portfolio{
    protected String razaoSocial;
    protected String cnpj;
    protected Double previsaoDeFaturamento;

    public Imobiliaria() {

    }

    public Imobiliaria(String razaoSocial, String cnpj, Double previsaoDeFaturamento) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.previsaoDeFaturamento = previsaoDeFaturamento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Double getPrevisaoDeFaturamento() {
        return previsaoDeFaturamento;
    }

    public void setPrevisaoDeFaturamento(Double previsaoDeFaturamento) {
        this.previsaoDeFaturamento = previsaoDeFaturamento;
    }

    @Override
    public String toString() {
        return "Imobiliaria{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", previsaoDeFaturamento=" + previsaoDeFaturamento +
                '}';
    }
}
