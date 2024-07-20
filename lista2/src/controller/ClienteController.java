package controller;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class ClienteController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println(c1);

        List <Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        System.out.println(clientes);

        clientes.sort(Comparator.comparing(Cliente::getId));

        Cliente clienteFind = (Cliente) clientes.get(
                Collections.binarySearch(
                        clientes,
                        c1,
                        Comparator.comparing(Cliente::getId)
                ));
        System.out.println(clienteFind);

        for(Cliente c : clientes){
            if(c1.getId() == c.getId()){
                System.out.println(c);
            }
        }

        Map clienteMap = new HashMap<>();
        clienteMap.put(c1.getId(), c1);
        clienteMap.put(c2.getId(), c2);

        System.out.println(clienteMap);

//não permite ordenação


        System.out.println(clienteMap.get(c1.getId()));
    }
}
