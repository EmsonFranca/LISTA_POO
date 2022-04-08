package segundaUnidade.triangulo2;

public class DemoTriangulo {
     public static void main(String[] args) {
         //aloca um espaço na memoria
     Triangulo t1 = new Triangulo();
     Triangulo t2 = new Triangulo();
     Triangulo t3;
 
     t1.inicializaTrinangulo(2.5,2.5,2.5," ");
     t1.inicializaTrinangulo(2.5,2.5,2.5," ");
     t3 = t1;
     System.out.println(t1 == t2);
     System.out.println(t1 == t3);
     }
}
