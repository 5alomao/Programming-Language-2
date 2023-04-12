package interfaces;

public class Retangulo implements AreaCalculavel{
    
    private int largura;
    private int altura;

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    Retangulo(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return this.largura * this.altura;
    }
    
}
