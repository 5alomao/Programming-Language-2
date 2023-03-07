/*
4) Faça um programa que leia pelo teclado um valor, em dolar, converta e imprima o mesmo
num valor em reais. Considere que $ 1.00 dolar seja equivalente a R$5.10 
*/
package Atividade_Sintaxe;

import java.util.Scanner;

/**
 *
 * @author Salomão
 */
public class Exercicio_04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Insira o valor em Dolar: ");
        double dolar = entrada.nextDouble();
        double real = 5.1;
        System.out.println("Valor em Dolar: "+dolar);
        System.out.println("Valor em Reais: "+dolar*real);
        
    }
}
