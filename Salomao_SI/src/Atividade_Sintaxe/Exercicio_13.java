/*
Uma empresa de turismo tem a seguinte tabela de preços para pacotes turísticos para
grupos:
Número de pessoas Preço (em reais) por um dia de hospedagem
1 até 4 R$ 160,00 por pessoa
5 até 8 R$ 120,00 por pessoa
Acima de 8 R$ 80, 00 por pessoa

Escreva um programa que leia o número de pessoas que comprou o pacote, o número de dias
do pacote turístico e imprima o valor a ser pago pelo grupo.
 */
package Atividade_Sintaxe;

import java.util.Scanner;
/**
 *
 * @author Salomão
 */
public class Exercicio_13 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float hosp = 0;
        
        System.out.println("Quantidade de Pessoas: ");
        int p = entrada.nextInt();
        
        System.out.println("Número de Dias:");
        int d = entrada.nextInt();
        
        
        if(p >= 1 && p<=4){
            hosp = 160 * p * d;
            String res = String.format("%.2f",hosp);
            System.out.println("Valor a ser Pago: "+res);
        }else if(p >= 5 && p <= 8){
            hosp = 120 * p * d;
            String res = String.format("%.2f",hosp);
            System.out.println("Valor a ser Pago: "+res);
        }else if(p > 8){
            hosp = 80 * p * d;
            String res = String.format("%.2f",hosp);
            System.out.println("Valor a ser Pago: "+res);
        }
    }
}
