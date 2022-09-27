public class ConsultaSaldo implements TransacaoBancaria {

    @Override
    public void transacaoOk() {
        System.out.println("saldo disponivel");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("saldo indiponivel");

    }
}
