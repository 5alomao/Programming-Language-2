package trasporto;

public class Teste {
    public static void main(String[] args) {
        
        Carreta carreta = new Carreta("Carreta ct-7000");
        Caminhoneiro caminhoneiro = new Caminhoneiro("João Alves","123.123.123-12","04.911.424/0001",2126.25);
        Viagem viagem = new Viagem("São Paulo",4.5,350);
        Cliente cliente = new Cliente("Pedro",caminhoneiro,viagem,carreta);
        
        cliente.visualizarViagem();
    }
}
