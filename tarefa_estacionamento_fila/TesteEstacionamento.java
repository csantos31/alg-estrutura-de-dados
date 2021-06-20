public class TesteEstacionamento{
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        estacionamento.insereEntrada("VERDE");
        estacionamento.insereEntrada("CINZA");
        estacionamento.insereEntrada("VERMELHO");
        estacionamento.insereEntrada("AMARELO");

        System.out.println(estacionamento);
    }
}