/*
16) Utilizando while. Entrar com uma palavra e informar quantas letras “a” possui a
palavra.
Dica:
Métodos necessário length() e substring
 */
package Atividade_Sintaxe;

import java.util.Scanner;
/**
 *
 * @author Salomão
 */
public class Exercicio_16 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int cont = 0;
        int x = 1;
        String letra;
        
        while(x!=0){
            
            System.out.println("Digite uma palavra: ");
            String palavra = entrada.nextLine();
            
            for(int y=0;y<palavra.length();y++){
                letra = palavra.substring(y,y+1);
                if(letra.equals("A") || letra.equals("a")){
                cont++;
            }
            }
            System.out.println("Palavra: "+palavra+" possui "+cont+" letra(s) 'A'");
            System.out.println("\nDeseja Continuar: 1-Sim 0-Não ");
            x = entrada.nextInt();
            cont = 0;
            palavra = entrada.nextLine();
            System.out.println("");
        }
        
        
    }
}
