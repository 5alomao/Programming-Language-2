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
public class TestaPorta {
    public static void main(String[] args) {
        
    
        Porta por = new Porta();

        por.setCor("Marrom");
        por.setDimx(10);
        por.setDimy(5);
        por.setDimz(0.5);
        
        por.pinta("Verde");
        por.abre();
        por.fecha();
        por.pinta("Roxo");
        por.pinta("Cinza");
        
        por.mostraDados();
        
        por.alteraDimensao(20, 12, 0.3);
        
        por.pinta("Marrom Claro");
        por.abre();
        por.mostraDados();
    }
}
