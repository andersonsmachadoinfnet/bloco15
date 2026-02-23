package br.anderson.infnet.appTp3Produtos;

import br.anderson.infnet.appTp3Produtos.model.domain.Produto;
import br.anderson.infnet.appTp3Produtos.model.domain.builder.ProdutoBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTest {

    @Test
    @DisplayName("Testa Produto, campos;")
    public void testeProdutoCampos() {
        Produto produtoOrig = ProdutoBuilder.aProduto().build();
        Produto produtoDest = new Produto();

        produtoDest.setId(produtoOrig.getId());
        produtoDest.setNome(produtoOrig.getNome());
        produtoDest.setPreco(produtoOrig.getPreco());
        produtoDest.setImglink(produtoOrig.getImglink());
        produtoDest.setEan(produtoOrig.getEan());

        Assertions.assertEquals(produtoDest.getId(), produtoOrig.getId());
        Assertions.assertEquals(produtoDest.getNome(), produtoOrig.getNome());
        Assertions.assertEquals(produtoDest.getPreco(), produtoOrig.getPreco());
        Assertions.assertEquals(produtoDest.getImglink(), produtoOrig.getImglink());
        Assertions.assertEquals(produtoDest.getEan(), produtoOrig.getEan());
    }
}
