/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Salomão
 */
public class Quadrado implements AreaCalculavel {
    
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    Quadrado(int lado){
        this.lado = lado;
    }
    
    @Override
    public double calculaArea() {
        return this.lado * this.lado;
    }
    
}
