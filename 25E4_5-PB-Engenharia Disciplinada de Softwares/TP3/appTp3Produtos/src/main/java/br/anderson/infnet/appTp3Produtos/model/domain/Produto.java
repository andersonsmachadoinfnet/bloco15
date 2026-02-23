package br.anderson.infnet.appTp3Produtos.model.domain;

import javax.persistence.*;

@Entity
@Table(name="Produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ean", length = 14, nullable = true)
    private String ean;
    @Column(name = "nome", length = 128, nullable = true)
    private String nome;
    private float preco;
    @Column(name = "imglink", length = 255, nullable = false)
    private String imglink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getImglink() {
        return imglink;
    }

    public void setImglink(String imglink) {
        this.imglink = imglink;
    }
}
