package model;

public class UnidadePelotas extends Imobiliaria {
    private Double taxaDeComissao;

    public UnidadePelotas() {

    }

    public UnidadePelotas(Double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    public UnidadePelotas(String razaoSocial, String cnpj, Double previsaoDeFaturamento, Double taxaDeComissao) {
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
        return this.getPrevisaoDeFaturamento() * 0.02; // 2% para Pelotas
    }

    @Override
    public String toString() {
        return "UnidadePelotas{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", previsaoDeFaturamento=" + previsaoDeFaturamento +
                '}';
    }
}
