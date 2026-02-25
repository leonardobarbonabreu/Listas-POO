package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        //Exercício 1:
        /*Neste exercício, você deve criar uma lista de objetos da classe Cliente e utilizar a
        Stream API do Java para filtrar apenas aqueles clientes cuja idade é maior que 30
        anos. Depois, você deverá coletar esses resultados em uma nova lista e exibi-los.
        */
        
        List<Cliente> clientes = new ArrayList();
        Cliente cli1 = new Cliente("Leonardo", 18);
        Cliente cli2 = new Cliente("Paulo", 41);
        Cliente cli3 = new Cliente("Stevan", 32);

        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);
        
        List<Cliente> clientesFiltrados = clientes.stream()
                       .filter(cli -> cli.validarIdade())
                       .collect(Collectors.toList());
        for (Cliente cliente : clientesFiltrados) {
            System.out.println(cliente.getNome()
            +" "+ cliente.getIdade());
        }
        System.out.println("Exercicio 2 ----------------------------------------");
        List<Funcionario> funcionarios = new ArrayList();
        Funcionario func1 = new Funcionario("Joao",21,2000.00);
        Funcionario func2 = new Funcionario("Sara",29,3000.00);
        Funcionario func3 = new Funcionario("Paulo",52,7000.00);
        
        funcionarios.add(func1);
        funcionarios.add(func2);
        funcionarios.add(func3);

        List<Funcionario> funcionariosFiltrados = funcionarios.stream()
                          .filter(func -> func.getSalario() > 5000)
                          .sorted(Comparator.comparing(Funcionario::getSalario).reversed())
                          .collect(Collectors.toList());

        for (Funcionario func : funcionariosFiltrados) {
            System.out.println(func.getNome()
            +" "+ func.getIdade() + " " + func.getSalario());
        }        
    }
}