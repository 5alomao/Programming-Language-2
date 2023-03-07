package casa;

public class Casa {
    private String cor;
    Porta porta1 = new Porta(); 
    Porta porta2 = new Porta(); 
    Porta porta3 = new Porta(); 
    
    void pinta(String s){
        setCor(s);
        System.out.println("Casa pintada com sucesso ...");
    }
    int portasAbertas(){
        int abertas = 0;
        if(porta1.estaAberta() == true ){
           abertas++; 
        }
        if(porta2.estaAberta() == true ){
           abertas++; 
        }
        if(porta3.estaAberta() == true ){
           abertas++; 
        }
        return abertas;
    }
    void mostraCasa(){
        System.out.println("Cor da casa: "+this.cor);
        System.out.println("Total de portas abertas: "+portasAbertas());
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
