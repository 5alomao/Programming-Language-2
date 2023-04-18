package exceptions;

public class ValorInvalidoExceptions extends Exception {

  /*
  Atenção: nem sempre é interessante criarmos um novo tipo de exception! Depende do caso. Neste aqui, seria
  melhor ainda utilizarmos IllegalArgumentException. A boa prática diz que devemos preferir usar as já existentes do
  Java sempre que possível.
  */  
  
  ValorInvalidoExceptions(double saldo){
    super("Valor Invalido:"+saldo);
  }
}
