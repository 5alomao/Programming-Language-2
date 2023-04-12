package interfaces;

public class Circulo implements AreaCalculavel {
    
    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI*raio*raio;
    }
    
}
