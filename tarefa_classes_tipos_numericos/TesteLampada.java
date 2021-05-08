import java.util.Random;

public class TesteLampada{
    public static void main(String[] args) {

        Random estadoLampada = new Random();
        Lampada l1 = new Lampada(220, "Incandescente", 25, estadoLampada.nextBoolean());
        Lampada l2 = new Lampada(220, "Fluorescente", 25, estadoLampada.nextBoolean());
        Lampada l3 = new Lampada(220, "Led", 50, estadoLampada.nextBoolean());
    
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }  
      
}