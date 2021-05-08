import java.util.Random;

public class Joguinho{
    public static void main(String[] args) {
        PilhaVetor pilha = new PilhaVetor("PilhaJogo");
        Random gerador = new Random();

        do{
            if(gerador.nextInt(2)==0){
                if(!pilha.estaVazia()){
                    System.out.println(pilha.pull() + " foi empilhado");
                }
            }else{
                if(!pilha.estaCheia()){
                    pilha.push(gerador.nextInt(10));
                }
            }

        System.out.println(pilha);    
        }while(!pilha.estaVazia());
    }
    
}