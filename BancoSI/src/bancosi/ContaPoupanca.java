package bancosi;

public class ContaPoupanca extends Conta {

    void atualiza(double taxa) {
        super.deposita(this.getSaldo() * taxa * 3);
    }
}
