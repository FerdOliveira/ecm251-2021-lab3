public class GenericNode extends Node {
    public Node parent;
    public String path;
    public GenericNode fChild;
    public GenericNode next;
    protected static int sum = 0;


    public GenericNode(int data, String path, Node parent) {
        this.data = data;
        this.path = path;
        this.parent = parent;
        this.fChild = null;
        this.next = null;
    }

    public GenericNode(int data, String path) {
        this.data = data;
        this.path = path;
        this.parent = null;
        this.fChild = null;
        this.next = null;
    }

    private static void preOrder(GenericNode node) {
        sum += node.data;
        GenericNode auxNode = node.fChild;
        while (auxNode != null) {
            preOrder(auxNode);
            auxNode = auxNode.next;
        }

    }

    public static void getSum(GenericNode node) {
        preOrder(node);
        System.out.printf("Tamanho total do diretorio: %d KB\n\n", sum);
        sum = 0;
    }
}