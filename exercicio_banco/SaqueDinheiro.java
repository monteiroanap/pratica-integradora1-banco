public class SaqueDinheiro implements TransacaoBancaria {

    @Override
    public void transacaoOk() {
        System.out.println("saque efetuado");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("saque nao foi efetuado");

    }
}
