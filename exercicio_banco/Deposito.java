import java.sql.SQLOutput;

public class Deposito implements TransacaoBancaria {

    @Override
    public void transacaoOk() {
        System.out.println("realizando deposito");
    }
    @Override
    public void transacaoNaoOk(){
        System.out.println("depoisto nao realiado");
    }

}
