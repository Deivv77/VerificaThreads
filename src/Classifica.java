import java.util.ArrayList;
import java.util.Collections;

public class Classifica {
    private ArrayList <Pilota> classifica = new ArrayList <Pilota>();
    
    public Classifica(){}

    public void CalcolaClassifica()
    {
        Collections.sort(classifica);
    }

}
