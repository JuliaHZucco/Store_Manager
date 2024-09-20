public class Main {
    public static void main(String[] args) throws Exception {
        Window window = new Window();

        Produto p = new Produto();
        p.setNome("Abacate");
        p.setPreco(29.40);
        p.setQuantidade(2);
        p.setDescricao("BALALALALALLA");

        new ProdutoDAO().adicionarProduto(p);
    }
}