public class Conta {

    public String numConta;

    private double saldo;

    public void creditarSaldo(double vlr){

        saldo = saldo + vlr;

    }

    public void debitarSaldo(double vlr){

        saldo = saldo - vlr;

    }

    public void extrato(){
        //System.out.println("O Núm da conta: "+numConta+" tem o saldo de R$"+saldo);

        System.out.printf("O Núm da conta \"%s\" tem o saldo de R$ %.2f\n",numConta,saldo);
    }

}
