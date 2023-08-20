package fatecfranca.lista1;
public class Produto {
    int id; // int é um tipo de dado primitivo
    String nome; // String é um tipo de dado de Classe
    int qtde; // int é um tipo de dado primitivo
    float preco; // float é um tipo de dado primitivo
    boolean estoqueCritico; // boolean é um tipo de dado primitivo
    String descricao; // String é um tipo de dado de Classe
    // outros exemplo do tipo Classe: Integer, Float, Boolean

    public Produto(){
       
    }
    public Produto(int id, String nome, String descricao, 
            int qtde, boolean estoqueCritico, float preco){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.qtde = qtde;
        this.estoqueCritico = estoqueCritico;
        this.preco = preco;
    }
    public void mostraObjeto(){
        System.out.println("Id: " + this.id + "\n Nome " + 
            this.nome + "\n Descrição " + this.descricao +
            "\n Qtde: " +this.qtde + "\n Preço " + this.preco + 
                " Estoque crítico " + 
                (this.estoqueCritico ? "Sim" : "Não"));
    }
    public void comprar(int x){
        this.qtde = qtde + x;
        System.out.println("Compra realizada com sucesso!");
    }
    public void vender(int y){
        this.qtde = qtde - y;
        if (qtde >= 0){
            System.out.println("Venda realizada com sucesso!");
            if (this.qtde <= 3){
                this.estoqueCritico = true;
            }
        }
        else {System.out.println("Venda fracassada!");}
    }
    public void aumentarPreco(float a){
        this.preco = preco + (preco * a/100);
        System.out.println(this.preco);
    }
    public void diminuirPreco(float b){
        float desconto = this.preco*b/100;
        if (desconto <= this.preco){
            this.preco = preco - desconto;
            System.out.println(this.preco);
        }
        else {
            System.out.println("Não pode ser aplicado esse desconto");
        }
    }
}