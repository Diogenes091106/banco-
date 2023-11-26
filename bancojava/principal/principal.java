package principal;
import java.util.Scanner;

public class principal {
    
    /**
     * @param args
     * @param conta TODO
     * @param conta2 TODO
     */
    public static void main(String[] args, Conta conta, Conta conta2) {
        
        final Conta c = new Conta();

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Digite o número da conta: ");
            c.numConta = s.nextLine();

            System.out.print("Digite o valor para crédito: ");
            double vlrCredito = s.nextDouble();

      conta2.creditarSaldo(vlrCredito);

            c.extrato();

            System.out.print("Digite o valor para débito: ");
            double vlrDebito = s.nextDouble();

            extracted(c, vlrDebito);
        }

        c.extrato();

    }

    private static void extracted(final Conta c, double vlrDebito) {
        c.debitarSaldo(vlrDebito);
    }

    @Override
    public String toString() {
        return "Principal []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object arg0) {
        // TODO Auto-generated method stub
        return super.equals(arg0);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

}