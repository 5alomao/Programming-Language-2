/*
15) Capicuas são números que lidos da esquerda para a direita, e vise versa, tem o
mesmo valor. Entrar com um número e informar se este é um capicuas.
Dica:
Métodos necessário length() e substring
 */
package Atividade_Sintaxe;

import java.util.Scanner;

/**
 *
 * @author Salomão
 */
public class Exercicio_15 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Entre com um número: ");
        String num = entrada.nextLine();
        
        String teste = "";
        
        for(int i = (num.length()-1); i>=0; i--){
            teste = teste + num.charAt(i);
        }
        
        if(teste.equals(num)){
            System.out.println("O número é uma capicua!");
        }else{
            System.out.println("O número não é um capicua!");
        }
    } 
}
