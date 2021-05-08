public class TestePilhaGenerica{
    public static void main(String[] args) {
        PilhaVetorGenerica<Carta> pilhaCartas = new PilhaVetorGenerica<>();
        
        PilhaVetorGenerica<Integer> pilhaInteiros = new PilhaVetorGenerica<>();

        Carta c1 = new Carta("Copas", "Valete");
        Carta c2 = new Carta("Espadas", "As");
        
        pilhaCartas.push(c1);
        pilhaCartas.push(c2);

        pilhaInteiros.push(23);
        pilhaInteiros.push(45);








    }
}