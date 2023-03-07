/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author Salomão
 */
public class TestaAniversario {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Pessoa p = new Pessoa();
        
        p.setNome("Salomao");
        p.setIdade(19);
        System.out.println("Quantidade de aniversários futuros:");
        p.fazAniversario(entrada.nextInt());
        
        System.out.println("Nome:" +p.getNome());
        System.out.println("Idade:"+p.getIdade());
    }
}
