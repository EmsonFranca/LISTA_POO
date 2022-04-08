package segundaUnidade.registro;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        RegistroAcademico roberto = new RegistroAcademico();
        
        roberto.inicializaRegistroAcademico("Roberto", 2019012563, 3, 0);
        michael.inicializaRegistroAcademico("Michael", 2019011368, 2, 50);
       
        System.out.println("Mensalidade: "+michael.calculaMensalidade() );
        System.out.println("Mensalidade: "+roberto.calculaMensalidade());
    }
}
