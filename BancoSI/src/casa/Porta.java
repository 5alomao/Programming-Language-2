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
public class Porta {
    private boolean aberta = false;
    private String cor;
    private double dimx;
    private double dimy;
    private double dimz;

    
    
    void abre(){
        setAberta(true);
    }
    void fecha(){
        setAberta(false);
    }
    void pinta(String s){
        setCor(s);
        System.out.println("Porta pintada com sucesso ...");
        System.out.println("Cor atual: "+this.cor);
    }
    boolean estaAberta(){
        if(this.aberta == true)
            return true;
        else
        return false;
        
    }
    
    void alteraDimensao(double x, double y, double z){
        setDimx(x);
        setDimy(y);
        setDimz(z);
        System.out.println("Dimensoes alteradas ....");
    }
    
    void mostraDados(){
        System.out.println("=-=-=-=-=-=-=-=-");
        System.out.println("Dimensao x: "+this.dimx);
        System.out.println("Dimensao y: "+this.dimy);
        System.out.println("Dimensao z: "+this.dimz);
        
        System.out.println("Cor: "+this.cor);
        if(estaAberta()==true){
            System.out.println("Situacao: A porta está aberta...");
        }
        else
            System.out.println("Situacao: A Porta está fechada...");
        System.out.println("=-=-=-=-=-=-=-=-");
        
    }
    
    
    
    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimx() {
        return dimx;
    }

    public void setDimx(double dimx) {
        this.dimx = dimx;
    }

    public double getDimy() {
        return dimy;
    }

    public void setDimy(double dimy) {
        this.dimy = dimy;
    }

    public double getDimz() {
        return dimz;
    }

    public void setDimz(double dimz) {
        this.dimz = dimz;
    }
}
