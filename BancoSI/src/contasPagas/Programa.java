/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author Salomão
 */
public class Programa {
    public static void main(String[] args) {
        Conta cont1 = new Conta();
        Conta cont2 = new Conta();
        
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        
        cont1.cli = cli1;
        cont2.cli = cli2;
        
        cont1.pro = p1;
        cont2.pro = p2;
        
        cont1.cli.setNome("Salomao Junior");
        cont1.cli.setCpf("174.133.196-08");
        cont1.pro.setDescProduto("iPhone 13");
        cont1.pro.setValorProduto(4790.32);
        cont1.setIdConta(1);
        cont1.setDataPagamento("20/03/2023");
        cont1.setDataVencimento("10/04/2023");
        
        cont2.cli.setNome("Josefina Miranda");
        cont2.cli.setCpf("123.123.123-12");
        cont2.pro.setDescProduto("Samsung S22");
        cont2.pro.setValorProduto(4890.51);
        cont2.setIdConta(2);
        cont2.setDataPagamento("12/03/2023");
        cont2.setDataVencimento("20/04/2023");
        
        System.out.println("CONTAS PAGAS");
        cont1.visualizarConta();
        cont2.visualizarConta();
    }
}
