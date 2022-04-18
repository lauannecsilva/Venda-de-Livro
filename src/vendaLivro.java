public class vendaLivro {
    
    private double desconto;
    private double valor_total;
    
    

    // Desconto se a forma de pagemento for PIX 
    // Acrescimo de a forma de pagamento for CARTAO
    public double formaPagamento( double valorLivro, String tipoPagamento){
        double acrescimo;

        if(tipoPagamento == "pix"){
            desconto = (5 * valorLivro) / 100;
            valor_total = valorLivro - desconto;
        }else if(tipoPagamento == "cartao"){
            acrescimo = (3 * valorLivro) / 100;
            valor_total = valorLivro + acrescimo;
        }

        return valor_total;
    }


    // Desconto por categoria de livros
    // 13% poeseia e 10% terror
    public double categoria(double valorLivro, String categoria) {
        

        if(categoria == "poesia"){
            desconto = (13 * valorLivro) / 100;
            valor_total = valorLivro - desconto;
        } else if(categoria == "terror"){
            desconto = (10 * valorLivro) / 100;
            valor_total = valorLivro - desconto;
        }

        return valor_total;
    }

    // promoção compre 1 leve 2
    public double promocao(int quantidadeLivro, double valorLivro){
       

        if(quantidadeLivro == 2){
            desconto = (50 * valorLivro) / 100;
            valor_total = valorLivro - desconto;
        }

        return valor_total;
    }

   

}
