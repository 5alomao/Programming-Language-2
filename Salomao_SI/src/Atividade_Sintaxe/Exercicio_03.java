//3) Imprima todos os múltiplos de 5, entre 1 e 100.
package Atividade_Sintaxe;

/**
 *
 * @author Salomão
 */
public class Exercicio_03 {
    public static void main(String[] args) {
        
        for(int x=5;x<=100;x++){
            if(x%5==0){
                System.out.println(x);
            }
        }
    }
}
