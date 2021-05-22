import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class EstudoOrdenacao {
    
    //exibir um vetor
    static void exibeVetor (int [] v, String msg) {
        System.out.println("\n" + msg + "\n");
        for (int i=0; i<v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println();
    }
    static void preencheVetor (int v[]) {
        Random r = new Random();
        for (int i=0; i<v.length; i++) {
            v[i] = r.nextInt(v.length * 10);
        }
    }
    static void bubbleSort (int v[]) {
        for (int i=1; i<v.length; i++) {
            for (int j=0; j<v.length - i; j++) {
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }

    public static int partition(int A[], int p, int r){
        int i, j;
        int x=A[r];
        i=p-1;

        for(j=p;j<r;j++){
            if(A[j]<x){
                i=i+1;
                int aux = A[i];
                A[i]=A[j];
                A[j]=aux;
            }
        }
        i=i+1;
        int aux=A[i]; 
        A[i]=A[r];    
        A[r]=aux;
        return i;
    }

    public static void quickSort(int A[], int p, int r){
        if(p<r){
            int q = partition(A,p,r);
            quickSort(A,p,q-1);
            quickSort(A,q+1,r);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char continua;
        do {
            System.out.print("digite o tamanho do vetor: ");
            int n = entrada.nextInt();
            int v[] = new int[n];
            preencheVetor (v);
            // exibeVetor(v, "vetor gerado");
            long inicio = new Date().getTime();
            bubbleSort(v);
            long fim = new Date().getTime();
            System.out.println("\ntempo de ordenacao do BUBBLE para o tamanho " + n + " = " + (fim-inicio) + "ms\n");
            // exibeVetor(v, "vetor ordenado pelo BUBBLE");
            //***************************************************************************************
            
            preencheVetor(v);
            // exibeVetor(v,"Novo vetor");
            inicio = new Date().getTime();
            quickSort(v,0,n-1);
            fim = new Date().getTime();
            System.out.println("\ntempo de ordenacao do QUICK para o tamanho " + n + " = " + (fim-inicio) + "ms\n");
            // exibeVetor(v, "vetor ordenado pelo QUICK");
            

            //--> leitura do char
            System.out.print("\nexecuta novamente? (s/n) ");
            entrada.nextLine();
            continua = entrada.nextLine().toLowerCase().charAt(0);
        } while (continua == 's');
        entrada.close();
    }
}
