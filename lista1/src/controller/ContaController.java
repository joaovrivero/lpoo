package controller;

import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        System.out.println(conta1);
        conta1.setSaldo(850.0);
        System.out.println(conta1.getSaldo());

        System.out.println();
        Conta conta2 = new Conta(150.0);
        System.out.println(conta2.getSaldo());
        conta2.setSaldo(800.0);
        System.out.println(conta2);

        Conta conta3 = new Conta( 3, 1000.0);
        Conta conta4 = new Conta(5, 1500.0);
        Conta conta5 = new Conta(4, 2000.0);
        Conta conta6 = new Conta(2, 800.0);
        Conta conta7 = new Conta(1, 1200.0);


        List<Conta> contas = new ArrayList<>();
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
        contas.add(conta6);
        contas.add(conta7);

        contas.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println(contas);

        Map<Integer,Conta> contaMap = new HashMap<>();
        contaMap.put(conta4.getId(),conta3);
        contaMap.put(conta4.getId(),conta4);
        contaMap.put(conta5.getId(),conta5);
        contaMap.put(conta6.getId(),conta6);
        contaMap.put(conta7.getId(),conta7);

        System.out.println(contaMap);

        System.out.println(conta3);



    }
}
