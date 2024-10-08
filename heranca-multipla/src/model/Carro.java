package model;

public class Carro extends Veiculo implements Automovel {
    private int capacidadePortaMalas;

    private String renavam;

    private String chassi;

    private String placa;

    public Carro(int i, String gasolina, String marcaCarro2, String modelo2, int i1, int i2, String placaCarro2, String chassi2) {
        super();
    }

    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas, String renavam, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String getRenavam() {
        return renavam;
    }

    @Override
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    @Override
    public String getChassi() {
        return chassi;
    }

    @Override
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "capacidadePortaMalas=" + capacidadePortaMalas +
                ", renavam='" + renavam +
                ", chassi='" + chassi +
                ", placa='" + placa +
                ", numeroDeEixos=" + getNumeroDeEixos() +
                ", propulsao=" + getPropulsao()  +
                ", marca=" + getMarca() +
                ", modelo=" + getModelo() +
                ", anoFabricacao=" + getAnoFabricacao() +
                '}';
    }
}
