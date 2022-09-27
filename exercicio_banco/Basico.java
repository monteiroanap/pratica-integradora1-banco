public class Basico {
    private ConsultaSaldo consulta;
    private PagamentoServico pagamento;
    private SaqueDinheiro saque;

    public Basico(ConsultaSaldo consulta, PagamentoServico pagamento, SaqueDinheiro saque) {
        this.consulta = consulta;
        this.pagamento = pagamento;
        this.saque = saque;
    }

    public ConsultaSaldo getConsulta() {
        return consulta;
    }

    public PagamentoServico getPagamento() {
        return pagamento;
    }

    public SaqueDinheiro getSaque() {
        return saque;
    }
}
