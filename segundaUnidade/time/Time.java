package segundaUnidade.time;

/**
 * Time
 */
public class Time {
    String time;//
    String jogadores[] = new String[11]; //vetor de strings
    int vitoria = 0, derrota = 0, empate = 0;//estatisticas do time

    void nomeTime (String nome){
        this.nomeTime(nome);
    }

    public void addJogador(String nome){
        int i =0;
        for (i = 0;i<6;i++) {
            if(jogadores[i] == null){
                this.jogadores[i] = nome;
                break;
            }
        }
    }
    int numeroVitoria(int nv){
        return this.vitoria += nv;
    }
    int numeroDerrto(int nd){
        return this.derrota += nd;
    }

    int numeroEmpate(int ne){
        return this.empate += ne;
    }
    void imprime(){
        int i;
        for(i = 0; i < 6; i++){
            System.out.println(jogadores[i]);
        }
    }

}