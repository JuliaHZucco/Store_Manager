package entity;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private String descricao;

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(){
        this.quantidade = quantidade;
    }

    public String setDescricao(){
        return descricao;
    }

    public void setDescricao(){
        this.descricao = descricao;
    }


}

