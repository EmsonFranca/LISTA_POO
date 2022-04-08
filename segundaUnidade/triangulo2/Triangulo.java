package segundaUnidade.triangulo2;

public class Triangulo {
    double lado1;
    double lado2;
    double lado3;
    String descricao;

    void inicializaTrinangulo(double l1, double l2, double l3, String des){
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
        descricao = des;
    }

    double perimetro(){
        return (lado1 + lado2 + lado3);
    }
}
