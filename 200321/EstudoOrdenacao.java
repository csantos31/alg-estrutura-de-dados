import java.util.Scanner;
import java.util.Random;

public class EstudoOrdenacao{

    static void exibeVetor(int [] v, String msg){
        System.out.println("\n\t" + msg + "\n");
        for (int i=0; i<v.length; i++){
            System.out.printf("%d ", v[i]);
        }
        System.out.println();
    }    

    static void preencheVetor(int v[]){
        Random r = new Random();
        for(int i=0; i<v.length; i++){
            v[i] = r.nextInt(v.length * 10);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char continua;
        do{
            System.out.println("\n\t Digite o tamanho do vetor \n\t");
            int n = scanner.nextInt();
            int v[] = new int[n];
            exibeVetor(v, "Vetor zerado");
            preencheVetor(v);
            exibeVetor(v, "Vetor gerado");
            scanner.nextLine();
            System.out.println("\n\t Executar novamente? (S / N) \n\t");
            continua = scanner.nextLine().toUpperCase().charAt(0);

        }while(continua == 'S');
        scanner.close();
    }


}