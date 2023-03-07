/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

/**
 *
 * @author Salomão
 */
public class ConversaoTipo {
    public static void main(String[] args) {
        
        String nome = "Salomão Ferreira Junior";
        String idade = "19";
        String salario = "4000";
        
        //Conversão de Idade String para Inteiro
        int idade2 = Integer.parseInt(idade);
        idade2 = idade2+1;
        
        //Conversão do Salário String para Double
        double salario2 = Double.parseDouble(salario);
        
        System.out.println("Idade Convertida: "+idade2);
        System.out.println("Salario Convertido: "+salario2);
 
    }
}
