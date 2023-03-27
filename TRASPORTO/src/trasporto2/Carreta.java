package trasporto2;

public class Carreta {
    private String cor, modeloCarreta;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModeloCarreta() {
        return modeloCarreta;
    }

    public void setModeloCarreta(String modeloCarreta) {
        this.modeloCarreta = modeloCarreta;
    }
    
    Carreta(String modelo){
        this.modeloCarreta = modelo;
    }
}
