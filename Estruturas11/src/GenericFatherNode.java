/**
 * Classe Genérica criada para diferenciar na árvore
 */

public class GenericFatherNode extends GenericNode {

    private int size;

    public GenericFatherNode(int tamanho, String path, int size) {
        super(tamanho, path);
        this.size = size;
    }
}
