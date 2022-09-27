public class PagamentoServico implements TransacaoBancaria {
    @Override
    public void transacaoOk() {
        System.out.println("pagamento concluido com sucesso");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("pagamento nao concluido");

    }
}
