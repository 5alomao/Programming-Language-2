/*
11) Uma empresa de locação de veículos cobra pelo uso de seus veículos populares a partir
da seguinte regra:
 45.00 reais para cada dia de uso como custo fixo;
 0.50 centavos de real para cada quilômetro que exceder o total de quilômetros dados
de cortesia.
 A cada dia o usuário tem direito a 60 quilômetros de cortesia
 O usuário efetua o pagamento somente ao devolver o carro à empresa de locação.
Escreva um programa que leia o número de dias que o usuário ficou com o carro e a
quilometragem do mesmo e imprima o valor a ser pago.
 */
package Atividade_Sintaxe;

import java.util.Scanner;

/**
 *
 * @author Salomão
 */
public class Exercicio_11 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Número de Dias com o veículo:");
        int dias = entrada.nextInt();
        
        System.out.println("Quilometragem do carro:");
        double qntdkm = entrada.nextDouble();
        
        double vdias = dias * 45;
        double kmdisp = 60 * dias;
        double valortotal = 0;
        double vdif = 0;
        
        if(kmdisp < qntdkm){
            vdif = qntdkm - kmdisp;
            vdif = vdif * 0.5;
            valortotal = vdias + vdif;
            String res = String.format("%.2f",valortotal);
            System.out.println("Valor Total: "+res);
        }else{
            valortotal = vdias;
            String res = String.format("%.2f",valortotal);
            System.out.println("Valor a ser pago: "+res);
        }
    }
}
