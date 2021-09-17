package maua;


import java.util.ArrayList;

public class TestHashB {
    static Integer numKey = 100000;
    static Integer numHash = 1000;
    public static void main(String[] args) {
        Integer[] tabKeys = new Integer[numKey];
        ArrayList<SList> tabHash = new ArrayList<>();
        //inserindo chaves de 0 a numKey
        for (int i = 0; i < numKey; i++) {
            tabKeys[i] = i;
        }
        //inicializando listas ligadas nulas para todas as posicoes
        for (int i = 0; i < numHash; i++) {
            tabHash.add(new SList());
        }

        //fazendo o hashing e armazenando as chaves na tabela associativa
        for (int i = 1; i < tabKeys.length; i++) {
            Integer hashKey = hash(tabKeys[i]);
            tabHash.get(hashKey).InsereInicio(tabKeys[i]);
        }

        for (SList list: tabHash) {
            System.out.printf("Slot %d: ",tabHash.indexOf(list));
            list.printList();
            System.out.println();
        }
    }
    public static Integer hash(Integer key) {
        return (key % numHash);
    }
}
