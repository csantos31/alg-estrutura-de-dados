import java.util.Random;


//int tensao, String tipo, int potencia, boolean status
public class TesteLampada{
    public static void main(String[] args) {

        Random estadoLampada = new Random();

        System.out.println("hello world");
        System.out.println(estadoLampada.nextBoolean());
        System.out.println(estadoLampada.nextBoolean());
        System.out.println(estadoLampada.nextBoolean());
        System.out.println(estadoLampada.nextBoolean());

        Lampada l1 = new Lampada(220, "Incandescente", 25, estadoLampada.nextBoolean());
    }    
}