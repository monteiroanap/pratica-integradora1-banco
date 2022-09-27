public class Transferencia implements TransacaoBancaria {

    @Override
    public void transacaoOk() {
        System.out.println("Transacao realizada com sucesso");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("transacao não realizada com sucesso");

    }
}
