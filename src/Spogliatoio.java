public class Spogliatoio {
    
    public Spogliatoio(){}

    public void usa(String s)
    {
        System.out.println(" ");
        System.out.println(s +" sta usando lo spogliatoio....");
        try {
            Thread.sleep((long)(Math.random() * 5000));
            
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
        System.out.println(" ");
        System.out.println(s+ " è uscito dallo spogliatoio");
    }
}
