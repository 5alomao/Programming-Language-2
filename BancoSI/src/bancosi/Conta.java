package bancosi;

public class Conta {
    Cliente objCliente;
    double saldo;
    double limite;
    
    public void deposita(double saldo){ // método
        this.saldo = this.saldo +saldo;
        System.out.println("Deposito efetuado com sucesso");
    }
    
    public boolean saca(double saldo){ //método
        if(this.saldo>=saldo){
            this.saldo = this.saldo - saldo;
            System.out.println("Saque efetuado com sucesso"); 
            return true;
        }
        else{
            System.out.println("Saldo Insuficiente");
            return false;
        }  
    }
    boolean transfere(Conta c2, double saldo){
        if (this.saca(saldo) == true){
            c2.deposita(saldo);
            return true;
        }else{
            return false;
        }
    } 
}
