import org.junit.Test;
import org.junit.Assert;




public class vendaLivroTest { 

    double delta = 0.0;

 vendaLivro livro = new vendaLivro(); 

@Test
public void formaPagamentoTeste(){

    Assert.assertEquals(19.00, livro.formaPagamento(20.00, "pix"), delta);

    Assert.assertEquals(20.60, livro.formaPagamento(20.00, "cartao"), delta);

}

@Test
public void categoriaTeste(){

    Assert.assertEquals(17.40, livro.categoria(20.00, "poesia"), delta);

    Assert.assertEquals(18.00, livro.categoria(20.00, "terror"), delta);

}


} 

