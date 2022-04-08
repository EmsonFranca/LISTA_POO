package segundaUnidade.Fatura;

public class fatura {
    int id;
    String descricao;
    int quantidade;
    float preco;

    void insereId(int id){
        this.id = id;
    }

    void insereDescricao(String des){
        if(descricao != null || this.descricao != "") this.descricao = des;
        else this.descricao = "Discrição invalida";
    }

    void insereQuantidade(int qtd){
        if(qtd < 0) this.quantidade = 0;
        else this.quantidade = qtd;
    }

void inserePreco(float pre){
    if(preco < 0 )this.preco = pre;
    else this.preco = pre;
}

    float calculaTotal(){

        return this.quantidade * this.preco;
    }
}
