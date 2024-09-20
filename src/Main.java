import DAO.ProdutoDAO;
import entity.Produto;

public class Main {
    public static void main(String[] args) {

        Window window = new Window();

        Produto p = new Produto();
        p.setNome("Abacate");
        p.setPreco(29.40);
        p.setQuantidade(2);
        p.setDescricao("Fruta tropical rica em nutrientes");

        new ProdutoDAO().adicionarProduto(p);
    }
}