public class Pilota extends Thread {
    private String nome;
    private double tempo;
    Semaforo uno;
    Spogliatoio s = new Spogliatoio();

    @Override
    public void run()
    {
        uno.p();
        s.usa(nome);
        uno.v();
    }
}
