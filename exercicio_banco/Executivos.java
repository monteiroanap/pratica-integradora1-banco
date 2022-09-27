public class Executivos  {
    private Deposito deposito;
    private Transferencia tranferencia;

    public Executivos(Deposito deposito, Transferencia trasferencia) {
        this.deposito = deposito;
        this.tranferencia = trasferencia;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public Transferencia getTranferencia() {
        return tranferencia;
    }
}
