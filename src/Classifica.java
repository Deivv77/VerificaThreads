import java.util.ArrayList;
import java.util.Collections;

public class Classifica {
    /**
     * This class were made to create the placing about pilots
     * 
     * @param classifica
     */
    private ArrayList <Pilota> classifica = new ArrayList <Pilota>();
    
    public Classifica(){}

    /**
     * Use the method sort to sort the ArrayList
     */
    public void CalcolaClassifica()
    {
        Collections.sort(classifica);
    }

/**
 * Adds a pilot to the ArrayList
 * @param e
 */
    public void Aggiungi(Pilota e)
    {
        classifica.add(e);
    }
    /**
     * Gets the size about the ArrayList 
     * @return the size of the ArrayList
     */
    public int getSize()
    {
        return classifica.size();
    }
    /**
     * Gets the pilot about his index
     * @param indice
     * @return a pilot about his index
     */
    public Pilota getPilota(int indice)
    {
        return classifica.get(indice);
    }
}
