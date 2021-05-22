public class EstudoRecursao{
    public static int fatorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fatorial(n-1);
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        for(int i =0;i<13;i++){
            System.out.println(fatorial(i));
        }
        
        for(int i=0;i<13;i++){
            System.out.println(fibonacci(i));
        }


    }
}