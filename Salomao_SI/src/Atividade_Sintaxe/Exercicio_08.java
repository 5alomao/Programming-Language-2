/*
8) Uma parede em formato retangular, cuja altura é HP (altura da parede) e largura é LP
(largura da parede) precisa ser coberta por azulejos também regulares. O azulejo retangular
tem dimensões HA(altura do azulejo) e LA (largura do azulejo). Escreva um programa que leia
as quatro medidas HP, LP, HA e LA, calcule e imprima quantos azulejos com as medidas
dadas são necessários para cobrir a parede dada.
 */
package Atividade_Sintaxe;

import java.util.Scanner;
/**
 *
 * @author Salomão
 */
public class Exercicio_08 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite a Altura(metros) da Parede: ");
        float hp = entrada.nextFloat();
        
        System.out.println("Digite a Largura(metros) da Parede: ");
        float lp = entrada.nextFloat();
        
        System.out.println("Digite a Altura(metros) do Azulejo: ");
        float ha = entrada.nextFloat();
        
        System.out.println("Digite a Largura(metros) do Azulejo: ");
        float la = entrada.nextFloat();
        
        float ap = hp * lp;
        float aa = ha * la;
        float res = ap/aa;
        
        String qntd = String.format("%.2f",res);
        
        System.out.println("Quantidade de Azulejos necessários: "+qntd);
        
    }
}
