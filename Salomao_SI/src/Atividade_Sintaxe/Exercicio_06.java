/*
Faça um programa que, a partir da leitura das medidas dos lados de um retângulo
(comprimento e largura), lidos do teclado, calcule e imprima a área e o perímetro do retângulo.
A fórmula da área do retângulo é A=C*L e do perímetro P=2*C+2*L.
 */
package Atividade_Sintaxe;

import java.util.Scanner;
/**
 *
 * @author Salomão
 */
public class Exercicio_06 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Insira o comprimento do Retângulo: ");
        double com = entrada.nextDouble();
        
        System.out.println("Insira a largura do Retângulo: ");
        double larg = entrada.nextDouble();
        
        double area = com * larg;
        
        System.out.println("Área do Retângulo: "+area);
        
        double per = 2*com + 2*larg;
        
        System.out.println("Perímetro do Retângulo: "+per);
    }
}
