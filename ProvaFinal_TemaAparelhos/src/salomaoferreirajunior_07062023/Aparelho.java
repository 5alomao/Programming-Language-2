
package salomaoferreirajunior_07062023;

public abstract class Aparelho {
    private String marca;
    private String modelo;
    private String cor;
    private Double peso;
    private boolean estado = false;
    private boolean rede = false;
    Data dataGarantia;
    
    //Construtor
    Aparelho(String marca, String modelo, String cor, Double peso, Data dataG){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.peso = peso;
        this.dataGarantia = dataG;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean getEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getRede() {
        return rede;
    }

    public void setRede(boolean rede) {
        this.rede = rede;
    }
    
    
    
    //Métodos
    abstract void ligar();
    
    abstract void desligar();
    
    abstract void dadosAparelho();
    
    abstract void addRede();
    
    abstract void remRede();
}
