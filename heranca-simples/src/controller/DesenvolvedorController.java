package controller;

import model.Desenvolvedor;

import model.Funcionario;

import java.text.NumberFormat;

public class DesenvolvedorController {
    public static void main(String[] args) {

        Desenvolvedor dev1 = new Desenvolvedor();
        Desenvolvedor dev2 = new Desenvolvedor("Gohan", 5000);

        System.out.println(dev1);
        System.out.println(dev2);

        dev1.setSalario(6500);
        System.out.println(dev1);
        System.out.println();
        System.out.println("Salário + Bonus "+ NumberFormat.getCurrencyInstance().format(dev1.getBonus()));

        System.out.println("-------------------");

        System.out.println(dev2);
        dev2.setSalario(6800);
        System.out.println(dev2);
        System.out.println();
        System.out.println("Salário + Bonus  = "+ NumberFormat.getCurrencyInstance().format(dev2.getBonus()));

    }
}
