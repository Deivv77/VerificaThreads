public class Pilota extends Thread  implements Comparable <Pilota>{
    private String nome;
    private long tempo;
    Semaforo uno;
    Spogliatoio s = new Spogliatoio();

    public Pilota(String n,Semaforo u, Spogliatoio a)
    {
        nome = n;
        uno = u;
        s = a;
    }

    @Override
    public void run()
    {
        uno.p();
        s.usa(nome);
        uno.v();
    }

    public String getNome()
    {
        return nome;
    }

    public long gara()
    {
        long inizio = System.nanoTime();
        for(int i =0 ; i< 15 ; i++)
        {
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }

        }
        long fine = System.nanoTime();
        tempo = (fine-inizio) / 1000000;

        s.usa(this.getNome());

        return tempo;
    }

    public long getTempo()
    {
        return tempo;
    }
    @Override
    public int compareTo(Pilota o) {
        
        return (int) (this.tempo - o.getTempo());
    }
}
