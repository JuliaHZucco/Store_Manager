package DAO;

public class ProdutoDAO {

    public void adicionarProduto(Produto produto) {
    String sql = "INSERT INTO produtos (nome, preco, quantidade, descricao) VALUES (?, ?, ?, ?)";

    PreparedStatement ps = null;
    
    try {
        ps = Conexao.getConexao().PrepareStatement(sql);
        ps.setString(1, produto.getNome());
        ps.setDouble(2, produto.getPreco());
        ps.setInt(3, produto.getQuantidade());
        ps.setString(4, produto.getDescricao());

        ps.execute();
        ps.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}