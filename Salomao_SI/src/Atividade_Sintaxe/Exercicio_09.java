/*
9) Numa determinada região, o imposto sobre a propriedade é calculado a partir de duas
informações:
 Área total do terreno (m2)
 Área construída do terreno (m2)
O imposto é cobrado da seguinte maneira:
 R$ 5.00 para cada metro quadrado construído
 R$ 3.80 para cada metro não construído
Faça um programa que leia a área total do terreno, a área construída do terreno, calcule e
imprima o valor total a ser pago.
 */
package Atividade_Sintaxe;

import java.util.Scanner;
        
/**
 *
 * @author Salomão
 */
public class Exercicio_09 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite a Área total do terreno(m²): ");
        double atotal = entrada.nextDouble();
        
        System.out.println("Digite a Área construída do terreno(m²): ");
        double aconst = entrada.nextDouble();
        
        double avazia = atotal - aconst;
        double impconst = 5*aconst;
        double impnconst = 3.8*avazia;
        double soma = impconst+impnconst;
        
        String res1 = String.format("%.2f",impconst);
        System.out.println("Impostos sobre a Área construída: "+res1);
        String res2 = String.format("%.2f",impnconst);
        System.out.println("Impostos sobre a Área não construída: "+res2);
        String res3 = String.format("%.2f",soma);
        System.out.println("Total de Impostos a ser Pago: "+res3);
        
    }
}
