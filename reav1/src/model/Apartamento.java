package model;

public class Apartamento extends Imovel {
    private String nomeDoCondominio;

    public Apartamento() {

    }

    public Apartamento(String tipoDeLogradouro, String logradouro, Integer numero, String complemento, String bairro, String cep, String cidade, Double areaUtil, Double precoDeCotacao, Double precoDeVenda, String nomeDoCondominio) {
        super(tipoDeLogradouro, logradouro, numero, complemento, bairro, cep, cidade, areaUtil, precoDeCotacao, precoDeVenda);
        this.nomeDoCondominio = nomeDoCondominio;
    }

    @Override
    public double getITBI() {
        return this.getPrecoDeCotacao() * 0.04; // 4% para Apartamento
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "nomeDoCondominio='" + nomeDoCondominio + '\'' +
                ", tipoDeLogradouro='" + tipoDeLogradouro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", areaUtil=" + areaUtil +
                ", precoDeCotacao=" + precoDeCotacao +
                ", precoDeVenda=" + precoDeVenda +
                '}';
    }
}
