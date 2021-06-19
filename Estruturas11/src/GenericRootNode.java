public class GenericRootNode extends GenericNode{

    private int size;

    public GenericRootNode(int data, String path,int size) {
        super(data, path);
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }
}
