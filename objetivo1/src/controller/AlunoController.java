package controller;

import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        System.out.println(aluno);
        System.out.println(aluno2);

        Aluno aluno3 = new Aluno(1,123456,"Ichigo","Kurosaki", "IchigoShinigami@email.com");
        Aluno aluno4 = new Aluno(2,654321,"Goku","kakaroto", "Gokukakaroto@email.com");
        System.out.println(aluno3);
        System.out.println(aluno4);

        Aluno aluno5 = new Aluno("Rukia","Kutiki", 5);
        Aluno aluno6 = new Aluno("Kempash","Zaraki",6);
        System.out.println(aluno5);
        System.out.println(aluno6);

        aluno.setNome("Rick");
        aluno.setSobrenome("Grimes");
        aluno.setId(3);
        aluno.setCpf(456789);
        aluno.setEmail("RickGrimes@twd.com");

        System.out.println("Id:"+ aluno.getId() +" Cpf:"+ aluno.getCpf() +" Nome:"+ aluno.getNome() +" Sobrenome:"+aluno.getSobrenome() +" Email:"+ aluno.getEmail());

        aluno2.setNome("Daryl");
        aluno2.setSobrenome("Dixon");
        aluno2.setId(4);
        aluno2.setCpf(987654);
        aluno2.setEmail("DarylDixon@twd.com");

        System.out.println("Id:" + aluno2.getId() + " Cpf:" + aluno2.getCpf() + " Nome:" + aluno2.getNome() + " Sobrenome:" + aluno2.getSobrenome() + " Email:" + aluno2.getEmail());


        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        alunos.sort(Comparator.comparing(Aluno::getId));
        System.out.println(alunos);

        Map<Integer,Aluno> alunoMap = new HashMap<>();
        alunoMap.put(aluno.getId(),aluno);
        alunoMap.put(aluno2.getId(),aluno2);
        alunoMap.put(aluno3.getId(),aluno3);
        alunoMap.put(aluno4.getId(),aluno4);
        alunoMap.put(aluno5.getId(),aluno5);
        alunoMap.put(aluno6.getId(),aluno6);

        System.out.println(alunoMap);
        System.out.println();
        System.out.println(aluno5);

        alunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(alunos);


    }
}
