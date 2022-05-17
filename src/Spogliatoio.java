public class Spogliatoio {
    
    public Spogliatoio(){}

    public void usa(String s)
    {
        System.out.println(s +" sta usando lo spogliatoio");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
        System.out.println("Lo spogliatoio è libero");
    }
}
