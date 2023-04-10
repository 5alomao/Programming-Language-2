/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancosi;

/**
 *
 * @author Salomão
 */
public class TesteCliente {
     public static void main(String[] args) {
        Conta c1 = new ContaPoupanca();
        Cliente cli1 = new Cliente();
        c1.objCliente = cli1;
        c1.objCliente.setNome("Paola Dias");
        System.out.println("Nome: "+c1.objCliente.getNome());
    }
}
