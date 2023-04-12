package bancosi;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        
        System.out.println(cc.calculaTributos());
        
        Tributavel t = cc;
        
        System.out.println(t.calculaTributos());
        
        /*
        System.out.println(t.getSaldo()); 
        Acontece um erro, pois saldo é um atributo da classe Conta com modificador protect
        Tributavel não é uma classe filha de Conta
        */
   
    }
}
