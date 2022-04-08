package segundaUnidade.data;
//cria a classe
class Data {
    //variaveis
    int dia,mes,ano;
    //verifica
    boolean dataEhValida(int d, int m, int a){
        return ((d>=1) && (d<=31)&&(m>=1&&m<=12)&&(a>=1));
    }
    //inicializa 
    void inticializaData(int d, int m, int a){
        //verifica se as variaveis são validas
        if(dataEhValida(d, m, a)){
            dia = d;
            mes = m;
            ano = a;
        }
        else{
            dia = 0;
            mes = 0;
            ano = 0;
        }
    }
    //mostra
    void mostraData(){
        System.out.println(dia +  "/" +  mes + "/" + ano);
    }
}