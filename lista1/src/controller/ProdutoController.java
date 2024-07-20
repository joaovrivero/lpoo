package controller;

import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        System.out.println(produto1);
        produto1.setNome("iPhone 12");
        System.out.println(produto1.getNome());

        Produto produto2 = new Produto("iPhone 12","Smartphone Apple com câmera de alta resolução e desempenho rápido",1.29900, 50);
        System.out.println(produto2);
        produto2.setNome("Tênis Nike Air Max");
        System.out.println(produto2.getNome());
        System.out.println(produto2);


        Produto produto3 = new Produto("iPhone 12", "Smartphone Apple com câmera de alta resolução e desempenho rápido", 1299.00, 50, 1);
        Produto produto4 = new Produto("Samsung Galaxy S21", "Smartphone Samsung com tela de alta resolução e desempenho excepcional", 999.00, 30,2);
        Produto produto5 = new Produto("Google Pixel 5", "Smartphone Google com câmera de qualidade premium e sistema Android puro", 799.00, 20,3);
        Produto produto6 = new Produto("OnePlus 9 Pro", "Smartphone OnePlus com tela AMOLED e carregamento rápido", 899.00, 25,4);
        Produto produto7 = new Produto("Xiaomi Mi 11", "Smartphone Xiaomi com processador Snapdragon e design elegante", 699.00, 40,5);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        produtos.add(produto6);
        produtos.add(produto7);
        System.out.println();
        System.out.println(produtos);
        System.out.println();
        produtos.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtos);


        Map<Integer, Produto> produtoMap = new HashMap<>();
        produtoMap.put(produto3.getId(), produto3);
        produtoMap.put(produto3.getId(), produto4);
        produtoMap.put(produto5.getId(), produto5);
        produtoMap.put(produto6.getId(), produto6);
        produtoMap.put(produto7.getId(),  produto7);

        System.out.println(produtoMap);


    }
}
