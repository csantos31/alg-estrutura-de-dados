import java.util.Random;
public class TesteRandomico{
    public static void main(String args[]) {
        
        
        Random r = new Random();
        
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(10));
    }
}