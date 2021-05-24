package linked_list_test_drive;

import fernando.oliveira.Pessoa;

import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa("Batman", "001"));
        pessoas.add(new Pessoa("Superman", "002"));
        pessoas.add(new Pessoa("Mutano", "056"));
        pessoas.addFirst(new Pessoa("Ravena", "000"));

        System.out.println("=============");
        System.out.println("Passando por todo a ListaLigada:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));
    }
}