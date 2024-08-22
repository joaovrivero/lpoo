package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


public class EmpresaController {
    public static void main(String[] args) {
        // b
        Casa casa1 = new Casa("Rua Arthur Hameister", "Centro", 123, "Arvore", "Centro", "12345-678", "Pelotas", 120.0, 250000.0, 270000.0, 400.0);
        Casa casa2 = new Casa("Rua Doutor Romano", "Centro", 456, "Casa", "Centro", "12345-678", "Pelotas", 100.0, 200000.0, 220000.0, 350.0);

        Apartamento apto1 = new Apartamento("Avenida Dom Joaquim", "Centro", 789, "Apto 201", "Centro", "12345-678", "Porto Alegre", 80.0, 300000.0, 320000.0, "Edifício Alpha");
        Apartamento apto2 = new Apartamento("Avenida Ferreira Viana", "Centro", 101, "Apto 301", "Centro", "12345-678", "Porto Alegre", 90.0, 350000.0, 370000.0, "Edifício Beta");

        UnidadePelotas unidadePelotas = new UnidadePelotas("Imobiliaria Pelotas", "00.000.000/0001-00", 1000000.0, 2.0){};
        UnidadePortoAlegre unidadePortoAlegre = new UnidadePortoAlegre("Imobiliaria Porto Alegre", "00.000.000/0002-00", 1500000.0, 2.5){};

        // d
        List<Casa> casas = new ArrayList<>();
        casas.add(casa1);
        casas.add(casa2);

        List<Apartamento> apartamentos = new ArrayList<>();
        apartamentos.add(apto1);
        apartamentos.add(apto2);

        List<UnidadePelotas> unidadesPelotas = new ArrayList<>();
        unidadesPelotas.add(unidadePelotas);

        List<UnidadePortoAlegre> unidadesPortoAlegre = new ArrayList<>();
        unidadesPortoAlegre.add(unidadePortoAlegre);

        System.out.println(casas);
        System.out.println(apartamentos);
        System.out.println(unidadesPelotas);
        System.out.println(unidadesPortoAlegre);

        // f
        for (Casa casa : casas) {
            double itbi = casa.getITBI();
            System.out.println("ITBI da " + casa + ": " + itbi);
        }

        for (Apartamento apto : apartamentos) {
            double itbi = apto.getITBI();
            System.out.println("ITBI do " + apto + ": " + itbi);
        }

        // g
        double previsaoPelotas = 0;
        double previsaoPortoAlegre = 0;

        for (Casa casa : casas) {
            previsaoPelotas += casa.getPrecoDeCotacao();
        }

        for (Apartamento apto : apartamentos) {
            previsaoPortoAlegre += apto.getPrecoDeCotacao();
        }

        System.out.println("Previsão de faturamento Pelotas: " + previsaoPelotas);
        System.out.println("Previsão de faturamento Porto Alegre: " + previsaoPortoAlegre);

        // h
        casas.sort(Comparator.comparingDouble(Casa::getPrecoDeCotacao).reversed());
        apartamentos.sort(Comparator.comparingDouble(Apartamento::getPrecoDeCotacao).reversed());

        System.out.println("Casas ordenadas: " + casas);
        System.out.println("Apartamentos ordenados: " + apartamentos);

        // i
        List<Imobiliaria> unidadesImobiliaria = new ArrayList<>();
        unidadesImobiliaria.add(unidadePelotas);
        unidadesImobiliaria.add(unidadePortoAlegre);

        unidadesImobiliaria.sort(Comparator.comparing(Imobiliaria::getPrevisaoDeFaturamento).reversed());

        for (Imobiliaria unidade : unidadesImobiliaria) {
            System.out.println(unidade);
        }

    }
}
