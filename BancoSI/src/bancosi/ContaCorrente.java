package bancosi;

public class ContaCorrente extends Conta {
    
    @Override
    void atualiza(double taxa){ 
        deposita(this.getSaldo() * taxa * 2);
    }

    @Override
    void deposita(double saldo) {
        super.deposita(saldo-1); 
    }
    
    
}
