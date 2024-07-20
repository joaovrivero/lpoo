package controller;

import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        System.out.println(funcionario1);
        funcionario1.setNome("João");
        funcionario1.setSalario(10000.50);
        System.out.println(funcionario1);

        Funcionario funcionario2 = new Funcionario("John", 10000.5);
        System.out.println(funcionario2);
        funcionario2.setNome("Robson");
        funcionario2.setSalario(9999.9);
        System.out.println(funcionario2);
        System.out.print(funcionario2.getNome()+" ");
        System.out.println(funcionario2.getSalario());


        Funcionario funcionario6 = new Funcionario("Emma", 8500.75, 4);
        Funcionario funcionario4 = new Funcionario("Alice", 9500.0, 2);
        Funcionario funcionario5 = new Funcionario("Bob", 12000.0, 3);
        Funcionario funcionario3 = new Funcionario("John", 10000.5, 1);
        Funcionario funcionario7 = new Funcionario("Mike", 11000.25, 5);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario6);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario7);

        System.out.println(funcionarios);

        funcionarios.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println(funcionarios);


        Map<Integer, Funcionario> funcionarioMap = new HashMap<>();
        funcionarioMap.put(funcionario6.getId(),funcionario6);
        funcionarioMap.put(funcionario6.getId(),funcionario4);
        funcionarioMap.put(funcionario5.getId(),funcionario2);
        funcionarioMap.put(funcionario3.getId(),funcionario2);
        funcionarioMap.put(funcionario7.getId(),funcionario1);
        System.out.println();
        System.out.println("Funcionário de id 3 "+funcionario5);

    }
}
