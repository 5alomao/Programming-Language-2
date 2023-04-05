package bancosi;

public class TesteAtualizadorContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
        System.out.println("Saldo Total: "+adc.getSaldoTotal());
    }
}