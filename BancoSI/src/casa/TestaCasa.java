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
public class TestaCasa {
    public static void main(String[] args) {
        Casa c = new Casa();
        
        c.setCor("Amarela");
        
        c.porta1.setCor("Marrom");
        c.porta1.setCor("Marrom Escuro");
        c.porta1.setCor("Marrom Claro");
        
        c.porta1.abre();//total = 1
        c.porta3.abre();//total = 2
        
        c.porta1.setDimx(1);
        c.porta2.setDimx(1);
        c.porta3.setDimx(1);
        
        c.porta1.setDimy(2);
        c.porta2.setDimy(2);
        c.porta3.setDimy(2);
        
        c.porta3.fecha();//total = 1
        
        c.porta1.setDimz(0.4);
        c.porta2.setDimz(0.4);
        c.porta3.setDimz(0.4);
        
        c.porta2.abre();//total = 2
        
        c.mostraCasa();
    }
}
