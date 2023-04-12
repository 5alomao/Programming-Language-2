package interfaces;

public class Teste {
    public static void main(String[] args) {
        AreaCalculavel r = new Retangulo(3, 2);
        AreaCalculavel q = new Quadrado(3);
        AreaCalculavel c = new Circulo(3);
        System.out.println("-= Área Calculada =-");
        System.out.println("Retangulo:"+r.calculaArea());
        System.out.println("Quadrado:"+q.calculaArea());
        System.out.printf("Circulo: %.2f\n",c.calculaArea());
    }
}
