package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class BolsaController {
    public static void main(String[] args) {

        Gerente ger1 = new Gerente("Kenpachi","Hyuga", 12000.00, 0.50);
        Gerente ger2 = new Gerente("Rangiku", "Hyuga", 12000.00, 0.50);
        Gerente ger3 = new Gerente("Tosen", "Hyuga", 12000.000,0.50);
        Gerente ger4 = new Gerente("Byakuya", "Hyuga", 12000.00,0.50);
        Gerente ger5 = new Gerente("Urahara", "Hyuga", 12000.00,0.50);
        Gerente ger6 = new Gerente("Aizen", "Hyuga", 12000.00,0.50);

        System.out.println(ger1);
        System.out.println(ger2);
        System.out.println(ger3);
        System.out.println(ger4);
        System.out.println(ger5);
        System.out.println(ger6);

        Cliente orihime = new Cliente("Orihime", "Uzumaki", "aaaa");
        Cliente rukia = new Cliente("Rukia", "Uzumaki", "aaaa");
        Cliente chad = new Cliente("Chad", "Uzumaki", "aaaa");
        ClientePessoaFisica ichigo = new ClientePessoaFisica();
        ClientePessoaFisica byakuya = new ClientePessoaFisica();
        ClientePessoaFisica renji = new ClientePessoaFisica();

        ClientePessoaJuridica ulquiorra = new ClientePessoaJuridica();
        ClientePessoaJuridica aizen = new ClientePessoaJuridica();
        ClientePessoaJuridica grimmjow = new ClientePessoaJuridica();




        List<Cliente> ClienteList = new ArrayList<>();
        ClienteList.add(ichigo);
        ClienteList.add(byakuya);
        ClienteList.add(renji);
        ClienteList.add(orihime);
        ClienteList.add(rukia);
        ClienteList.add(chad);

        Cliente cliente_mais_acoes = Collections.max(ClienteList, Comparator.comparing(Cliente::getQuantidadeDeAcoes));
        System.out.println("Contas com o maior saldo:");
        for (Cliente cliente: ClienteList) {
            if (cliente.getQuantidadeDeAcoes() >= cliente_mais_acoes.getQuantidadeDeAcoes()) {
                System.out.println(cliente);
            }
        }
    }
}
