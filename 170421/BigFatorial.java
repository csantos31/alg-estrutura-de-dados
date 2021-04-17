import java.math.BigInteger;

public class BigFatorial{
    public static void main(String[] args) {
        BigInteger n = new BigInteger("15000");

        BigInteger f = BigInteger.ONE;

        for(BigInteger i = BigInteger.ONE;i.compareTo(n) != 1;i = i.add(BigInteger.ONE)){
            f = f.multiply(i);
        }

        System.out.println("/n/t"+f);
    }
}