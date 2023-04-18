public class ContaCorrente extends Conta implements Tributavel {
    
    @Override
    void atualiza(double taxa){ 
        deposita(this.getSaldo() * taxa * 2);
    }

    @Override
    void deposita(double saldo) {
        super.deposita(saldo-1); 
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo()*0.01;
    }
    
    
}
