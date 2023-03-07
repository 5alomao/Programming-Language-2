/*
12) De forma simplificada, o IRPF Simples Anual pode ser calculado a partir das seguintes
regras, no caso de um contribuinte com anual dada:
 Caso o contribuinte ganhe até 10800.00 reais, ele está isento do pagamento

 Caso o contribuinte ganhe entre 10800.00 até 21600.00 reais, ele deve calcular o seu
IRPF Simples multiplicando sua renda por 0.15 (alíquota de 15%) e subtraindo da
multiplicação 1620.00 reais.
 Quando o contribuinte ganhar a partir de 21600.01 reais, ele deve calcular seu IRPF
Simples multiplicando sua renda por 0.275 (alíquota de 27.5%) e subtrair da
multiplicação 4320.00 reais.
Escreva um programa que leia o valor da renda de um contribuinte, imprimindo o IRPF
Simples a ser pago pelo mesmo.
 */
package Atividade_Sintaxe;

import java.util.Scanner;

/**
 *
 * @author Salomão
 */
public class Exercicio_12 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Valor de renda do Contribuinte: ");
        
        float renda = entrada.nextFloat();
        float irpf = 0;
        
        if(renda < 10800){
            System.out.println("IRPF Simples: Isento");
        }else if(renda >= 10800 && renda <=21600){
            irpf = (renda * 0.15f) - 1620;
            String res = String.format("%.2f",irpf);
            System.out.println("IRPF Simples: "+res);
        }else if(renda >= 21600.01){
            irpf = (renda * 0.275f) - 4320;
            String res = String.format("%.2f",irpf);
            System.out.println("IRPF Simples: "+res);
            
        }
    }
}
