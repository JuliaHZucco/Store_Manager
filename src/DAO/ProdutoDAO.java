package DAO;

import conexao.Conexao;
import entity.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    public void adicionarProduto(Produto produto) {
        String sql = "INSERT INTO produtos (nome, preco, quantidade, descricao) VALUES (?, ?, ?, ?)";

        Connection conn = null; 

        try {
            conn = Conexao.getConexao(); 

            if (conn == null) {
                throw new SQLException("Falha ao conectar ao banco de dados.");
            }

            try (PreparedStatement ps = conn.prepareStatement(sql)) { 
                ps.setString(1, produto.getNome());
                ps.setDouble(2, produto.getPreco());
                ps.setInt(3, produto.getQuantidade());
                ps.setString(4, produto.getDescricao());

                ps.executeUpdate(); 
                System.out.println("Produto adicionado com sucesso.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao adicionar produto: " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.err.println("Erro ao fechar a conexão: " + e.getMessage());
                }
            }
        }
    }
}