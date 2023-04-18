package exceptions;

public class TestaDeposita {

  public static void main (String[] args){
  
    Conta cp = new ContaPoupanca();
    
    //cp.deposita(-100);
    //Uma IllegalArgumentException é lançada uma vez que tentamos depositar um valor inválido.
    
    try {
      cp.deposita(-100);
    }catch (IllegalArgumentException e){
      System.out.println("Você tentou depositar um valor inválido!");
    }
  }
}
