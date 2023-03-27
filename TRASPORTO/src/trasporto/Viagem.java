package trasporto;

public class Viagem {
    private String destino;
    private double valorKm, valorViagem, distancia;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValorKm() {
        return valorKm;
    }

    public void setValorKm(double valorKm) {
        this.valorKm = valorKm;
    }

    public double getValorViagem() {
        return valorViagem;
    }

    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    Viagem(String destino, double valorKm, double distancia){
        this.destino = destino;
        this.valorKm = valorKm;
        this.distancia = distancia;
    }
    
    void calcularViagem(){
        setValorViagem(valorKm * distancia);
    }
    
}
