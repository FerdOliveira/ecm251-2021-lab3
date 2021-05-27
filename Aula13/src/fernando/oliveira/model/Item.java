package fernando.oliveira.model;

/**
 * Classe que representa um item armazenado no sistema
 */
public class Item {
    final public String nome;
    final public double preco;

    /**
     * Construtor do elemento item
     * @param nome
     * @param preco
     */
    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Método que representa o estado do objeto item
     * @return
     */
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
