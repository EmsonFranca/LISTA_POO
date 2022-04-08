package segundaUnidade.Fatura;

public class demoFatura {
    public static void main(String[] args) {
        fatura fat = new fatura();
        fat.insereDescricao("compras");
        fat.insereId(4);
        fat.insereQuantidade(3);
        fat.inserePreco(30); 

        float resultado;
        resultado = fat.calculaTotal();
        System.out.println("sua fatura é "+resultado);
    }
}
