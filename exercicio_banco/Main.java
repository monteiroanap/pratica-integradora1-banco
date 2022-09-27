public class Main {
    public static void main(String[] args) {
        //Executivo
        Deposito d1 = new Deposito();
        Transferencia t1 = new Transferencia();
        Executivos executivos = new Executivos(d1,t1);

        executivos.getDeposito().transacaoOk();
        executivos.getDeposito().transacaoNaoOk();
        executivos.getTranferencia().transacaoNaoOk();
        executivos.getTranferencia().transacaoOk();

        //Basico
        ConsultaSaldo consultaSaldo = new ConsultaSaldo();
        PagamentoServico pagamentoServico = new PagamentoServico();
        SaqueDinheiro saqueDinheiro = new SaqueDinheiro();
        Basico basico = new Basico(consultaSaldo, pagamentoServico, saqueDinheiro);

        basico.getConsulta().transacaoOk();
        basico.getConsulta().transacaoNaoOk();
        basico.getPagamento().transacaoOk();
        basico.getPagamento().transacaoNaoOk();
        basico.getSaque().transacaoOk();
        basico.getSaque().transacaoNaoOk();

        //Cobradores
        SaqueDinheiro saqueDinheiro1 = new SaqueDinheiro();
        ConsultaSaldo consultaSaldo1 = new ConsultaSaldo();
        Cobradores cobradores = new Cobradores(saqueDinheiro1, consultaSaldo1);

        cobradores.getConsultaSaldo().transacaoOk();
        cobradores.getConsultaSaldo().transacaoNaoOk();
        basico.getSaque().transacaoOk();
        basico.getSaque().transacaoNaoOk();

    }

}
