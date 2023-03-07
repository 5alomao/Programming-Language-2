/*
14) Utilizando for. Entrar com uma palavra e informar quantas letras “a” possui a palavra.
Dicas:
String palavra = “Amanda”;
palavra.length(); // retorna o tamanho da String
palavra.substring(0,1); // retorna a primeira letra do nome Amanda = “A”
palavra.substring(1,2); // retorna a segunda letra do nome Amanda = “m”
palavra.equals(“Amanda”); // método equals é utilizado para comparar duas Strings,
retorna verdadeiro ou falso, no caso Verdadeiro
 */
package Atividade_Sintaxe;

import java.util.Scanner;

/**
 *
 * @author Salomão
 */
public class Exercicio_14 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Insira uma Palavra");
        String palavra = entrada.nextLine();
        
        int cont=0;
        String letra;
        
        for(int x=0;x<palavra.length();x++){
            letra = palavra.substring(x,x+1);
            if(letra.equals("a") || letra.equals("A")){
                cont++;
            }
        }
        System.out.println(cont);
    }
}
