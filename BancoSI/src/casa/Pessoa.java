/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author Salomão
 */
public class Pessoa {
    private int idade;
    private String nome;

    void fazAniversario(int qntd){
        for(int i=0;i<qntd;i++){
            this.idade = this.idade + 1;
        }
    }
    
    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
