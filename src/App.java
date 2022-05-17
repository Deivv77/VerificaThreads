public class App {
    public static void main(String[] args) throws Exception {
        Semaforo uno = new Semaforo (2);
        Spogliatoio s = new Spogliatoio();
        Classifica c = new Classifica();


        //creazione piloti e aggiunta per la classifica
        Pilota p1 = new Pilota("Marco", uno, s);
        Pilota p2 = new Pilota("Giacomo", uno, s);
        Pilota p3 = new Pilota("Lorenzo", uno, s);
        Pilota p4 = new Pilota("Marika", uno, s);
        Pilota p5 = new Pilota("Sara", uno, s);
        Pilota p6 = new Pilota("Giovanni", uno, s);
        Pilota p7 = new Pilota("Riccardo", uno, s);
        Pilota p8 = new Pilota("Filippo", uno, s);
        Pilota p9 = new Pilota("Irene", uno, s);
        Pilota p10 = new Pilota("Valentino", uno, s);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();

        p1.gara();
        p2.gara();
        p3.gara();
        p4.gara();
        p5.gara();
        p6.gara();
        p7.gara();
        p8.gara();
        p9.gara();
        p10.gara();
       
        c.Aggiungi(p1);
        c.Aggiungi(p2);
        c.Aggiungi(p3);
        c.Aggiungi(p4);
        c.Aggiungi(p5);
        c.Aggiungi(p6);
        c.Aggiungi(p7);
        c.Aggiungi(p8);
        c.Aggiungi(p9);
        c.Aggiungi(p10);

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();
        p9.join();
        p10.join();
        
        System.out.println("FINE GARA");

        System.out.println("Classifica: ");
        c.CalcolaClassifica();

        for(int i = 0; i < c.getSize(); i++)
        {
            System.out.println(i+1  + " :" + " " + c.getPilota(i).getNome());
        }
        
    }
}
