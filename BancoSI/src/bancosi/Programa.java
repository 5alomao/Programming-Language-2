/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancosi;

import java.util.Scanner;

/**
 *
 * @author Salomão
 */
public class Programa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Conta minhaConta = new ContaCorrente();
        Conta outraConta = new ContaPoupanca();
                
        System.out.println("Digite um valor para depósito:");
        minhaConta.deposita(entrada.nextDouble());
        
        System.out.println("Digite um valor para saque:");
        minhaConta.saca(entrada.nextDouble());
        
        System.out.println("Digite um valor para transferencia entre contas: ");
        minhaConta.transfere(outraConta, entrada.nextDouble());
        
        System.out.println("Saldo C1: "+minhaConta.getSaldo());
        System.out.println("Saldo C2: "+outraConta.getSaldo());   
    }
}
