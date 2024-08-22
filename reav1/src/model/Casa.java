package model;

public class Casa extends Imovel {
    private Double tamanhoDoTerreno;

    public Casa() {

    }


    public Casa(String tipoDeLogradouro, String logradouro, Integer numero, String complemento, String bairro, String cep, String cidade, Double areaUtil, Double precoDeCotacao, Double precoDeVenda, Double tamanhoDoTerreno) {
        super(tipoDeLogradouro, logradouro, numero, complemento, bairro, cep, cidade, areaUtil, precoDeCotacao, precoDeVenda);
        this.tamanhoDoTerreno = tamanhoDoTerreno;
    }

    @Override
    public double getITBI() {
        return this.getPrecoDeCotacao() * 0.03;  // para Casa
    }


    @Override
    public String toString() {
        return "Casa{" +
                "tamanhoDoTerreno=" + tamanhoDoTerreno +
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
