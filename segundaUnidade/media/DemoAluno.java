package segundaUnidade.media;

public class DemoAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.addnome("emosn");
        aluno.addMatricula("2019011368");
        aluno.addNota1(5);
        aluno.addNota2(9);
        aluno.addNotaTrabaljo(7);
        aluno.showResultado();
    }
}
