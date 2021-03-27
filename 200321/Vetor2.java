import java.util.Scanner;

public class Vetor2{
    
    public static void main(String args[]) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\tDigite o tamanho do vetor\n\t");        
        n = scanner.nextInt();
        int v[] = new int[n];

        for(int i = 0; i<n;i++){
            System.out.print("\tDigite o valor da posição  " + i + ": ");
            v[i] = scanner.nextInt();
        }
        clearScreen();

        System.out.print("\n\n\n");
        for(int i = 0; i<n;i++){
            System.out.print("\t" +v[i] + " ");
        }
        scanner.close();
    }


    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}