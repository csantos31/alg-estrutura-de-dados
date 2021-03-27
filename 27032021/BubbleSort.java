import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continua;
        Date objetoDate = new Date();

        do{
            System.out.println("\n\t Digite o tamanho do vetor \n\t");
            int n = scanner.nextInt();
            int v[] = new int[n];
            preencheVetor(v);
            
            long inicio = objetoDate.getTime();
            BubbleSortMethod(v);
            long fim = objetoDate.getTime();
            System.out.println("\nTempo de ordenação para o tamanho "+n+"="+(fim-inicio) + " ms/n");
            
            scanner.nextLine();
            System.out.println("\n\t Executar novamente? (S / N) \n\t");
            continua = scanner.nextLine().toUpperCase().charAt(0);

        }while(continua == 'S');
        scanner.close();
    }    

    static void preencheVetor(int v[]){
        Random r = new Random();
        for(int i=0; i<v.length; i++){
            v[i] = r.nextInt(v.length * 10);
        }
    }

    static void BubbleSortMethod(int v[]){
        //esse laço percorre cada volta do vetor afim de alinhar o maior número na ultima posição
        for (int i=1; i<v.length; i++) {
            //esse laço joga o maior número sempre a direita
            for (int j=0; j<v.length - i; j++) {
                if (v[j] > v[j+1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1]= aux;
                }
            }
        }
    } 
}