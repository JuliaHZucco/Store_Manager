
public record Produto(Long id, String nome, Integer quantidade, Double valor, String descricao) {
    
    public Produto(String nome, Integer quantidade, Double valor, String descricao){
        this(null, nome, quantidade, valor, descricao);
    }
}
