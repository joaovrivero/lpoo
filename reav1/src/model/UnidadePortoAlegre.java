package model;

public class UnidadePortoAlegre extends Imobiliaria {
    private Double taxaDeComissao;

    public UnidadePortoAlegre() {

    }

    public UnidadePortoAlegre(Double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    public UnidadePortoAlegre(String razaoSocial, String cnpj, Double previsaoDeFaturamento, Double taxaDeComissao) {
        super(razaoSocial, cnpj, previsaoDeFaturamento);
        this.taxaDeComissao = taxaDeComissao;
    }

    public Double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(Double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    @Override
    public double getITBI() {
        return this.getPrevisaoDeFaturamento() * 0.025; // 2,5% para Porto Alegre
    }

    @Override
    public String toString() {
        return "UnidadePortoAlegre{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", previsaoDeFaturamento=" + previsaoDeFaturamento +
                '}';
    }
}
