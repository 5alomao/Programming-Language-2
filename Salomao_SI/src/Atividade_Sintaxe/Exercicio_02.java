//2) Imprima a soma de 1 até 100.
package Atividade_Sintaxe;

/**
 *
 * @author Salomão
 */
public class Exercicio_02 {
    public static void main(String[] args) {
        
        int soma = 0;
        for(int x=0;x<100;x++){
            soma=soma+1;
            System.out.println(x+" + 1 = " +soma);
        }
    }
}
