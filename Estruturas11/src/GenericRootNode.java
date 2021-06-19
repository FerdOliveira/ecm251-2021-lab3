public class GenericRootNode extends GenericNode{

    private int size;

    public GenericRootNode(int tamanho, String path,int size) {
        super(tamanho, path);
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }
}
