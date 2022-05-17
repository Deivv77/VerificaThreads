import java.util.ArrayList;
import java.util.Collections;

public class Classifica {
    private ArrayList <Pilota> classifica = new ArrayList <Pilota>();
    
    public Classifica(){}

    public void CalcolaClassifica()
    {
        Collections.sort(classifica);
    }

    public void Aggiungi(Pilota e)
    {
        classifica.add(e);
    }
    public int getSize()
    {
        return classifica.size();
    }
    public Pilota getPilota(int indice)
    {
        return classifica.get(indice);
    }
}
