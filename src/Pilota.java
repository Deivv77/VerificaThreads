public class Pilota extends Thread  implements Comparable <Pilota>{
    /**
     * This class is for the pilot and use thread and implements Comparable
     * 
     * @param nome is the name of the pilot
     * @param tempo is the time about the pilot's race
     * @param semaforo is for the thread
     * @param spogliatoio is were the pilot go to change his dresses
     * 
     * 
     */
    private String nome;
    private long tempo;
    Semaforo uno;
    Spogliatoio s = new Spogliatoio();


      /**
     * Creates a Pilota 
     * @param nome
     * @param semaforo
     * @param spogliatoio 
     * 
     */

    public Pilota(String n,Semaforo u, Spogliatoio a)
    {
        nome = n;
        uno = u;
        s = a;
    }
  

    /**
     * @Override run()
     * 
     */
    @Override
    public void run()
    {
        uno.p();
        s.usa(nome);
        uno.v();

        this.gara();

        uno.p();
        s.usa(nome);
        uno.v();
    }

    /**
     * Gets the name about the pilot
     * @return the pilot's name
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * Calculate the time about the race of the pilot
     * @return the pilot's time in  tte race 
     */
    public long gara()
    {
        System.out.println(" ");
        System.out.println(this.getNome() + " ha iniziato la gara...");
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
        System.out.println(" ");
        System.out.println(this.getNome() + " ha finito  la gara, sta tornando nello spogliatoio");

      

        return tempo;
    }
/**
 * Gets the time about race
 * @return the time about race
 */
    public long getTempo()
    {
        return tempo;
    }
    /**
     * @Override compareTo
     * 
     */
    @Override
    public int compareTo(Pilota o) {
        
        return (int) (this.tempo - o.getTempo());
    }
}
