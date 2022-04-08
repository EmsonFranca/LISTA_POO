package segundaUnidade.registro;

public class RegistroAcademico {
    //atributos
    String nome;
    int matricula;
    int cogiDoCurso;
    int percentualDeCobranca; // 0 a 100
    //função para inicializar
    void inicializaRegistroAcademico(String n,int m, int c,int p){
        nome = n;
        matricula = m;
        cogiDoCurso = c;
        percentualDeCobranca = p;
    }
    //calcular mensalidade
    double calculaMensalidade(){
        return (100 * cogiDoCurso * percentualDeCobranca/100.0);
    }
}
