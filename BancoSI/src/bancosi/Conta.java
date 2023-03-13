package bancosi;

public class Conta {
    Cliente objCliente;
    private double saldo;
    private double limite;
    private int numero;
    private static int totalContas;
    
    
    
    Conta(){
        System.out.println("Construindo uma conta");
        Conta.totalContas = Conta.totalContas + 1; //contador de contas criadas
    }
    
    Conta(double saldo){
        this(); //invocar o construtor padrão
        this.saldo = saldo;
    }
    
    Conta(double saldo,int numero){
        this(saldo); // invocar o construtor anterior
        this.numero = numero; 
    }
    
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
    
    public static int getTotalContas() {
        return Conta.totalContas;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
