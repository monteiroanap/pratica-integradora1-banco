public class Cobradores {
    private SaqueDinheiro saque;
    private ConsultaSaldo consultaSaldo;

    public Cobradores(SaqueDinheiro saque, ConsultaSaldo consultaSaldo) {
        this.saque = saque;
        this.consultaSaldo = consultaSaldo;
    }

    public SaqueDinheiro getSaque() {
        return saque;
    }

    public ConsultaSaldo getConsultaSaldo() {
        return consultaSaldo;
    }
}
