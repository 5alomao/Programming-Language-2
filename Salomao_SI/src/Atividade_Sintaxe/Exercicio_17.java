/*
17) Utilizando o for. Desenvolva um programa que receba um número e uma letra e
mostre a letra repetida o número de vezes correspondente ao número recebido. Exemplo:
- Se informar: 12 B o resultado será BBBBBBBBBBBB
 */
package Atividade_Sintaxe;

import java.util.Scanner;

/**
 *
 * @author Salomão
 */
public class Exercicio_17 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Insira o n° de repetições e a Letra: ");
        int num = entrada.nextInt();
        String let = entrada.next();
        
        for(int x=0;x<num;x++){
            System.out.print(let);
        }
        System.out.println("");
    }   
}
