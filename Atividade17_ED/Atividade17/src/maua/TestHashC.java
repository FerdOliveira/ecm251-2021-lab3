package maua;

public class TestHashC {
    static Integer numHash = 10;
    public static void main(String[] args) {
        Integer[] tabChaves = new Integer[] { 23, 45, 77, 11, 33, 49, 10, 4, 89, 14} ;
        Integer[] tabHash = new Integer[numHash];
        for (Integer key: tabChaves) {
            Integer hashKey = hash(key);
            while(tabHash[hashKey]!=null){
                System.out.printf("%d colidiu com chave já existente %d\n\n",key,tabHash[hashKey]);
                hashKey = rehashing(tabHash,hashKey);
            }
            tabHash[hashKey] = key;
        }
        printHash(tabHash);
    }

    public static Integer rehashing(Integer[] tabHash, Integer key){
        for (int i = key+1; i < tabHash.length; i++) {
            if(tabHash[i]==null)
                return i;
        }
        for (int i = 0; i < tabHash.length; i++) {
            if(tabHash[i]==null)
                return i;
        }
        return null;
    }

    public static Integer hash(Integer key) {
        return (key % numHash);
    }

    public static void printHash(Integer[] tabHash){
        System.out.printf("[\t");
        for(Integer key:tabHash){
            System.out.printf("%d\t",key);
        }
        System.out.printf("]");
    }
}
