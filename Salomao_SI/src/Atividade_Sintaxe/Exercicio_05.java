/*
5) A condição física de uma pessoa pode ser medida com base no cálculo do índice de Massa
Corporal (IMC). Faça um programa que calcule o IMC com base nos dados abaixo:
IMC = PESO /(ALTURA)²
Condição IMC em (M)ulheres e (H)omens:
Abaixo do Peso:
M&lt;19,1
H&lt;20,7
Peso ideal:
Mulheres 19,1 - 25,8
Homens 20,7 - 26,4
Acima disto considere como obeso
 */
package Atividade_Sintaxe;

import java.util.Scanner;
/**
 *
 * @author Salomão
 */
public class Exercicio_05 {
    public static void main(String[] args) {
        
        float imc=0;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("[M]-Mulher\n[H]-Homem\nDigite seu Sexo:");
        String sexo = entrada.nextLine();
        
        System.out.println("Digite seu Peso: ");
        float peso = entrada.nextFloat();
        
        System.out.println("Digite sua Altura: ");
        float altura = entrada.nextFloat();
        
        imc = peso / (altura*altura);
       
        String res = String.format("%.2f", imc);
        
        if(imc < 19.1 && sexo.equals("M")){
            System.out.println("Seu IMC é: "+res);
            System.out.println("Abaixo do Peso...");
        }else if(imc < 20.7 && sexo.equals("H")){
            System.out.println("Seu IMC é: "+res);
            System.out.println("Abaixo do Peso...");
        }else if(imc >= 19.1 && imc <= 25.8 && sexo.equals("M")){
            System.out.println("Seu IMC é: "+res);
            System.out.println("Peso Ideal...");
        }else if(imc >= 20.7 && imc <= 26.4 && sexo.equals("H")){
            System.out.println("Seu IMC é: "+res);
            System.out.println("Peso Ideal...");
        }else if(imc > 26.4 && sexo.equals("H")){
            System.out.println("Seu IMC é: "+res);
            System.out.println("Obeso...");
        }else if(imc > 25.8 && sexo.equals("M")){
            System.out.println("Seu IMC é: "+res);
            System.out.println("Obeso...");
        }
    }
}
