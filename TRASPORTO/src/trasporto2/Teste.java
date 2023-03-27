package trasporto2;

public class Teste {
    public static void main(String[] args) {

        Carreta carreta = new Carreta("Carreta ct-7000");
        Caminhoneiro caminhoneiro = new Caminhoneiro("João Alves","123.123.123-12","04.911.424/0001",2126.25);
        Viagem viagem = new Viagem("São Paulo",4.5,350);
        Cliente cliente = new Cliente("Pedro",caminhoneiro,viagem,carreta);
        
        Viagem viagem2 = new Viagem("Rio de Janeiro",5.5,420);
        Viagem viagem3 = new Viagem("Belo Horizonte",6.5,300);
        Viagem viagem4 = new Viagem("Minas Gerais",3.5,450);
        
        cliente.listViagem.add(viagem);
        cliente.listViagem.add(viagem2);
        cliente.listViagem.add(viagem3);
        cliente.listViagem.add(viagem4);
        
        cliente.visualizarViagem();

    }
}
