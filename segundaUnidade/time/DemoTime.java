package segundaUnidade.time;

public class DemoTime {
    public static void main(String[] args) {
        Time nome_Time = new Time();
        nome_Time.nomeTime("flamendo");
        nome_Time.addJogador("pogbar");
        nome_Time.addJogador("ronaldo");
        nome_Time.addJogador("messi");
        nome_Time.imprime();
    }
}
