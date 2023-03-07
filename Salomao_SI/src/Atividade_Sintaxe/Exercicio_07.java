/*
7) Faça um programa para calcular a média final de um aluno a partir de quatro notas
bimestrais. A média é calculada através de uma média aritmética simples (todos os bimestres
têm o mesmo peso).
Média Situação:
entre 0 e 3.49 reprovado
entre 3.5 e 6.49 recuperação
maior que 6.5 aprovado
Obs. As notas devem ser digitadas entre 0 e 10. A média deve possuir 2 casas decimais.
 */
package Atividade_Sintaxe;

import java.util.Scanner;
/**
 *
 * @author Salomão
 */
public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nota 1° Bimestre: ");
        float n1 = entrada.nextFloat();
        System.out.println("Nota 2° Bimestre: ");
        float n2 = entrada.nextFloat();
        System.out.println("Nota 3° Bimestre: ");
        float n3 = entrada.nextFloat();
        System.out.println("Nota 4° Bimestre: ");
        float n4 = entrada.nextFloat();
        
        float med = (n1+n2+n3+n4)/4;
        
        String res = String.format("%.2f",med);
        
        System.out.println("Média Final do Aluno : "+res);
        
        if(med >=0 && med < 3.5){
            System.out.println("Situação: Reprovado...");
        }else if(med >= 3.5 && med <6.5){
            System.out.println("Situação: Recuperação...");
        }else{
            System.out.println("Situação: Aprovado...");
        }
    }
}
