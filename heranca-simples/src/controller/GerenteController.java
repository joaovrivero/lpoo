package controller;

import model.Gerente;

import java.text.NumberFormat;

public class GerenteController {
    public static void main(String[] args) {
        Gerente ger1 = new Gerente();
        Gerente ger2 = new Gerente("Byakuya", 10000.00);

        System.out.println(ger1);
        System.out.println(ger2);

        ger1.setSalario(8500.50);
        System.out.println(ger1);
        System.out.println("Bonus + Salário = " + NumberFormat.getCurrencyInstance().format(ger1.getBonus()));



        ger2.setSalario(9587.11);
        System.out.println(ger2);
        System.out.println("Bonus + Salário = " + NumberFormat.getCurrencyInstance().format(ger2.getBonus()));


    }
}
