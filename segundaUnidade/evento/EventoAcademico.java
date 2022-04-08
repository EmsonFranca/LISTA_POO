package segundaUnidade.evento;

public class EventoAcademico {
    String nome;
    String local;
    int participantes;
    //construtor tem mesmo nome da classe
    EventoAcademico (String nome, String local, int participantes){
       //palavra chave this. informa qual objeto da classe
        this.nome = nome;
        this.local= local;
        this.participantes = participantes;
    }

    void mostraEvento(){
        System.out.println("Nome: "+nome);
        System.out.println("Local: "+local);
        System.out.println("Pareticipantes: "+participantes);
    }
}
