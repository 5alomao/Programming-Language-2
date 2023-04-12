package bancosi;

public class GerenciadorDeImpostoDeRenda {
    private double total;

    public double getTotal() {
        return this.total;
    }
    
    void adiciona(Tributavel t){
        System.out.println("Adicionando tributavel: "+t);
        this.total += t.calculaTributos();
    }
}
