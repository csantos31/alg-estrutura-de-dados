public class Recursao{
    public static int somatoria(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n+somatoria(n-1);
    }

    public static void imprimePar(int n){
        if(n==0 || n==1){
            System.out.println("\t"+n);
            return;
        }
        System.out.println("\t"+n);
        imprimePar(n-2);
    }

    public static int tribonacci(int n){
        if(n==0 || n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }

    public static void main(String[] args) {
        System.out.println("\n\tEXERCICIO SOMATORIA\n");
        System.out.println("\tSomatoria de 10 = "+somatoria(10));
        
        System.out.println("\n\tEXERCICIO IMPRIME PAR\n");
        imprimePar(10);
        
        System.out.println("\n\tEXERCICIO TRIBONACCI\n");
        
        for(int i=0;i<11;i++){
            System.out.println("\tT("+i+"): "+tribonacci(i));
        }        
    }
}