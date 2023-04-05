package bancosi;

public class AtualizadorDeContas {
        private double saldoTotal = 0;
        private double selic;

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    void roda(Conta c){
        System.out.println("Saldo Anterior:"+c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo Atual:"+c.getSaldo()); 
        this.saldoTotal += c.getSaldo();
    }
}
