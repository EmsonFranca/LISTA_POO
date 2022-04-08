package segundaUnidade.media;

public class Aluno {
    String matricula,nome;
    double nota1;
    double nota2;
    double notatrabalho;
    
    void addMatricula(String mat){
        this.matricula = mat;

    }

    void addnome(String n){
        this.nome = n;
    }

    void addNota1(double n1){
        this.nota1 = n1;

    }
    void addNota2(double n2){
        this.nota2 = n2;

    }
    void addNotaTrabaljo(double n3){
        this.notatrabalho = n3;

    }
    double media(){
        int pesototal = 7;
        return (nota1 + nota2 )* 2.5 +(notatrabalho * 2.0) /pesototal;
    }

    double provafinal(){
        if(media() < 7){
            return media() - 7;
        }
        else return media();
    }
    void showResultado(){
        String msg = "o aluno está";
        if (provafinal() == 0.0f) msg += "Aprovado";
        else msg+="Esta na quanrta prova precisando"+provafinal();
    }

}
